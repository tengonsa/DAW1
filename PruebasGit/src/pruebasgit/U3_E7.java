/*
7.Hacer un programa que pida dos números
después que los imprima en orden ascendente.
 */
package pruebasgit;

import java.util.Scanner;

public class U3_E7 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        int n1 = lector.nextInt();
        System.out.println("Introduzca el segundo numero");
        int n2 = lector.nextInt();
        int resultado;
        
        if (n1>n2){
            resultado = n2 - n1;
            System.out.println(n2+" "+n1+"\n"+n2+" - "+n1+" = "+resultado);
            
        }
        else {
            resultado = n1 - n2;
            System.out.println(n1+" , "+n1+" - "+n2+" = "+resultado);
        }
        resultado = n1 * n2;
    }
    
}
