package top.cfti.betterenchantnames;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterEnchantNamesClient implements ClientModInitializer {
	private static final Logger LOGGER = LoggerFactory.getLogger("better-enchant-names");

	@Override
	public void onInitializeClient() {
		LOGGER.info("Better Enchant Names client initialized - enhancing your enchantment experience!");
	}
}