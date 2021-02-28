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
public class ACTVIDAD1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);    
    System.out.print("DIGITE NUMERO NTERO");
    int num1= entrada.nextInt();
    System.out.print("DIGITE SEGUNDO NUMERO NTERO");
    int num2= entrada.nextInt();
    System.out.printf("num1 = %d\n",num1);
    System.out.printf("EL VALOR DE %d + %d ES %d\n",num1,num1,(num1 + num1));
    System.out.printf("num1=%.2f\n",(double)num1);
    System.out.printf("%d = %d\n",(num1 + num2),(num2 + num1));
    
    
            }
    
}
