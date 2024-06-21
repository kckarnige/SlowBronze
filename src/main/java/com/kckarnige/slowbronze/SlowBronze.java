package com.kckarnige.slowbronze;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kckarnige.slowbronze.item.ModItems;

public class SlowBronze implements ModInitializer {
	public static final String MOD_ID = "slowbronze";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}