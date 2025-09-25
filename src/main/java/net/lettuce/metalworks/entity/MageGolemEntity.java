package net.lettuce.metalworks.entity;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.registry.MWParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.AbstractGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

public class MageGolemEntity extends AbstractGolem {
    public MageGolemEntity(EntityType<? extends AbstractGolem> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    private int golemLevel = 0;

    public int getGolemLevel() {
        return golemLevel;
    }

    public final AnimationState idleAnimationState = new AnimationState();

    @Override
    public void tick() {
        super.tick();

        if (!this.level().isClientSide) {
            updateLevelFromBlocks();
        }

        if (this.level().isClientSide()) {
            if (this.getDeltaMovement().horizontalDistanceSqr() < 1.0E-6) {
                this.idleAnimationState.startIfStopped(this.tickCount);
            } else {
                this.idleAnimationState.stop();
            }
        }
    }

    private void updateLevelFromBlocks() {
        int radius = 3;
        int powerBlocks = 0;

        BlockPos pos = this.blockPosition();

        for (BlockPos checkPos : BlockPos.betweenClosed(
                pos.offset(-radius, -radius, -radius),
                pos.offset(radius, radius, radius))) {

            if (this.level().getBlockState(checkPos).is(BlockTags.ENCHANTMENT_POWER_PROVIDER)) {
                powerBlocks++;
            }
        }

        if (powerBlocks >= 18) {
            golemLevel = 3;
        } else if (powerBlocks >= 9) {
            golemLevel = 2;
        } else if (powerBlocks >= 3) {
            golemLevel = 1;
        } else {
            golemLevel = 0;
        }
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new LookAtPlayerGoal(this, Player.class, 3f));
        this.goalSelector.addGoal(1, new RandomLookAroundGoal(this));
    }

    @Override
    public void aiStep() {
        super.aiStep();

        if (this.level().isClientSide) {
            double offsetX = (this.random.nextDouble() - 0.5D) * this.getBbWidth();
            double offsetY = this.random.nextDouble() * this.getBbHeight();
            double offsetZ = (this.random.nextDouble() - 0.5D) * this.getBbWidth();

            this.level().addParticle(
                    MWParticles.MAGE_FLAME.get(),
                    this.getX() + offsetX,
                    this.getY() + offsetY,
                    this.getZ() + offsetZ,
                    0, 0.01, 0
            );
            if (this.level().isClientSide) {
                BlockPos golemPos = this.blockPosition();

                for (int dx = -3; dx <= 3; dx++) {
                    for (int dy = -3; dy <= 3; dy++) {
                        for (int dz = -3; dz <= 3; dz++) {
                            BlockPos checkPos = golemPos.offset(dx, dy, dz);

                            if (this.level().getBlockState(checkPos).is(BlockTags.ENCHANTMENT_POWER_PROVIDER)) {
                                if (this.level().random.nextInt(16) == 0) {
                                    this.level().addParticle(
                                            ParticleTypes.ENCHANT,
                                            checkPos.getX() + 0.5,
                                            checkPos.getY() + 1.75,
                                            checkPos.getZ() + 0.5,
                                            this.getX() - (checkPos.getX() + 0.5),
                                            this.getY() + this.getBbHeight() * 0.5 - (checkPos.getY() + 1.75),
                                            this.getZ() - (checkPos.getZ() + 0.5)
                                    );
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static AttributeSupplier.Builder createAttributes() {
        return AbstractGolem.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 15D)
                .add(Attributes.MOVEMENT_SPEED, 0.25)
                .add(Attributes.ATTACK_DAMAGE, 2f)
                .add(Attributes.KNOCKBACK_RESISTANCE, 2f)
                .add(Attributes.FOLLOW_RANGE, 16.0);
    }

    @Override
    @Nullable
    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return SoundEvents.IRON_GOLEM_HURT;
    }

    @Override
    protected ResourceLocation getDefaultLootTable() {
        return new ResourceLocation(MetalWorks.MOD_ID, "entities/mage_golem");
    }

    @Override
    @Nullable
    protected SoundEvent getDeathSound() {
        return SoundEvents.IRON_GOLEM_DEATH;
    }

    @Mod.EventBusSubscriber(modid = MetalWorks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public class ModTargetingEvents {

        @SubscribeEvent
        public static void onEntityJoin(EntityJoinLevelEvent event) {
            if (!(event.getEntity() instanceof Monster monster)) return;

            monster.targetSelector.addGoal(2,
                    new NearestAttackableTargetGoal<>(monster, MageGolemEntity.class, true));
        }
    }
}

