/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone1;

/**
 *
 * @author jonat
 */
public class Quiz {
    private Pregunta[] preguntas;
    private int correctas;
    
    public Quiz(){
        this.preguntas = new Pregunta[2];
        for (int i = 0; i < 2; i++) {
            this.preguntas[i] = new Pregunta();
        }
        this.correctas=0;
    }
    
    public void setPreguntas(){
        for (int i = 0; i < 2; i++) {
            System.out.println((i+1)+":");
            this.preguntas[i].setPregunta();
        }
    }
    
    public void imprimir(int i){
        preguntas[i].imprimir();
    }
    
    public void correcto(char in, int i){
        int res;
        if (in == 'A') {
            res = 0;
        }else if (in == 'B') {
            res = 1;
        }else{
            res = 2;
        }       
        if (preguntas[i].correcto(res)) {
            this.correctas++;
        }

    }
    
    public int getCorrectas(){
        return this.correctas;
    }
}
