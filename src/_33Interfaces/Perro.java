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
public class Perro implements Animal,SerVivo{

    @Override
    public void mostrarTipoAnima() {
        System.out.println("Soy un mamifero, perro");
    }

    @Override
    public String mostrarNombre() {
        return "Kaiser";
    }

    @Override
    public void mostradVida() {
        System.out.println("Estoy 100% vivo B|");
    }
    
    
}
