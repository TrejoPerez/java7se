/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _33Interfaces;

/**
 *
 * @author root
 */
public class MainInterfaz {
    public static void main(String[] args) {
        /*
            Coleecion de metodos abrstractos y propiedades, se indica que se debe hacer
            pero no su implementacion
        */
        Perro p = new Perro();
        String nombre =p.mostrarNombre();
        p.mostrarTipoAnima();
        p.mostradVida();
        System.out.println(nombre);
    }
}
