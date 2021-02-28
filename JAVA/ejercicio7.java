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
public class ejercicio7 {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
         System.out.print("DIGITE NUMERO DE DIAS DE VIAJE");
         double num1= entrada.nextDouble();
         System.out.print("DIGITE EL TOTAL KILOMETROS");
         double num2= entrada.nextDouble();
         System.out.print("DIGITE EL TOTAL KILOMETROS POR DIA");
         double num3= entrada.nextDouble();
         System.out.print("DIGITE EL COSTO POR LITRO");
         double num4= entrada.nextDouble();
         System.out.print("DIGITE EL PROMEDIO DE KILOMETRO POR LITRO DE GASOLINA");
         double num5= entrada.nextDouble();
         System.out.print("DIGITE EL PAGO POR ESTACIONAMIENTO");
         double num6= entrada.nextDouble();
         System.out.print("DIGITE EL PAGO DE PEAJES POR DIA");
         double num7= entrada.nextDouble();
         
         System.out.printf("TOTAL GASTADO = %.2f\n", num1 + num2 + num3 + num4 + num5 +num6 + num7);
    }
}
