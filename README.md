# Better Enchant Names

A client-side Minecraft mod that enhances enchantment names with color-coded rarity indicators and visual symbols, making it easier to identify valuable enchantments at a glance.

## 🎯 Features

- **Color-coded rarity system** - Each enchantment displays with a color that indicates its rarity
- **Visual rarity symbols** - Distinct symbols for each rarity tier
- **Client-side only** - Works on any server without requiring server-side installation

## 🎨 Rarity System

### Rarity Tiers

| Rarity | Symbol | Color | Description |
|--------|---------|-------|-------------|
| Common | ● | White | Basic enchantments and low levels |
| Uncommon | ♦ | Green | Mid-tier enchantments |
| Rare | ■ | Blue | Valuable enchantments |
| Very Rare | ★ | Purple | High-tier enchantments |
| Legendary | ◆ | Gold | Top-tier enchantments |
| Curse | ✖ | Red | Curse enchantments |

### Examples

- `● Sharpness I` - Common (White)
- `♦ Sharpness II` - Uncommon (Green)
- `■ Sharpness III` - Rare (Blue)
- `★ Efficiency IV` - Very Rare (Purple)
- `◆ Swift Sneak III` - Legendary (Gold)
- `✖ Curse of Binding` - Curse (Red)

## 🔧 Installation

### Requirements
- **Minecraft 1.21.9**
- **Fabric Loader 0.16.14+**
- **Fabric API 0.131.0+**
- **Java 21+**

### Steps
1. Install [Fabric Loader](https://fabricmc.net/use/installer/)
2. Download [Fabric API](https://modrinth.com/mod/fabric-api)
3. Download the latest `enchantment-rarities-1.1.1.jar` from releases
4. Place both JAR files in your `.minecraft/mods` folder
5. Launch Minecraft with the Fabric profile

## 🎮 Usage

Once installed, the mod automatically enhances all enchantment names in:
- Item tooltips
- Enchanting table previews
- Anvil interfaces
- Any other location where enchantment names appear

No configuration required - it works out of the box!


### Current Rarity Logic

The mod includes thoughtful rarity assignments for all enchantments:

- **Protection enchantments**: Common at low levels, uncommon at max level
- **Damage enchantments**: Progressive rarity increase with level
- **Utility enchantments**: Varied based on usefulness (e.g., Silk Touch is always rare)
- **Special enchantments**: Mending is very rare, Swift Sneak is legendary
- **Curses**: Always displayed as curse rarity

## 🏗️ Building from Source

### Prerequisites
- **Java 21+**
- **Git**

## 🤝 Contributing

Contributions are welcome! Feel free to:
- Report bugs or issues
- Suggest new features
- Submit pull requests with improvements
- Share rarity configuration ideas

## 📝 License

This project is licensed under CC0-1.0 - see the LICENSE file for details.

## 🔗 Compatibility

- **Client-side only** - no server installation required
- **Compatible with most other mods**
- **Works on vanilla servers**
- **Fabric mod loader required**

## 📊 Supported Enchantments

The mod includes rarity mappings for all vanilla Minecraft enchantments:

### Armor Enchantments
- Protection (I-IV)
- Fire/Blast/Projectile Protection (I-IV)
- Feather Falling (I-IV)
- Respiration (I-III)
- Aqua Affinity (I)
- Thorns (I-III)
- Depth Strider (I-III)
- Frost Walker (I-II)
- Soul Speed (I-III)
- Swift Sneak (I-III)

### Weapon Enchantments
- Sharpness (I-V)
- Smite (I-V)
- Bane of Arthropods (I-V)
- Knockback (I-II)
- Fire Aspect (I-II)
- Looting (I-III)
- Sweeping Edge (I-III)

### Tool Enchantments
- Efficiency (I-V)
- Fortune (I-III)
- Silk Touch (I)

### Bow Enchantments
- Power (I-V)
- Punch (I-II)
- Flame (I)
- Infinity (I)

### Crossbow Enchantments
- Multishot (I)
- Piercing (I-IV)
- Quick Charge (I-III)

### Trident Enchantments
- Channeling (I)
- Impaling (I-V)
- Loyalty (I-III)
- Riptide (I-III)

### Fishing Rod Enchantments
- Luck of the Sea (I-III)
- Lure (I-III)

### Universal Enchantments
- Unbreaking (I-III)
- Mending (I)

### Curses
- Curse of Binding (I)
- Curse of Vanishing (I)

---
