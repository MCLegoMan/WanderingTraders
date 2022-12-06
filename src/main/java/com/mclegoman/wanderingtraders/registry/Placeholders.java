package com.mclegoman.wanderingtraders.registry;

import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Placeholders {
    public static final Logger LOGGER = LoggerFactory.getLogger(Placeholders.ID);
    public static final String ID = "wanderingtraders";
    public static final String NAME = "Wandering Traders";
    public static final String PREFIX = "[" + Placeholders.NAME + "] ";
    public static final ModContainer CONTAINER = FabricLoader.getInstance().getModContainer(Placeholders.ID).get();
}
