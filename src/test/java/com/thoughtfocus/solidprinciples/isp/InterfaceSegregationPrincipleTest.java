package com.thoughtfocus.solidprinciples.isp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InterfaceSegregationPrincipleTest {
    @Test
    void IspTest() {
        DataTypeConversion dataTypeConversion = new DataTypeConversion();
        assertEquals("Here I'm converting the Data Type from integer to Double", dataTypeConversion.intToDouble());

        assertEquals("Here I'm converting the Data Type from Char to String", dataTypeConversion.charToString());

    }

}