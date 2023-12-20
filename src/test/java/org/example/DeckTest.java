package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    void takeTopCard() {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card("clubs", 10, "Queen"));
        cards.add(new Card("clubs", 10, "King"));

        Deck deck = new Deck(cards);

        Card card1 = deck.takeTopCard();
        Card card2 = deck.takeTopCard();

        assertEquals("Queen", card1.getFaceValue());
        assertEquals("King", card2.getFaceValue());

    }
}