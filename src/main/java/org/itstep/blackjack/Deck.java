package org.itstep.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards;

    private final List<Card> taken;

    public Deck(List<Card> taken) {
        this.taken = taken;
        this.cards = new ArrayList<>(52);
        for (Rank rank : Rank.values()) {
            for (Suite suite : Suite.values()) {
                this.cards.add(new Card(rank, suite));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card getOne() {
        Card card = cards.remove(0);
        return card;
    }

    public void reset(){
        cards.addAll(taken);
        taken.clear();
    }

}
