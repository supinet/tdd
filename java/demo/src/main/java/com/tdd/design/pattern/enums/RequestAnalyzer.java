package com.tdd.design.pattern.enums;

public class RequestAnalyzer {
    public String handlerAnalyzer(final String data, final char letter, final RequestTypeEnum requestTypeEnum) {
        return requestTypeEnum.getType(data, letter);
    }
    
}
