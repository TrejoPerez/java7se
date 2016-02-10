/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _57Hilos;

/**
 *
 * @author root
 */
public class MainThread {
    public static void main(String[] args) {
        Hilo h1 = new Hilo("Hilo1  -");
        h1.start();
        
        Hilo h2 = new Hilo("hilo2  -");
        h2.start();
    }
}
