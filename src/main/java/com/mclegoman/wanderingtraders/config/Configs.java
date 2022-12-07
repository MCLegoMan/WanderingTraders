/*
    WanderingTraders v1.0.2
    https://github.com/MCLegoMan/WanderingTraders

    Author: Daniel-Tayden Larsen (MCLegoMan)
    License: MCLM-OSL (2022)
*/

package com.mclegoman.wanderingtraders.config;

import com.mclegoman.wanderingtraders.registry.Placeholders;
import com.mojang.datafixers.util.Pair;

public class Configs {
    public static SimpleConfig CONFIG;
    private static ConfigProvider configs;

    public static String TRADE_TYPE;
    public static String DEBUG;

    public static void register() {
        configs = new ConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(Placeholders.ID + "_config").provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addComment("WanderingTraders v1.0.2");
        configs.addComment("https://github.com/MCLegoMan/WanderingTraders");
        configs.addLineBreak();
        configs.addComment("Author: Daniel-Tayden Larsen (MCLegoMan)");
        configs.addComment("License: MCLM-OSL (2022)");
        configs.addLineBreak();
        configs.addLineBreak();
        configs.addComment("IMPORTANT: Make sure you have formatted this config correctly!");
        configs.addComment("TradeTypes: \"vanilla\" \"custom\" \"disableTrades\"");
        configs.addLineBreak();
        configs.addKeyValuePair(new Pair<>("TradeType", "custom"));
        configs.addKeyValuePair(new Pair<>("debug", "false"));
    }

    private static void assignConfigs() {
        TRADE_TYPE = CONFIG.getOrDefault("TradeType", "custom");
        DEBUG = CONFIG.getOrDefault("debug", "false");
    }
}