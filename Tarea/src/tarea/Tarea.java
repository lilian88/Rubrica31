/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        Scanner ingreso=new Scanner(System.in);
        int galones, opciones;
        String tipo="";
        double diesel=1.50, gasolina=3.00;
        double iva=12,calculoiva = 0;
        double total = 0,subtotal = 0;
        
        System.out.println("Gasolinera");
        System.out.println("Bienvenidos a PetroEcuador");
        System.out.println("1)Gasolina $3.00 \n2)Diesel   $1.50");
        opciones=ingreso.nextInt();
        System.out.println("ingrese la cantidad en Galones");
        galones=ingreso.nextInt();
        
        if (opciones==1) {
            tipo="Gasolina";
            subtotal=galones*gasolina;
            calculoiva=subtotal*iva/100;
            total=subtotal+calculoiva;
        }
        if (opciones==2) {
            tipo="Diesel";
            subtotal=galones*diesel;
            calculoiva=subtotal*iva/100;
            total=subtotal+calculoiva;
        }
       
        System.out.println("*****Factura*******");
        System.out.println("Combustible: "+tipo);
        System.out.println("Subtotal :"+subtotal);
        System.out.println("Iva      :"+calculoiva);
        System.out.println("Total    :"+total);
    }
    
}
