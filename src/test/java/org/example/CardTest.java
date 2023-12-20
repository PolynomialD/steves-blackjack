package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void getSuit() {
        Card card = new Card("clubs", 10, "king");
        assertEquals("clubs", card.getSuit());
    }

    @Test
    void getFaceValue() {
        Card card = new Card("clubs", 10, "king");
        assertEquals("king", card.getFaceValue());
    }

    @Test
    void getValue() {
        Card card = new Card("clubs", 10, "king");
        assertEquals(10, card.getValue());
    }

    @Test
    void toStringTest() {
        Card card = new Card("clubs", 10, "king");
        String expected = "king of clubs";
        assertEquals(expected, card.toString());
    }
}