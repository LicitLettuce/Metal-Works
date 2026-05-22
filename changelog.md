# Metal Works Changelog

## 1.2.0 "Tarnish and Theurgy Update"

### Additions
- __Added Mage Golem__
  - The Mage Golem is a new golem type made with 2 Rose Gold Blocks and 1 Pumpkin.
  - It does not attack entities. Instead, it prevents hostile mob spawns within a radius of 8-64 blocks.
  - The Mage Golem's radius depends on the amount of enchanting power within a 3-block radius of itself.
  - Use bookshelves and Mage Fire items to increase its strength!
  - By default, it blocks the following:
    - Monster Spawners
    - Most Hostile Entities
    - Wither Spawns (Yes, Wither Spawns)
    - Portal Spawns (Zombified Piglins)
    - Villager Zombification
    - Piglin/Hoglin Zombification
    - Spawn Eggs for Any Blocked Spawn (i.e. Zombie, Skeleton, Creeper)
  - It does not block the following spawns by default:
    - Phantoms
    - Wardens
    - Hoglins
    - Illagers
  - Mage Golems drop 1-2 Rose Gold Ingots when killed.
  - Monsters will attack Mage Golems, even though Mage Golems do not attack back.
  - The radius of blocked spawns can be increased with enchanting power from the following:
    - Bookshelves
    - Mage Fire Blocks
    - Any block under the tag minecraft:enchantment_power_provider
  > **Note:** Config options for spawn prevention are in the works. – *Lettuce*
- __Added Crude Bronze and Crude Rose Gold__
  - Crude Bronze is crafted with 4 Raw Copper and 4 Raw Tin.
  - Crude Bronze can be smelted into Bronze Ingots.
  - Crude Rose Gold is a new intermediate alloy used to craft Rose Gold Ingots.
- __Added Cassiterite__
  - A new bluish stone type with a block family similar to granite, diorite, and andesite.
  - Cassiterite generates between y-level 0 to 120 in the following biomes:
    - Stony Peaks
    - Jagged Peaks
    - Frozen Peaks
  - Cassiterite can be smelted into Tin Ingots, making it useful to mine in large quantities.
- __Added Nether Tin Ore__
  - Drops 2-6 Tin Nuggets.
  - Generates in Nether Wastes between y-level 0 to 128.
- __Tin Blocks now weather like Copper Blocks__
  - Tin weathers into Tarnished Tin.
  - When Tin blocks tarnish, they become slightly harder and much more blast resistant, making them excellent for protecting builds.
  - Tin weathers at 75% the speed of copper, making it slightly slower.
  - Tin blocks can be waxed and unwaxed with honeycombs and axes, respectively.
  - Unwaxed weathered tin blocks can be scraped back to the previous stage of weathering.
- __Added Tin Tiles__
- __Added Tin Tile Stairs__
- __Added Tin Tile Slabs__
- __Added Tin Horse Armor__
  - Tin Horse Armor has 4 protection points, which is 1 less than Iron Horse Armor.
- __Added Bronze Doors__
- __Added Bronze Trapdoors__
- __Added Medium Weighted Pressure Plate__
  - Outputs 1 redstone signal for every 5 entities standing on top of it.
  - Made from Rose Gold.
- __Added Looping Pressure Plate__
  - Activates when stepped on.
  - Loops between on and off while an entity is standing on it.
- __Added Rose Gold Mosaic__
- __Added Mage Fire__
  - Mage Fire can be created by using Flint and Steel on Rose Gold Blocks.
  - Mage Fire is a new pink flame variant that can be crafted into torches, lanterns, tin lanterns, and campfires.
- __Added Rose Powder__
  - Rose Powder is the crafting ingredient used to make Mage Fire items.
  - Crafted from 1 Blaze Powder and 9 Rose Gold Nuggets.
- __Added Lost Citadel__
  - The Lost Citadel is a new structure found in soul sand valleys.
  - It is an ancient structure made of new Soul Brick blocks.
  - Inside, you can find treasure chests, Suspicious Soul Soil, and Wither Skeletons guarding the ruins in Tin Armor.
- __Added New Armor Trims__
  - Tanrish (Found in The Lost Citadel)
  - Ethos (Found in The Lost Citadel)
- __Added New Music Disc__
  - Ancients By LicitLettuce (Found in The Lost Citadel)



### Global Loot Additions
- __Added New Loot Modifiers__
  - Tin: Found in most village chests, dungeons, and early loot tables.
  - Bronze: Found in dungeons, strongholds, bastions, and village blacksmiths.
  - Rose Gold: Found in mansions, strongholds, and bastions.
