package com.tdd.design.pattern.enums;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RequestAnalyzerTest {
    
    @Test
    public void getDataAndLength() {
        RequestAnalyzer requestAnalyzer = new RequestAnalyzer();
        String result = requestAnalyzer.handlerAnalyzer("silvano.io", 'a', RequestTypeEnum.DATA_LENGTH);
        assertEquals("data is silvano.io 10", result);
    }

    @Test
    public void getOccurenceLetter() {
        RequestAnalyzer requestAnalyzer = new RequestAnalyzer();
        String result = requestAnalyzer.handlerAnalyzer("silvano.io", 'a', RequestTypeEnum.OCURRENCE_LETTER);
        assertEquals("data is silvano.io 1", result);
    }
}
