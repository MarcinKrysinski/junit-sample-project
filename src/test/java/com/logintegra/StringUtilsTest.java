package com.logintegra;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class StringUtilsTest {

    @Test
    void getFirstLetter_returns_firstLetter() {
        StringUtils stringUtils = new StringUtils();
        String firstLetter = stringUtils.getFirstLetter("wsb");
        assertEquals("w", firstLetter);
    }
}
