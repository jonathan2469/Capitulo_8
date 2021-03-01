/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone1;
import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class Pregunta {
    private String pregunta;
    private Inciso[] incisos;
    Scanner leer = new Scanner(System.in);
    
    public Pregunta(){
        this.pregunta = "";
        this.incisos = new Inciso[3];
        for (int i = 0; i < 3; i++) {
            this.incisos[i] = new Inciso();
        }        
    }
    
    public void setPregunta(){
        char in;
        Boolean c;
        System.out.println("Introduzca la pregunta");
        this.pregunta = leer.nextLine();
        for (int i = 0; i < 3; i++) {                     
            System.out.println("Introduzca la respuesta "+(i+1));
            String resp = leer.nextLine();
            System.out.println("Es la correcta? (y/n)");
            char resp2 = leer.nextLine().charAt(0);
            if (resp2=='y') {
                c = true;
            }else{
                c = false;
            }
            if (i==0) {
                in = 'A';
            }else if (i==1) {
                in = 'B';
            }else{
                in = 'C';
            }                        
            this.incisos[i].setInciso(in);
            this.incisos[i].setCorrecto(c);
            this.incisos[i].setRespuesta(resp);
        }
    }    
    
    public void imprimir(){
        System.out.println(this.pregunta);
        for (int i = 0; i < 3; i++) {
            this.incisos[i].imprimir();
        }
    }
    
    public Boolean correcto(int i){
        if (incisos[i].getCorrecto()==true){
            return true;
        }else{
            return false;
        }
        
    }
}
