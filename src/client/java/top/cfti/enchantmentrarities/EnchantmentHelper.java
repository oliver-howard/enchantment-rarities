package top.cfti.enchantmentrarities;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public class EnchantmentHelper {
    public enum EnchantmentRarity {
        COMMON(Formatting.WHITE, "●"),
        UNCOMMON(Formatting.GREEN, "♦"),
        RARE(Formatting.BLUE, "■"),
        VERY_RARE(Formatting.LIGHT_PURPLE, "★"),
        LEGENDARY(Formatting.GOLD, "◆"),
        CURSE(Formatting.RED, "✖");

        private final Formatting color;
        private final String symbol;

        EnchantmentRarity(Formatting color, String symbol) {
            this.color = color;
            this.symbol = symbol;
        }

        public Formatting getColor() {
            return color;
        }

        public String getSymbol() {
            return symbol;
        }
    }

    public enum EnchantmentType {
        WEAPON("", "Weapon"),
        ARMOR("", "Armor"),
        TOOL("", "Tool"),
        BOW("", "Bow"),
        CROSSBOW("", "Crossbow"),
        TRIDENT("", "Trident"),
        FISHING_ROD("", "Fishing"),
        UNIVERSAL("", "Universal"),
        CURSE("", "Curse");

        private final String symbol;
        private final String name;

        EnchantmentType(String symbol, String name) {
            this.symbol = symbol;
            this.name = name;
        }

        public String getSymbol() {
            return symbol;
        }

        public String getName() {
            return name;
        }
    }

    private static final Map<String, EnchantmentRarity> RARITY_MAP = new HashMap<>();
    private static final Map<String, EnchantmentType> TYPE_MAP = new HashMap<>();

    static {
        // Granular rarity system - each enchantment+level combination
        // Format: "enchantment_id:level" -> rarity

        // Armor enchantments
        // Protection
        RARITY_MAP.put("minecraft:protection:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:protection:2", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:protection:3", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:protection:4", EnchantmentRarity.UNCOMMON);

        // Fire Protection
        RARITY_MAP.put("minecraft:fire_protection:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:fire_protection:2", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:fire_protection:3", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:fire_protection:4", EnchantmentRarity.RARE);

        // Feather Falling
        RARITY_MAP.put("minecraft:feather_falling:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:feather_falling:2", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:feather_falling:3", EnchantmentRarity.RARE);
        RARITY_MAP.put("minecraft:feather_falling:4", EnchantmentRarity.VERY_RARE);

        // Blast Protection
        RARITY_MAP.put("minecraft:blast_protection:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:blast_protection:2", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:blast_protection:3", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:blast_protection:4", EnchantmentRarity.RARE);

        // Projectile Protection
        RARITY_MAP.put("minecraft:projectile_protection:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:projectile_protection:2", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:projectile_protection:3", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:projectile_protection:4", EnchantmentRarity.RARE);

        // Respiration
        RARITY_MAP.put("minecraft:respiration:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:respiration:2", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:respiration:3", EnchantmentRarity.RARE);

        // Aqua Affinity
        RARITY_MAP.put("minecraft:aqua_affinity:1", EnchantmentRarity.UNCOMMON);

        // Thorns
        RARITY_MAP.put("minecraft:thorns:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:thorns:2", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:thorns:3", EnchantmentRarity.RARE);

        // Depth Strider
        RARITY_MAP.put("minecraft:depth_strider:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:depth_strider:2", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:depth_strider:3", EnchantmentRarity.RARE);

        // Frost Walker
        RARITY_MAP.put("minecraft:frost_walker:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:frost_walker:2", EnchantmentRarity.RARE);

        // Soul Speed
        RARITY_MAP.put("minecraft:soul_speed:1", EnchantmentRarity.RARE);
        RARITY_MAP.put("minecraft:soul_speed:2", EnchantmentRarity.VERY_RARE);
        RARITY_MAP.put("minecraft:soul_speed:3", EnchantmentRarity.LEGENDARY);

        // Swift Sneak
        RARITY_MAP.put("minecraft:swift_sneak:1", EnchantmentRarity.RARE);
        RARITY_MAP.put("minecraft:swift_sneak:2", EnchantmentRarity.VERY_RARE);
        RARITY_MAP.put("minecraft:swift_sneak:3", EnchantmentRarity.LEGENDARY);


        // Melee Weapon enchantments
        // Sharpness
        RARITY_MAP.put("minecraft:sharpness:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:sharpness:2", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:sharpness:3", EnchantmentRarity.RARE);
        RARITY_MAP.put("minecraft:sharpness:4", EnchantmentRarity.VERY_RARE);
        RARITY_MAP.put("minecraft:sharpness:5", EnchantmentRarity.LEGENDARY);

        // Smite
        RARITY_MAP.put("minecraft:smite:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:smite:2", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:smite:3", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:smite:4", EnchantmentRarity.RARE);
        RARITY_MAP.put("minecraft:smite:5", EnchantmentRarity.VERY_RARE);

        // Bane of Arthropods
        RARITY_MAP.put("minecraft:bane_of_arthropods:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:bane_of_arthropods:2", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:bane_of_arthropods:3", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:bane_of_arthropods:4", EnchantmentRarity.RARE);
        RARITY_MAP.put("minecraft:bane_of_arthropods:5", EnchantmentRarity.VERY_RARE);
        
        // Knockback
        RARITY_MAP.put("minecraft:knockback:1", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:knockback:2", EnchantmentRarity.RARE);    

        // Fire Aspect
        RARITY_MAP.put("minecraft:fire_aspect:1", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:fire_aspect:2", EnchantmentRarity.RARE);

        // Looting
        RARITY_MAP.put("minecraft:looting:1", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:looting:2", EnchantmentRarity.RARE);
        RARITY_MAP.put("minecraft:looting:3", EnchantmentRarity.VERY_RARE);

        // Sweeping Edge
        RARITY_MAP.put("minecraft:sweeping_edge:1", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:sweeping_edge:2", EnchantmentRarity.RARE);
        RARITY_MAP.put("minecraft:sweeping_edge:3", EnchantmentRarity.VERY_RARE);

        // Breach
        RARITY_MAP.put("minecraft:breach:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:breach:2", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:breach:3", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:breach:4", EnchantmentRarity.RARE);

        // Density
        RARITY_MAP.put("minecraft:density:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:density:2", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:density:3", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:density:4", EnchantmentRarity.RARE);
        RARITY_MAP.put("minecraft:density:5", EnchantmentRarity.VERY_RARE);

        // Wind Burst
        RARITY_MAP.put("minecraft:wind_burst:1", EnchantmentRarity.RARE);
        RARITY_MAP.put("minecraft:wind_burst:2", EnchantmentRarity.VERY_RARE);
        RARITY_MAP.put("minecraft:wind_burst:3", EnchantmentRarity.LEGENDARY);


        // Bow enchantments
        // Power
        RARITY_MAP.put("minecraft:power:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:power:2", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:power:3", EnchantmentRarity.RARE);
        RARITY_MAP.put("minecraft:power:4", EnchantmentRarity.VERY_RARE);
        RARITY_MAP.put("minecraft:power:5", EnchantmentRarity.LEGENDARY);

        // Punch
        RARITY_MAP.put("minecraft:punch:1", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:punch:2", EnchantmentRarity.RARE);

        // Flame
        RARITY_MAP.put("minecraft:flame:1", EnchantmentRarity.UNCOMMON);

        // Infinity (always rare regardless of level)
        RARITY_MAP.put("minecraft:infinity:1", EnchantmentRarity.RARE);


        // Tool Enchantments
        // Efficiency
        RARITY_MAP.put("minecraft:efficiency:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:efficiency:2", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:efficiency:3", EnchantmentRarity.RARE);
        RARITY_MAP.put("minecraft:efficiency:4", EnchantmentRarity.VERY_RARE);
        RARITY_MAP.put("minecraft:efficiency:5", EnchantmentRarity.LEGENDARY);

        // Silk Touch (always rare regardless of level)
        RARITY_MAP.put("minecraft:silk_touch:1", EnchantmentRarity.RARE);

        // Fortune
        RARITY_MAP.put("minecraft:fortune:1", EnchantmentRarity.RARE);
        RARITY_MAP.put("minecraft:fortune:2", EnchantmentRarity.VERY_RARE);
        RARITY_MAP.put("minecraft:fortune:3", EnchantmentRarity.LEGENDARY);


        // Fishing Rod Enchantments
        // Luck of the Sea 
        RARITY_MAP.put("minecraft:luck_of_the_sea:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:luck_of_the_sea:2", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:luck_of_the_sea:3", EnchantmentRarity.RARE);

        // Lure
        RARITY_MAP.put("minecraft:lure:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:lure:2", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:lure:3", EnchantmentRarity.RARE);


        // Trident Enchantments
        // Channeling
        RARITY_MAP.put("minecraft:channeling:1", EnchantmentRarity.UNCOMMON);

        // Impaling
        RARITY_MAP.put("minecraft:impaling:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:impaling:2", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:impaling:3", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:impaling:4", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:impaling:5", EnchantmentRarity.RARE);

        // Loyalty
        RARITY_MAP.put("minecraft:loyalty:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:loyalty:2", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:loyalty:3", EnchantmentRarity.RARE);

        // Riptide
        RARITY_MAP.put("minecraft:riptide:1", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:riptide:2", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:riptide:3", EnchantmentRarity.RARE);


        // Crossbow Enchantments
        // Multishot
        RARITY_MAP.put("minecraft:multishot:1", EnchantmentRarity.UNCOMMON);

        // Piercing
        RARITY_MAP.put("minecraft:piercing:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:piercing:2", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:piercing:3", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:piercing:4", EnchantmentRarity.RARE);

        // Quick Charge
        RARITY_MAP.put("minecraft:quick_charge:1", EnchantmentRarity.COMMON);
        RARITY_MAP.put("minecraft:quick_charge:2", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:quick_charge:3", EnchantmentRarity.RARE);


        // "Anything" enchantments
        // Unbreaking
        RARITY_MAP.put("minecraft:unbreaking:1", EnchantmentRarity.UNCOMMON);
        RARITY_MAP.put("minecraft:unbreaking:2", EnchantmentRarity.RARE);
        RARITY_MAP.put("minecraft:unbreaking:3", EnchantmentRarity.VERY_RARE);

        // Mending
        RARITY_MAP.put("minecraft:mending:1", EnchantmentRarity.VERY_RARE);      
                
        // Curses
        RARITY_MAP.put("minecraft:binding_curse:1", EnchantmentRarity.CURSE);
        RARITY_MAP.put("minecraft:vanishing_curse:1", EnchantmentRarity.CURSE);


        // Type mappings
        // Weapon enchantments
        TYPE_MAP.put("minecraft:sharpness", EnchantmentType.WEAPON);
        TYPE_MAP.put("minecraft:smite", EnchantmentType.WEAPON);
        TYPE_MAP.put("minecraft:bane_of_arthropods", EnchantmentType.WEAPON);
        TYPE_MAP.put("minecraft:knockback", EnchantmentType.WEAPON);
        TYPE_MAP.put("minecraft:fire_aspect", EnchantmentType.WEAPON);
        TYPE_MAP.put("minecraft:looting", EnchantmentType.WEAPON);
        TYPE_MAP.put("minecraft:sweeping_edge", EnchantmentType.WEAPON);

        // Armor enchantments
        TYPE_MAP.put("minecraft:protection", EnchantmentType.ARMOR);
        TYPE_MAP.put("minecraft:fire_protection", EnchantmentType.ARMOR);
        TYPE_MAP.put("minecraft:blast_protection", EnchantmentType.ARMOR);
        TYPE_MAP.put("minecraft:projectile_protection", EnchantmentType.ARMOR);
        TYPE_MAP.put("minecraft:respiration", EnchantmentType.ARMOR);
        TYPE_MAP.put("minecraft:aqua_affinity", EnchantmentType.ARMOR);
        TYPE_MAP.put("minecraft:thorns", EnchantmentType.ARMOR);
        TYPE_MAP.put("minecraft:feather_falling", EnchantmentType.ARMOR);
        TYPE_MAP.put("minecraft:depth_strider", EnchantmentType.ARMOR);
        TYPE_MAP.put("minecraft:frost_walker", EnchantmentType.ARMOR);
        TYPE_MAP.put("minecraft:soul_speed", EnchantmentType.ARMOR);
        TYPE_MAP.put("minecraft:swift_sneak", EnchantmentType.ARMOR);

        // Tool enchantments
        TYPE_MAP.put("minecraft:efficiency", EnchantmentType.TOOL);
        TYPE_MAP.put("minecraft:fortune", EnchantmentType.TOOL);
        TYPE_MAP.put("minecraft:silk_touch", EnchantmentType.TOOL);

        // Bow enchantments
        TYPE_MAP.put("minecraft:power", EnchantmentType.BOW);
        TYPE_MAP.put("minecraft:punch", EnchantmentType.BOW);
        TYPE_MAP.put("minecraft:flame", EnchantmentType.BOW);
        TYPE_MAP.put("minecraft:infinity", EnchantmentType.BOW);

        // Crossbow enchantments
        TYPE_MAP.put("minecraft:piercing", EnchantmentType.CROSSBOW);
        TYPE_MAP.put("minecraft:quick_charge", EnchantmentType.CROSSBOW);
        TYPE_MAP.put("minecraft:multishot", EnchantmentType.CROSSBOW);

        // Trident enchantments
        TYPE_MAP.put("minecraft:loyalty", EnchantmentType.TRIDENT);
        TYPE_MAP.put("minecraft:impaling", EnchantmentType.TRIDENT);
        TYPE_MAP.put("minecraft:riptide", EnchantmentType.TRIDENT);
        TYPE_MAP.put("minecraft:channeling", EnchantmentType.TRIDENT);

        // Fishing rod enchantments
        TYPE_MAP.put("minecraft:luck_of_the_sea", EnchantmentType.FISHING_ROD);
        TYPE_MAP.put("minecraft:lure", EnchantmentType.FISHING_ROD);

        // Universal enchantments
        TYPE_MAP.put("minecraft:unbreaking", EnchantmentType.UNIVERSAL);
        TYPE_MAP.put("minecraft:mending", EnchantmentType.UNIVERSAL);

        // Curses
        TYPE_MAP.put("minecraft:binding_curse", EnchantmentType.CURSE);
        TYPE_MAP.put("minecraft:vanishing_curse", EnchantmentType.CURSE);
    }

    public static EnchantmentRarity getRarity(RegistryEntry<Enchantment> enchantment, int level) {
        String id = enchantment.getKey().map(key -> key.getValue().toString()).orElse("");
        String key = id + ":" + level;
        
        // Look up the specific enchantment:level combination
        EnchantmentRarity rarity = RARITY_MAP.get(key);
        
        // If not found, default to common
        return rarity != null ? rarity : EnchantmentRarity.COMMON;
    }

    public static EnchantmentType getType(RegistryEntry<Enchantment> enchantment) {
        String id = enchantment.getKey().map(key -> key.getValue().toString()).orElse("");
        return TYPE_MAP.getOrDefault(id, EnchantmentType.UNIVERSAL);
    }

    public static Text createEnhancedName(Text originalName, RegistryEntry<Enchantment> enchantment, int level) {
        EnchantmentRarity rarity = getRarity(enchantment, level);
        EnchantmentType type = getType(enchantment);
        
        MutableText enhancedName = Text.empty();
        
        // Add rarity symbol (only if not empty)
        if (!rarity.getSymbol().isEmpty()) {
            enhancedName.append(Text.literal(rarity.getSymbol() + " ").formatted(rarity.getColor()));
        }
        
        // Add type symbol (only if not empty)
        if (!type.getSymbol().isEmpty()) {
            enhancedName.append(Text.literal(type.getSymbol() + " ").formatted(Formatting.GRAY));
        }
        
        // Add the original enchantment name with rarity color
        if (originalName instanceof MutableText) {
            enhancedName.append(((MutableText) originalName).formatted(rarity.getColor()));
        } else {
            enhancedName.append(Text.literal(originalName.getString()).formatted(rarity.getColor()));
        }
        
        return enhancedName;
    }
}