/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone4;

/**
 *
 * @author jonat
 */
public class SecretPhrase2 {
    private Incognita frase;
    
    public SecretPhrase2(){
        this.frase = new Incognita();        
    }
    
    public String getFrase(){
        return this.frase.getFrase_o();
    }
    
    public Boolean adivinanza(char letra){
        for (int i = 0; i < this.frase.getFrase().length(); i++) {
            if (letra==this.frase.getFrase().charAt(i)) {
                frase.destaparFrase(this.frase.getFrase().charAt(i), i);
            }
            if (this.frase.ganar()) {
                System.out.println("Has ganado");
                return true;                
            }
        }
        return false;
    }
}
