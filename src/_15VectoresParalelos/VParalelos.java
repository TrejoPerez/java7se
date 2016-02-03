/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _15VectoresParalelos;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class VParalelos {
    public static void main(String[] args){
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
        System.out.println("Los registros son ");
        for(int i =0;i<3;i++){
            //Biscar por edad
            if(edades[i]==23){
                System.out.println(nombres[i]+" " + edades[i]);
            }
            
        }
        
    }
}
