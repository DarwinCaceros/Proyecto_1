package Proyecto1;

import java.util.Scanner;

public class Ticket {
    //atributos del ticket
    String nitUser;
    int id ;
    String incidente;
    String Stat;

    //metodo para solicitar los datos
    public void ingresoTicket (){
        Scanner datosTicket = new Scanner(System.in);
        System.out.println("Ingrese su numero de DPI para poder indentificar su ticket: ");
        nitUser=datosTicket.nextLine();
        System.out.println("Porfavor ingrese el problema que tiene para poder darle ayuda: ");
        incidente=datosTicket.nextLine();
        System.out.println(" Su ticket es el numero: " );


    }


}
