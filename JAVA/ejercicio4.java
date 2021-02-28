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
public class ejercicio4 {
    public static void main(String[] args){
         Scanner entrada = new Scanner(System.in);
         System.out.print("DIGITE EL PESO");
         double num1= entrada.nextDouble();
         System.out.print("DIGITE LA ALTURA EN DECIMAL");
         double num2= entrada.nextDouble();
         
         System.out.printf("SU BMI ES = %.2f\n", num1/(num2*num2));
         
         
     }        
    
}
