package org.itstep.blackjack;

import java.util.List;

public class Player{
    private final Hand hand;

    private int cash;

    public Player(int cash) {
        hand = new Hand();
        this.cash = cash;
    }

    public int getCash() {
        return cash;
    }

    public void addCash(int cash) {
        this.cash += cash;
    }

    public void setBet(int amount) throws NoMoneyException{
        if(amount > cash){
            throw new NoMoneyException("Ты слишком беден");
        }
        cash -= amount;
    }

    public void takeCard(Card card){
        hand.addCard(card);
        card.setHide(false);
    }

    public int getPoints(){
        return hand.getValue();
    }

    public List<Card> getCards(){
        return hand.getCards();
    }

    public Card getLastCard(){
        return hand.getCards().get(getCards().size()-1);
    }

    public void clear(){
        hand.getCards().clear();
    }

}
