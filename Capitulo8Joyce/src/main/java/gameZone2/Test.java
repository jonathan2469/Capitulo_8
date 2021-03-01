/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;
import java.util.Scanner;
/**
 *
 * @author jonat
 */
public class Test {
    public static void main(String[] args) {
        FiveDice2 dados = new FiveDice2();
        FiveDice2 dados2 = new FiveDice2();

        Scanner leer = new Scanner(System.in);

        int resp = 0;

        do {
            dados.lanzar();
            dados2.lanzar();
            dados.imprimir();
            dados2.imprimir();

            System.out.println("El jugador tiene " + dados.oracion(dados.evaluar()));
            System.out.println("La computadora tiene " + dados2.oracion(dados2.evaluar()));

            if (dados.evaluar() > dados2.evaluar()) {
                System.out.println("Ha ganado el jugador");
            } else if (dados.evaluar() < dados2.evaluar()) {
                System.out.println("Ha ganado la computadora");
            } else {
                if (dados.getMayor() > dados2.getMayor()) {
                    System.out.println("El jugador tiene valores más altos, por tanto gana");
                } else if (dados.getMayor() < dados2.getMayor()) {
                    System.out.println("La computadora tiene valores  más altos, por tanto gana.");
                }else{
                   System.out.println("Ha sido un empate"); 
                }                
            }

            System.out.println("Desea seguir jugando? [0=no, 1=sí]");
            resp = leer.nextInt();
        } while (resp == 1);

    }
}
