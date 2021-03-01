/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;

/**
 *
 * @author jonat
 */
public class Die {
    private Integer numero;
    private final Integer valor = ((int)(Math.random() * 100) % 6 + 1);
    
    public Die() {
        this.numero = valor;
    }

    public void Lanzar(){
        this.numero = valor;
    }
    
    public Integer getNumero() {
        return numero;
    }
}
