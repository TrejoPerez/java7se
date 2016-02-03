/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _29Polimorfismo;

/**
 *
 * @author root
 */
public class Caballo extends Animal{

    public Caballo(String nombre, String tipo_alimentacion, Integer edad) {
        super(nombre, tipo_alimentacion, edad);
    }

    @Override
    public void alimentarse() {
        System.out.println("Yo me alimento de hiberbas");
    }
    
}
