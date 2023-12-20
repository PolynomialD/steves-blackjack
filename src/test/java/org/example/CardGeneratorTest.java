package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CardGeneratorTest {

    @Test
    void should_have_52_cards() {
        List<Card> cards = new CardGenerator().generate();

        assertEquals(52, cards.size());
    }

    @Test
    void should_have_104_cards() {
        List<Card> cards = new CardGenerator().generate(2);

        assertEquals(104, cards.size());
    }
}