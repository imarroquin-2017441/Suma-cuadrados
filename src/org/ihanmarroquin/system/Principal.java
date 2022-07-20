
package org.ihanmarroquin.system;

import java.util.Scanner;

/*
Programador: Ihan Gilberto Alexander Marroquin Sequen
IN5AM
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long suma = 0;int limite;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ihan Marroquin 2017441");
        System.out.println("Ingrese el limite");
        limite = entrada.nextInt();
        for (int i=1; i<= limite; i++){
            suma = suma + (long)Math.pow(i, 2);
            System.out.println(i + " = " + (long)Math.pow(i, 2));
        }
        
        System.out.println("La suma es "+ suma);
        
        
    }
    
}
