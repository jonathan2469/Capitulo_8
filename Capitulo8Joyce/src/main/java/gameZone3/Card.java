/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone3;

import java.util.Random;

/**
 *
 * @author jonat
 */
public class Card {
    private String suit;
    private int n;
    private String card_rank;   
    
    Random rnd = new Random();
    
    public Card(String suit, int n){
        setSuit(suit);
        setN(n);
    }
       
    
    public void calcularAlto(Card carta2){
        if (this.n > carta2.getN()) {
            System.out.println("El jugador ha ganado");
        }else if (this.n < carta2.n) {
            System.out.println("La computadora ha ganado");
        }else{
            System.out.println("Ha sido empate");
        }
    }
    
    
    public void setCardRank(){
        switch (this.n) {
            case 1:
                this.card_rank = "Ace";
                break;
            case 2:
                this.card_rank = "2";
                break;
            case 3:
                this.card_rank = "3";
                break;
            case 4:
                this.card_rank = "4";
                break;
            case 5:
                this.card_rank = "5";
                break;
            case 6:
                this.card_rank = "6";
                break;
            case 7:
                this.card_rank = "7";
                break;
            case 8:
                this.card_rank = "8";
                break;
            case 9:
                this.card_rank = "9";
                break;
            case 10:
                this.card_rank = "10";
                break;
            case 11:
                this.card_rank = "Jack";
                break;
            case 12:
                this.card_rank = "Queen";
                break;
            case 13:
                this.card_rank = "King";
                break;                                   
        }
    }
    
    public void setSuit(String suit){
        this.suit = suit;
    }
    
    public void setSuit(){        
        int n = rnd.nextInt(4)+1;
        switch (n) {
            case 1:
                this.suit = "Spades";
                break;
            case 2:
                this.suit = "Hearts";
                break;
            case 3:
                this.suit = "Diamonds";
                break;
            case 4:
                this.suit = "Clubs";
        }
    }
    
    public void setN(){
        final int CARDS_IN_SUIT = 13;
        this.n = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
        setCardRank();
    }
    
    public void setN(int num){
        this.n = num;
        setCardRank();
    }
    
    public String getSuit(){
        return this.suit;
    }
    
    public String getCardRank(){
        return this.card_rank;
    }
    
    public int getN(){
        return this.n;
    }

    @Override
    public String toString() {
        return "Card{" + "suit=" + suit + ", card_rank=" + card_rank + '}';
    }
}
