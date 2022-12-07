/*
    WanderingTraders v1.0.1
    https://github.com/MCLegoMan/WanderingTraders

    Author: Daniel-Tayden Larsen (MCLegoMan)
    License: MCLM-OSL (2022)
*/

package com.mclegoman.wanderingtraders.registry;

import com.mclegoman.wanderingtraders.config.Configs;
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
    public static Boolean DEBUG;
    public static String TRADE_TYPE;

    public static void registerConfigs(){
        Placeholders.LOGGER.info(Placeholders.PREFIX + "Registering Configs");
        Configs.register();
        if(Configs.DEBUG.equalsIgnoreCase("true")){
            DEBUG = true;
        } else {
            DEBUG = false;
        }
        if(Configs.TRADE_TYPE.equalsIgnoreCase("vanilla")){
            TRADE_TYPE = "vanilla";
        } else if(Configs.TRADE_TYPE.equalsIgnoreCase("custom")){
            TRADE_TYPE = "custom";
        }
        else {
            TRADE_TYPE = "disable";
        }
    }
}
