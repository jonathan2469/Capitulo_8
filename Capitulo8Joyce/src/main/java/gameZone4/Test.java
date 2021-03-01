/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone4;

import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class Test {
    public static void main(String[] args) {
        SecretPhrase2 fr2 = new SecretPhrase2();
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println(fr2.getFrase());
            System.out.println("Introduzca su intento");
            char resp = leer.nextLine().charAt(0);
            if (fr2.adivinanza(resp)) {
                break;
            }
            
        } while (true);

    }

}
