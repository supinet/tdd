package com.tdd.maps;

import static org.junit.Assert.assertEquals;

import java.util.Map;
import java.util.Optional;

import org.junit.Test;

public class HashMapsTest {
    
    @Test
    public void getKeyLanguageByLanguage() {
        HashMaps hashMaps = HashMaps.getInstance();
        Optional<Integer> languageKey = hashMaps.getKeyLanguageByVaue("Java");
        assertEquals(Optional.of(1), languageKey);
    }

    @Test
    public void getValueByValue() {
        HashMaps hm = HashMaps.getInstance();
        Optional<String> value = hm.getValueByVAlue("Python");
        assertEquals(Optional.of("Python"), value);
    }

    @Test
    public void showAllValuesMap() {
        HashMaps maps = HashMaps.getInstance();
        maps.getValues().forEach((k, v) -> System.out.println(k + " " + v));
        Map<Integer, String> values = maps.getValues();
        assertEquals(values.size(), 3);
    }

    @Test
    public void singletonTest() {
        HashMaps singletion1 = HashMaps.getInstance();
        System.out.println("singleton1 " + singletion1);

        HashMaps singleton2 = HashMaps.getInstance();
        System.out.println("singleton2 " + singleton2);
    }
}
