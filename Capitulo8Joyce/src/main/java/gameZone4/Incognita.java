/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone4;

import java.util.Random;

/**
 *
 * @author jonat
 */
public class Incognita {
    private String frase;
    private String frase_o;
    private int num_f;
    private StringBuilder s;
    Random rnd = new Random();

    public Incognita() {
        this.num_f = rnd.nextInt(5) + 1;
        this.establecerFrase();
        this.s = new StringBuilder(this.frase_o);
    }

    public void establecerFrase() {
        switch (this.num_f) {
            case 1:
                this.frase = "hola jaja";
                this.frase_o = "**** ****";
                break;
            case 2:
                this.frase = "no se";
                this.frase_o = "** **";
                break;
            case 3:
                this.frase = "obama is the best";
                this.frase_o = "***** ** *** ****";
                break;
            case 4:
                this.frase = "ayuda porfa";
                this.frase_o = "***** *****";
                break;
            case 5:
                this.frase = "gatitos buenos";
                this.frase_o = "******* ******";
                break;
        }
    }

    public Boolean ganar() {
        int cont=0;
        for (int i = 0; i < frase_o.length(); i++) {
            if (frase_o.charAt(i)=='*') {
                cont++;
            }
        }
        if (cont>=1) {
            return false;
        }else if(cont==0){
            return true;
        }
        return false;
    }

    public void destaparFrase(char a, int num) {
        this.s.setCharAt(num, a);
        this.frase_o = s.toString();
    }

    public String getFrase() {
        return this.frase;
    }

    public String getFrase_o() {
        return this.frase_o;
    }
}
