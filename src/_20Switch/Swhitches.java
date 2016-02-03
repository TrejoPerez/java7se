/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _20Switch;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class Swhitches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una opcion: ");
        String resultado = sc.next();
        switch(resultado){
            case "mito":
                System.out.println("Hola mito");
                break;
            case "cout":
                System.out.println("Hola cout");
                break;
            default:
                System.out.println("Hola por defecto");
                break;
        }
        System.out.println("Fin switch");
    }
}
