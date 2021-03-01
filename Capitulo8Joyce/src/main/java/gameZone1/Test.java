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
public class Test {
    public static void main(String[] args) {
        Quiz q = new Quiz();
        Scanner leer = new Scanner(System.in);
        char resp;
        q.setPreguntas();
        
        for (int i = 0; i < 2; i++) {
            q.imprimir(i);
            do {
                System.out.println("Introduzca su respuesta");
                resp = leer.nextLine().charAt(0);
                if ((resp=='A')||(resp=='B')||(resp=='B')) {
                    break;
                }
            } while (true);
            q.correcto(resp, i);            
        }
        
        System.out.println("Has acertado: "+q.getCorrectas());
        
        
        
    }
}
