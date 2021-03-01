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
public class FullDeck {
    private Card[] cards;
    private int[] repeticiones;
    Random rnd = new Random();

    public FullDeck() {
        this.repeticiones = new int[52];
        for (int i = 0; i < 52; i++) {
            this.repeticiones[i]=0;
        }
        int cont = 1;
        this.cards = new Card[52];

        for (int j = 1; j <= 13; j++) {

            this.cards[(j - 1)] = new Card("Spades", j);

        }
        for (int j = 1; j <= 13; j++) {

            this.cards[(j + 12)] = new Card("Hearts", j);

        }
        for (int j = 1; j <= 13; j++) {

            this.cards[j + 25] = new Card("Diamonds", j);

        }
        for (int j = 1; j <= 13; j++) {

            this.cards[j + 38] = new Card("Clubs", j);
        }

    }

    public void arrayAleatorio() {
        
        repeticiones[0]=rnd.nextInt(52);
        for (int i = 1; i < 52; i++) {
            repeticiones[i]=rnd.nextInt(52);
            for (int j = 0; j < i; j++) {                    
                if(repeticiones[i]==repeticiones[j]){
                    i--;
                }
            }
        }
        for (int i = 0; i < 52; i++) {
            System.out.println(repeticiones[i]);
        }
        
    }
    
    
    
    public int tomarCarta1(int i){
        System.out.println(this.cards[repeticiones[i]].toString());
        return this.cards[repeticiones[i]].getN();
    }
    
    public int tomarCarta2(int i){        
        System.out.println(this.cards[repeticiones[i]].toString());
        return this.cards[repeticiones[i]].getN();
    }

    public void imprimir() {
        for (int i = 0; i < 52; i++) {
            System.out.println(this.cards[i].toString());
        }

    }
}
