package top.cfti.enchantmentrarities;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnchantmentRaritiesClient implements ClientModInitializer {
	private static final Logger LOGGER = LoggerFactory.getLogger("enchantment-rarities");

	@Override
	public void onInitializeClient() {
		LOGGER.info("Enchantment Rarities client initialized - enhancing your enchantment experience!");
	}
}