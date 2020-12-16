package org.itstep.blackjack;

import org.itstep.App;

public class Game {
    private final Player player;
    private final Player dealer;
    private final Deck deck;

    public Game(Player player, Player dealer, Deck deck) {
        this.player = player;
        this.dealer = dealer;
        this.deck = deck;
    }

    public Player getPlayer() {
        return player;
    }

    public Player getDealer() {
        return dealer;
    }

    public void setBet(int amount) throws NoMoneyException {
        if (amount > player.getCash()) {
            throw new NoMoneyException("Ты слишком беден");
        }
        int cash = player.getCash();
        cash-=amount;
    }

    public void play(){
        App.launch();
        player.takeCard(deck.getOne());
        player.takeCard(deck.getOne());
        dealer.takeCard(deck.getOne());
        dealer.takeCard(deck.getOne());
    }

    public void hit(){
        player.takeCard(deck.getOne());
    }

    public void stand(){
        dealer.takeCard(deck.getOne());
    }

}
