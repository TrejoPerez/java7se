/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _19OperacionesMatrices;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class MatricesOperaciones {
    public static void main(String[] args){
        //PErminte agrupar elementos de un mismo tipo de dato, solo que en la smatrices
        //Se presenta mas de un indice
        //Integer[filas][columnas]
        //Si se quisiera hacer dinamicamente, solo se agrega el System.in dentro de los indices
        Integer[][] numeros = new Integer[3][3];
        //Va apermitir alamcenar 9 elementos
        //Fila cero, columna cero, fila cero - columna 1, fila cero -columna2
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<3;i++){
            //Filas
            for(int j =0 ; j<3;j++){
                //Columnas
                System.out.println("Elemento para la posicion fila : "+i + " columna: "+j);
                //Llenado de la matriz
                numeros[i][j] = sc.nextInt();
            }
        }
        System.out.println("Los valores son ");
        for(int i =0;i<3;i++){
            //Filas
            for(int j =0 ; j<3;j++){
                /*
                   Diagonal de ceros i==j
                   Solo imrpimir los elementos de la primer columna j==0
                   Solo imrpimir los elementos de la primer fila i==0
                */
                if(i==0){
                     //Columnas,Imprimir diagonal de ceros
                System.out.print(numeros[i][j]);
                }else{
                    System.out.print("0");
                }
            }       
            System.out.print("\n");
        }
        //Imprimir la diagonal de otra forma
        for(int i =0;i<3;i++){
            System.out.print(numeros[i][i]);
        }
    }
    
}
