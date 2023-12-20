package org.example;

public class Card {
    private final String suit;
    private final int value;
    private final String faceValue;

    public Card(String suit, int value, String faceValue) {
        this.suit = suit;
        this.value = value;
        this.faceValue = faceValue;
    }

    public String getSuit() {
        return suit;
    }

    public String getFaceValue() {
        return faceValue;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return faceValue + " of " + suit;
    }
}
