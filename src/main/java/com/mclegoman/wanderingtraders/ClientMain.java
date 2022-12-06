package com.mclegoman.wanderingtraders;

import com.mclegoman.wanderingtraders.registry.Placeholders;
import net.fabricmc.api.ClientModInitializer;
public class ClientMain implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        Placeholders.LOGGER.info(Placeholders.PREFIX + "Initializing Client!");

    }
}
