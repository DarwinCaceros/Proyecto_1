package Proyecto1;

import java.sql.SQLOutput;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        //Declarando variables
        int exit = 0;
        int opcion = 0;

        //metodo para asignar el estado del ticket
        ColaServicio servicio[]= new ColaServicio[4];
        Scanner captura = new Scanner(System.in);

        Scanner entrada = new Scanner(System.in);
        while (exit != 1) {
            menue();
            //validando que el usuario no ingrese un numero erroneo en la seleccion del ticket
            try {
                opcion = entrada.nextInt();
            } catch (Exception e) {
                System.out.println(" La opcion que ingreso no es correcta: ");
                entrada = new Scanner(System.in);
            }

            switch(opcion) {

                case 1:
                    int posicion = 0;
                    //Solicitud de datos para el ticket
                    Ticket ticket1 = new Ticket();
                    ticket1.ingresoTicket();
                    Ticket ticket2 = new Ticket();
                    ticket2.ingresoTicket();
                    Ticket ticket3 = new Ticket();
                    ticket3.ingresoTicket();
                    break;
                    //opcion para mostrar la bitacora
                case 2:

                    break;
                case 3:

                    break;
                case 10:
                    exit = 1;
                    break;


            }


        }

    }
    //estructura del menu
    private static void menue(){
                System.out.println("Opciones:");
                System.out.println(" 1. Ingreso de ticket");
                System.out.println(" 2. Verificar estado de tickets");
                System.out.println(" 3. Asignar ticket a una persona");
                System.out.println(" 10.Salir ");
                System.out.println(" Favor ingrese una opcion valida para continuar:");
            }








    }

