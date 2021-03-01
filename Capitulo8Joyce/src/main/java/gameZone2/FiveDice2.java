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
public class FiveDice2 {
    private Die[] dados;   
    private int mayor;
    
    public FiveDice2(){
        this.dados = new Die[5];
        for (int i = 0; i < 5; i++) {
            this.dados[i] = new Die();
        }
        this.mayor = 0;
    }
    
    public void lanzar(){
        for (int i = 0; i < 5; i++) {
            this.dados[i].Lanzar();
        }
    }
    
    public int getMayor(){
        return this.mayor;
    }
    
    public Integer evaluar(){
        Integer contador = 0;
        Integer maximo = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < 5; j++) {
                if(this.dados[j].getNumero()==i){
                    contador++;
                }
            }
            if(contador>maximo){
                maximo=contador;   
                this.mayor=i;
            }
            contador = 0;
        }
        return maximo;
    }
    
    public String oracion(int maximo){
        switch (maximo) {
            case 2:
                return ("un par.");                
            case 3:
                return ("tres dados iguales");
            case 4:
                return ("cuatro dados iguales.");
            case 5:
                return ("5 dados iguales");
            default:
                return "error";
        }
    }
           
    public void combinacion(){
        for (int i = 1; i <= 5; i++) {
            
        }
        
    }

    public void imprimir() {
        for (int i = 0; i < 5; i++) {
            System.out.print(this.dados[i].getNumero()+" ");
        }
        System.out.println("");
    }
}
