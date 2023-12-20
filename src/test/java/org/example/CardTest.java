package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void getSuit() {
        Card card = new Card("clubs", 10, "king");
        System.out.println(card);
    }

    @Test
    void getFaceValue() {
    }

    @Test
    void getValue() {
    }
}