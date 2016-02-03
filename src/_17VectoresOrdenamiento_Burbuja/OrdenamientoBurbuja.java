/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _17VectoresOrdenamiento_Burbuja;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class OrdenamientoBurbuja {
    /*
        Este algoritmo (Fuerza bruta loogica-intercambio directo)
        Consiste en revisar cada elemento con la lista que va a ser ordenada con el siguiente elemento
    Se tienen dos elementos y se intercambiaran los lugares si es que el siguiente elemento es mayor
    */
    public static void main(String[] args){
        //Ordenar de menor a mayor el vector edades
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
        //Es dos porque cuando empiece en cero, no se puede comparar porque ya no habra parejas de arrelgo
        //cuando este llede al elemtno 3
        /*
        int aux;
        for(int i = 0;i < 2; i++){
            //Aqui los valores estaran en la parte fuinal del vector y no seria necesario
            //recorrer el arreglo de nuevo
            for(int j =0 ; j < 2-i ; j++){
                if(edades[j] > edades[j+1]){
                    aux = edades[j];
                    edades[j] = edades[j+1];
                    edades[j+1] = aux;
                }
            }
        }
        for(Integer valor: edades){
            System.out.println(valor);
        }
        */
        //Ordenar los nombres
        String aux;
        for(int i = 0;i < 2; i++){
            //Aqui los valores estaran en la parte fuinal del vector y no seria necesario
            //recorrer el arreglo de nuevo
            //compareTO = Compara dos Strings y devuelve cero si la cadena es igua
            //Devuevle un valor mayor a cero si las cadenas son diferentes
            for(int j =0 ; j < 2-i ; j++){
                if(nombres[j].compareTo(nombres[j + 1])>0 ){
                    aux = nombres[j];
                    nombres[j] = nombres[j+1];
                    nombres[j+1] = aux;
                }
            }
        }
        for(String valor: nombres){
            System.out.println(valor);
        }
    }
}
