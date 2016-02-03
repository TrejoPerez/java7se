/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _16VectoresMayor_MenorElemento;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class Mayor_Menor {
    public static void main(String[] args){
        //Diferentes nombres y edades y ver cual es el menor o el mayor
        //Llenando el arreglo
         String[] nombres = new String[3];
        Integer[] edades = new Integer[3];
        for(int i =0;i<3;i++){
            Scanner sc = new Scanner(System.in);
            //Almacenar lo que escribe le usuario en edad y en forma de entero
            System.out.println("Ingrese nombre: ");
            nombres[i]=sc.next();
            System.out.println("Ingrese edad: ");
            edades[i]=sc.nextInt();
        }
        System.out.println("----------------");
        //Encontrar el mayor elemento usando el primer elemenyto
        Integer mayor = edades[0];
        Integer posicion =0;
        for(int i =0;i<3;i++){
            if(edades[i] > mayor){
                mayor = edades[i];
                posicion = i;
            }
        }
        System.out.println("EL mayor es "+mayor);
        System.out.println("Su nombre es "+ nombres[posicion]);
        
        Integer menor = edades[0];
        Integer pos =0;
        for(int i =0;i<3;i++){
            if(edades[i] < menor){
                menor = edades[i];
                pos = i;
            }
        }
        System.out.println("EL menor es "+menor);
        System.out.println("Su nombre es "+ nombres[pos]);
    }
}
