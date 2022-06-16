package com.tdd.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HashMaps {

    private static HashMaps instance;

    private HashMaps(){};

    public static HashMaps getInstance() {
        if (instance == null) {
            synchronized (HashMaps.class) {
                if (instance == null) {
                    instance = new HashMaps();
                }
            }
        }
        return instance;
    }

    static Map<Integer, String> map = new HashMap<>();

    public void populateMap() {
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C#");
    }

    public Optional<Integer> getKeyLanguageByVaue(final String value) {
        populateMap();
        Optional<Integer> language = map.entrySet().stream()
        .filter(e -> value.equals(e.getValue()))
        .map(Map.Entry::getKey)
        .findFirst();
        return language;
    }

    public Optional<String> getValueByVAlue(final String value) {
        populateMap();
        Optional<String> language = map.entrySet().stream()
        .filter(e -> value.equals(e.getValue()))
        .map(Map.Entry::getValue)
        .findFirst();
        return language;
    }

    public Map<Integer, String> getValues() {
        populateMap();
        return map;
    }
}
