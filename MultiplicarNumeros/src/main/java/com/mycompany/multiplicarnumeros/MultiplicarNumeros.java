/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multiplicarnumeros;

import java.util.Scanner;

public class MultiplicarNumeros {

    public static void main(String[] args) {
        Scanner lector= new Scanner (System.in);
        System.out.println("Ingrese primer numero:");
        int n1= lector.nextInt();
        System.out.println("Ingrese segundo numero:");
        int n2= lector.nextInt();
        int r =(n1*n2); 
        System.out.println("El resultado es:" + r);
        
                
    }
}
