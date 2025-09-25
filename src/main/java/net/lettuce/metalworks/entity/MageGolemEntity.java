package net.lettuce.metalworks.entity;

import net.lettuce.metalworks.core.MetalWorks;
import net.lettuce.metalworks.registry.MWParticles;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
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

    public final AnimationState idleAnimationState = new AnimationState();

    @Override
    public void tick() {
        super.tick();

        if (this.level().isClientSide()) {
            if (this.getDeltaMovement().horizontalDistanceSqr() < 1.0E-6) {
                this.idleAnimationState.startIfStopped(this.tickCount);
            } else {
                this.idleAnimationState.stop();
            }
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
            for (int i = 0; i < 1; i++) {
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
            }
        }
    }

    public static AttributeSupplier.Builder createAttributes() {
        return AbstractGolem.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 30D)
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
