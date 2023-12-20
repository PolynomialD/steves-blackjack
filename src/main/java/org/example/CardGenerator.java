package org.example;

import java.util.ArrayList;
import java.util.List;

public class CardGenerator {

    public List<Card> generate(int numberOfDecks) {
        List<Card> cards = new ArrayList<>();
        for(int i = 0; i < numberOfDecks; i++) {
            cards.addAll(this.generate());
        }
        return cards;
    }

    public List<Card> generate() {
        List<Card> cards = new ArrayList<>();
        List<String> suits = List.of("Clubs", "Hearts", "Diamonds", "Spades");
        suits.forEach((suit) -> {
            cards.add(new Card(suit, 2, "2"));
            cards.add(new Card(suit, 3, "3"));
            cards.add(new Card(suit, 4, "4"));
            cards.add(new Card(suit, 5, "5"));
            cards.add(new Card(suit, 6, "6"));
            cards.add(new Card(suit, 7, "7"));
            cards.add(new Card(suit, 8, "8"));
            cards.add(new Card(suit, 9, "9"));
            cards.add(new Card(suit, 10, "10"));
            cards.add(new Card(suit, 10, "Jack"));
            cards.add(new Card(suit, 10, "Queen"));
            cards.add(new Card(suit, 10, "King"));
            cards.add(new Card(suit, 11, "Ace"));
        });
        return cards;
    }
}
