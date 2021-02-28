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
public class ejercicio3 {
    public static void main(String[] args){
         Scanner entrada = new Scanner(System.in);
         System.out.print("DIGITE VALOR DEL RADIO");
         double num1= entrada.nextDouble();
         
         System.out.printf("EL LA LONGITUD ES: %.2f\n", num1 * 3.14);
         System.out.printf("LA CIRCUNFERENCIA ES: %.2f\n ",num1 * num1);
         
     }        
    
}
