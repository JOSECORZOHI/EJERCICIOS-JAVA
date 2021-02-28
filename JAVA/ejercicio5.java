/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actvidad.pkg1;

import java.util.Scanner;

/**
 *
 * @author Roberto
 */
public class ejercicio5 {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
         System.out.print("DIGITE EL COMPRA DEL PORDUCTO");
         double num1= entrada.nextDouble();
         System.out.print("DIGITE EL PRECIO DE VENTA");
         double num2= entrada.nextDouble();
         
         System.out.printf("PORCENTAJE DE UTILIDAD = %.2f\n", num1*num2/100);
         
    }
}
