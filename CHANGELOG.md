# Changelog - July 28, 2025

## Version 1.1.1 - July 28, 2025

### Fixed
- **Protection Enchantments**: Revised rarities for better game balance
  - Protection II: Common → Uncommon
  - Protection III: Uncommon → Rare  
  - Protection IV: Uncommon → Very Rare

## Version 1.1.0 - July 28, 2025

### Added
- **New Mace Enchantments**: Added support for 1.21+ mace enchantments
  - Breach (I-IV): Common to Rare progression
  - Density (I-V): Common to Very Rare progression
  - Wind Burst (I-III): Rare to Legendary progression

### Changed
- **Major Enchantment Rebalancing**: Adjusted rarities across all enchantment categories for improved progression

#### Armor Enchantments
- **Fire Protection**: Level II downgraded to Common, Level IV upgraded to Rare
- **Feather Falling**: Levels II-IV upgraded (II: Common→Uncommon, III: Common→Rare, IV: Uncommon→Very Rare)
- **Blast Protection**: Level IV upgraded to Rare
- **Projectile Protection**: Levels III-IV upgraded (III: Common→Uncommon, IV: Uncommon→Rare)
- **Respiration**: Level I downgraded to Common
- **Thorns**: All levels downgraded one tier (I: Uncommon→Common, II: Rare→Uncommon, III: Very Rare→Rare)
- **Depth Strider**: Level III upgraded to Rare
- **Frost Walker**: Level II upgraded to Rare
- **Soul Speed**: All levels upgraded significantly (I: Uncommon→Rare, II: Rare→Very Rare, III: Rare→Legendary)
- **Swift Sneak**: Levels I-II downgraded (I: Very Rare→Rare, II: Legendary→Very Rare)

#### Melee Weapon Enchantments
- **Sharpness**: Major rarity progression overhaul (III: Uncommon→Rare, IV: Rare→Very Rare, V: Rare→Legendary)
- **Smite**: Level II downgraded to Common, Levels IV-V upgraded (IV: Uncommon→Rare, V: Rare→Very Rare)
- **Bane of Arthropods**: Level II downgraded to Common, Levels IV-V upgraded (IV: Uncommon→Rare, V: Rare→Very Rare)
- **Looting**: Level III upgraded to Very Rare
- **Sweeping Edge**: All levels upgraded one tier

#### Ranged Weapon Enchantments
- **Power**: Major progression overhaul (II: Common→Uncommon, III: Uncommon→Rare, IV: Uncommon→Very Rare, V: Rare→Legendary)
- **Infinity**: Downgraded from Very Rare to Rare

#### Tool Enchantments
- **Efficiency**: Rebalanced progression (I: Uncommon→Common, IV: Rare→Very Rare, V: Rare→Legendary)
- **Fortune**: All levels upgraded significantly (I: Uncommon→Rare, II: Rare→Very Rare, III: Rare→Legendary)

#### Fishing Rod Enchantments
- **Luck of the Sea**: Levels I-II downgraded (I: Uncommon→Common, II: Rare→Uncommon)
- **Lure**: Levels I-II downgraded (I: Uncommon→Common, II: Rare→Uncommon)

#### Trident Enchantments
- **Loyalty**: Level I downgraded to Common, Level III upgraded to Rare

#### Crossbow Enchantments
- **Piercing**: Levels I-II downgraded to Common
- **Quick Charge**: Levels I-II downgraded (I: Uncommon→Common, II: Rare→Uncommon)

#### Universal Enchantments
- **Unbreaking**: Level II upgraded to Rare, Level III upgraded to Very Rare

### Files Modified
- `src/client/java/top/cfti/enchantmentrarities/EnchantmentHelper.java`: Major enchantment rarity rebalancing
- `gradle.properties`: Version bump to 1.1.1