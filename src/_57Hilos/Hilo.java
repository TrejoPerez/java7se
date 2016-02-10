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
public class Hilo extends Thread{
    private String nombre;
    public Hilo() {
    }
    public Hilo(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println(nombre+i);
        }
    }
    
}