- Exact loot spawn percentages can be found on the Wiki page.

### Changes
- __Changed Rose Lantern center texture to be opaque__
  - The center texture is now opaque to prevent rendering errors.
- __Changed Block of Raw Tin texture__
- __Rose Gold Beetroots now have a 40% chance to give the player Regeneration upon consumption__
- __Tin Ore Generation has now been overhauled__
  - Tin ore generates between y-level -10 to 10.
  - Extra tin ore generates in larger amounts between y-level -10 to 255 in the following biomes:
    - Stony Peaks
    - Jagged Peaks
    - Frozen Peaks
- __Tin Lantern texture framerate has been updated, now matching traditional Lanterns__
- __Bronze Bars now have a solid edge texture__

### Config Additions
- __Configuration has been added to Metal Works!__
  - Creative tab configurations:
    - populateVanillaTabs
      - If true, Metal Works items will be added to existing vanilla Creative Mode tabs.
    - tinVariantTab
      - If true, a separate Creative Mode tab will be created for Weathered & Waxed Tin Blocks.
> **Note:** I am planning to add more configuration options in the future, including options that allow players to customize equipment values. – *Lettuce*

### Removed
- Cut Tin Wall
- Cut Tin Pressure Plate
- Cut Tin Button
> **Note:** I removed these because they did not fit the direction of the mod. They felt like filler blocks added for the sake of variety, without much purpose. – *Lettuce*
## 1.1.3

### Additions
- Added Bronze Nugget
- Added Bronze Tile Stairs and Slab
- All armor sets can now be trimmed

### Changes
- Updated Rose Gold Armor textures
- Updated Bronze Armor textures
- Updated Tin Shingle textures
- Renamed Rose Lamp to Rose Lantern
- Updated Tin Nugget texture

## 1.1.2

> **Note:** Skipped for unknown reasons — likely an oversight. :( – *Lettuce*

## 1.1.1

### Translations
- Added the following translations:
    - English (UK, Australia, Canada, New Zealand)
    - Spanish (Spain, Mexico, Uruguay, Venezuela, Argentina, Chile, Ecuador)
    - French (France, Canada)
    - German (Germany)
    - Russian (Russia)

### Fixes
- Fixed game-breaking tag bugs (tags were misnamed).
- Removed a music disc tag that broke jukebox functionality.
    - *Credits to Im_Dolos & Rololow for reporting these bugs.*

## 1.1.0

### Additions
- Added Tin Shingles
- Added Tin Shingle Stairs
- Added Tin Shingle Slab
- Added Bronze Tiles
- Added two new paintings:
    - "Market" and "Prison" (based on early gallery photos).

### Changes
- New texture for Raw Tin
- New texture for Block of Raw Tin
- New texture for Bronze Shingles
- Updated Creative Tab ordering

## 1.0.11

### Fixes
- Crafting a bronze axe will no longer output a bronze pickaxe

## 1.0.1

### Fixes
- Fixed durability values for all armor sets
- Fixed Creative Tab bugs

## 1.0.0 Initial Release
**Metal Works** is a vanilla-styled mod that adds three unique metals, each with distinct functions. No metal is strictly superior — each one complements different playstyles. Depending on how you play, your hotbar may feature tools crafted from multiple materials.

### Additions

#### Tin
- Found deep in the Overworld where Stone meets Deepslate.
- A common material with dense ore drops.
- Tin tools are weaker than Iron but lighter and faster, offering higher swing speed.
- Can be used to craft Tin Armor, tools, and a wide variety of decorative blocks:
    - Cut Tin, Tin Shingles, Tin Grates
    - Tin Doors & Trapdoors
    - Tin Lanterns (larger than vanilla lanterns)

#### Bronze
- A sturdy alloy crafted with 4 Tin + 4 Copper in a crafting table.
- Bronze gear is between Iron and Diamond in strength:
    - Stronger than Iron, with greater durability.
    - Fire-resistant, like real-world bronze — it does not burn like Netherite.
- Can be used in both tools and decorative blocks:
    - Bronze Shingles, Tiles, Grates, and Bars

#### Rose Gold
- A shiny alloy crafted with 4 Gold + 4 Copper in a crafting table.
- Similar to Iron in strength, but with:
    - Higher efficiency
    - Better enchantability
    - Greater durability
- Rose Gold Nuggets + Beetroot = Rose Gold Beetroots (a food item superior to Golden Carrots).
- Can also be combined with Prismarine Crystals to craft Rose Lamps.
