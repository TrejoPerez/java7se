/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _14Vector;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class Vector {
    public static void main(String[] args){
        //El tamaño no puede ser modificado, tambien se les conoce como vector
        System.out.println("Ingresa el tamaño del vector");
        Scanner sc = new Scanner(System.in);
        int tamano = sc.nextInt();
        String[] vector = new String[tamano];
        /*arreglo[0]="Hola";
        arreglo[1]="Mundo";
        
        for(String s:arreglo){
            System.out.println(s);
        }
        */
        for(int i =0;i<vector.length;i++){
            System.out.println("Ingrese contenido apra la posicion " + i + " :");
            vector[i]=sc.next();
        }
        System.out.println("---------------------------");
        
        for(String s:vector){
            System.out.println(s);
        }
    }
            
    
}
