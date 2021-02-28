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
public class ejercicio2{
     public static void main(String[] args){
         Scanner entrada = new Scanner(System.in);
         System.out.print("DIGITE NUMERO DECIMAL");
         double num1= entrada.nextDouble();
         System.out.print("DIGITE SEGUNDO NUMERO DECIMAL");
         double num2= entrada.nextDouble();
         System.out.print("DIGITE TERCER NUMERO DECIMAL");
         double num3= entrada.nextDouble();
         System.out.printf("EL VALOR DE LA SUMA ES: %.2f\n",num1 + num2 + num3);
         System.out.printf("PROMEDIO DE LOS NUMEROS ES: %.2f\n ",(num1 + num2 + num3)/3);
         System.out.printf("PRODUCTO ES: %.2f\n",num1 * num2 * num3);
            
    
     }
    
   
    
}
