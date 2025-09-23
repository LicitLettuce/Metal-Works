# Metal Works Changelog

## 1.2.0 "The Big Update"

### Additions
- Added Mage Golem
  - The Mage Golem is a new golem type that is made with 2 Rose Gold Blocks and 1 Pumpkin
  - It does not go after entities, instead it blocks hostile mob spawns within a 32 block radius by default which includes:
    - Monster Spawners
    - Most Hostile Entities
    - Spawn Eggs
    - Wither Spawns (Yes, Wither Spawns)
    - Portal Spawns (Zombified Piglins)
    - Zombification of Villagers (Dissapear)
    - Zombification of Piglins/Hoglins (Dissapear)

  - It does not block the spawns of the following:
    - Phantoms
    - Hoglins
- Added Cassiterite
    - A new bluish stone type with a block family similar to granite, diorite, and andesite.
    - Cassiterite generates between y-level 0 to 120 in the following biomes
      - Stony Peaks
      - Jagged Peaks
      - Frozen Peaks
- Added Cassiterite Tin Ore
- Added Nether Tin Ore
  - Drops 2-6 Tin Nuggets
  - Generates in Nether Waste Biomes between y-level 0 to 128
- Tin Blocks now weather like Copper Blocks
    - Tin weathers in 3 stages: tarnished, corroded, and eroded.
    - As tin weathers, it slowly turns more purple.
    - Tin weathers 75% the speed of copper, making it slightly slower.
    - Tin blocks can be waxed and unwaxed with honeycombs and axes, respectively.
    - Unwaxed weathered tin blocks can be scraped back to the previous stage of weathering.
- Added Tin Tiles
- Added Tin Tile Stairs
- Added Tin Tile Slabs
- Added Tin Horse Armor
    - Tin Horse Armor has 4 protection points (1 less than iron).
- Added Bronze Doors
- Added Bronze Trapdoors
- Added Medium Weighted Pressure Plate
  - Outputs 1 redstone signal for every 5 entities on top of it
  - Made from Rose Gold
- Added Looping Pressure Plate
    - Activates when stepped on
    - Loops between on and off when an entity is standing on it
- Added Rose Gold Mosaic
- Added Mage Fire
    - Mage fire can be created when Flint and Steel is used on Rose Gold Blocks
    - Mage Fire is a new pink flame variant that can be crafted into torches, lanterns, tin lanterns, and campfires.
- Added Rose Powder
    - Rose Powder is the crafting ingredient used to make Mage Fire items
    - Crafted from one Gunpowder and one Rose Gold Nugget
### Changes
- Changed Rose Lantern center texture to be opaque
  - The center texture is now opaque to prevent rendering errors 
- Changed Block of Raw Tin texture
- Rose Gold Beetroots now have a 40% chance to give the player Regeneration upon consumption
- __Tin Ore Generation has now been overhauled__
  - Tin ore generates between y-level -10 to 10
  - Extra tin ore generates in larger amounts between y-level -10 to 255 in the following biomes
    - Stony Peaks
    - Jagged Peaks
    - Frozen Peaks
  - Tin Ore will generate as Cassiterite Tin Ore when it generates in Cassiterie clumps
  - Tin Lantern texture framerate has been updated, now being identical to traditional Lanterns
### Removed
- Cut Tin Wall
- Cut Tin Pressure Plate
- Cut Tin Button
> **Note:** I removed these because they did not fit the direction of the mod. They felt like filler blocks added for the sake of variety, without much purpose. – *Lettuce*
### Translations
- Added the following translations:

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
