/*
    WanderingTraders v1.0.1
    https://github.com/MCLegoMan/WanderingTraders

    Author: Daniel-Tayden Larsen (MCLegoMan)
    License: MCLM-OSL (2022)
*/

package com.mclegoman.wanderingtraders;

import com.mclegoman.wanderingtraders.config.Configs;
import com.mclegoman.wanderingtraders.registry.Placeholders;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class ServerMain implements ModInitializer {
    public static boolean legolibInstalled = false;
    @Override
    public void onInitialize() {
        Placeholders.LOGGER.info(Placeholders.PREFIX + "Initializing Server!");
        Configs.register();
        FabricLoader.getInstance().getModContainer("legolib").ifPresent(
                modContainer -> {
                    legolibInstalled = true;
                });
    }
}
