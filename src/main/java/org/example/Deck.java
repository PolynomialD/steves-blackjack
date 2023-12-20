package org.example;

import java.util.Collections;
import java.util.List;

public class Deck {

    private final List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card takeTopCard() {
        return cards.remove(0);
    }
}
