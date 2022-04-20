package com.thoughtfocus.solidprinciples.ocp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OpenAndCloseTest {
    @Test
    void testOpenClosePrinciple() {
        Operations operations1 = new Operations(new AddOperation());
        assertEquals(21, operations1.executeOperation(14, 7));

        Operations operations2 = new Operations(new SubtractOperation());
        assertEquals(12, operations2.executeOperation(14, 2));

        Operations operations3 = new Operations(new MultiplyOperation());
        assertEquals(130, operations3.executeOperation(26, 5));


    }

}