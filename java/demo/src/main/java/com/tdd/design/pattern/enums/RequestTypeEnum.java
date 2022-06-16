package com.tdd.design.pattern.enums;

public enum RequestTypeEnum {

    DATA_LENGTH {
        @Override
        public String getType(final String data, final char letter) {
            return String.format("data is %s %d", data, data.length());
        }
    },
    OCURRENCE_LETTER {
        @Override
        public String getType(final String data, final char letter) {
            long ocurrenceLetter = data.chars()
                                       .filter(c -> c == letter)
                                       .count();
            return String.format("data is %s %d", data, ocurrenceLetter);
        }
    };
    
    public abstract String getType(final String data, final char letter);
    
}
