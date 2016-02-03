/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _18Matrices;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class Matrices {
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
                //Columnas
                System.out.print(numeros[i][j]+"\t");
                
            }
             System.out.print("\n");
        }
    }
}
