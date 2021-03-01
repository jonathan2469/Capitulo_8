/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem1;

import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class EventDemo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Event[] eventos = new Event[3];
        int n = 0, ev_ty=0;
        String event="", phone="";

        for (int i = 0; i < 3; i++) {
            
            System.out.println("Evento "+(i+1));

            System.out.println("Introduzca el Numero de evento");
            event = leer.nextLine();
            
            if (((event.charAt(0) >= 65) && (event.charAt(0) <= 90)) && (event.length() == 4)) {
                if (((event.charAt(1) >= 48) && (event.charAt(1) <= 57))) {
                    if (((event.charAt(2) >= 48) && (event.charAt(2) <= 57))) {
                        if (((event.charAt(3) >= 48) && (event.charAt(3) <= 57))) {

                        } else {
                            event = "A000";
                        }
                    } else {
                        event = "A000";
                    }
                } else {
                    event = "A000";
                }
            } else {
                event = "A000";
            }
            event = event.toUpperCase();

            do {
                System.out.println("Introduzca el numero de invitados");
                n = leer.nextInt();
                leer.nextLine();
                if ((n >= 5) && (n <= 100)) {
                    break;
                }
            } while (true);

            System.out.println("Intoduzca el número telefónico");
            phone = leer.nextLine();

            System.out.println("Introduzca el tipo de evento (1,2,3,4,5)");
            ev_ty = leer.nextInt();
            leer.nextLine();
            eventos[i] = new Event(event, n);         
            eventos[i].setPhoneNumber(phone);
            eventos[i].setEventType(ev_ty);
        }

        
        System.out.println(eventos[0].toString());
        System.out.println(eventos[1].toString());
        System.out.println(eventos[2].toString());
        
    }
}
