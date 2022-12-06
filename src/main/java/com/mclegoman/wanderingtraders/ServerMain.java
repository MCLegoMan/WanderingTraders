package com.mclegoman.wanderingtraders;

import com.mclegoman.wanderingtraders.registry.Placeholders;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class ServerMain implements ModInitializer {
    public static boolean legolibInstalled = false;

    @Override
    public void onInitialize() {
        Placeholders.LOGGER.info(Placeholders.PREFIX + "Initializing Server!");

        FabricLoader.getInstance().getModContainer("legolib").ifPresent(
                modContainer -> {
                    legolibInstalled = true;
                });
    }
}
