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
public class ejercicio6 {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
         System.out.print("DIGITE EL PESO EN KG");
         double num1= entrada.nextDouble();
         
         
         System.out.printf("PESO EN LIBRAS = %.2f\n", num1*2.20462);
         System.out.printf("PESO EN TONELADAS = %.2f\n", num1*0.001);
         System.out.printf("PESO EN LIBRAS = %.2f\n", num1*1000);
   }
      
    
}
