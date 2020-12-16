package org.itstep.blackjack;

import java.util.List;

import java.util.Random;

public class Dealer extends Player {
    Random rnd=new Random();
    private final Hand hand;
    private final Dealer dealer;
    private int cash;

    public Dealer(int cash) {
        super(cash);
        hand = new Hand();
        dealer = new Dealer(cash);
    }

    public int getCash() {
        return cash;
    }

    @Override
    public Card getLastCard() {
        return super.getLastCard();
    }

    public Card getPreviousCard(){
        return hand.getCards().get(getCards().size()-2);
    }

    public void takeCard(Card card) {
        int fromValue = rnd.nextInt(10)+1;
        int toValue = rnd.nextInt(20)+10;
        while(hand.getValue()>=fromValue && hand.getValue()<=toValue){
            hand.addCard(card);
        }
        dealer.getPreviousCard().setHide(false);
    }

    @Override
    public void addCash(int cash) {
        super.addCash(cash);
    }

    @Override
    public void setBet(int amount) throws NoMoneyException {
        super.setBet(amount);
    }

    @Override
    public int getPoints() {
        return super.getPoints();
    }

    @Override
    public List<Card> getCards() {
        return super.getCards();
    }

    @Override
    public void clear() {
        super.clear();
    }

}
