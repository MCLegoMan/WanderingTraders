/*
    WanderingTraders v1.0.1
    https://github.com/MCLegoMan/WanderingTraders

    Author: Daniel-Tayden Larsen (MCLegoMan)
    License: MCLM-OSL (2022)
*/

package com.mclegoman.wanderingtraders.config;

import com.mojang.datafixers.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class ConfigProvider implements SimpleConfig.DefaultConfig {

    private String configContents = "";

    public List<Pair> getConfigsList() {
        return configsList;
    }

    private final List<Pair> configsList = new ArrayList<>();

    public void addKeyValuePair(Pair<String, ?> keyValuePair) {
        configsList.add(keyValuePair);
        configContents += keyValuePair.getFirst() + "=" + keyValuePair.getSecond() + "\n";
    }
    public void addComment(String comment) {
        configContents += ("# " + comment + "\n");
    }
    public void addLineBreak() {
        configContents += ("\n");
    }

    @Override
    public String get(String namespace) {
        return configContents;
    }
}