/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _31MétodosInstanciaMétodosClaseStatic;

/**
 *
 * @author root
 */
public class Persona {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void mostrarInstancia(){
        System.out.println(this.nombre + " , " + this.edad);
    }
    public static void mostraClase(){
        /*Los metodos que no son estaticas no pueden ser refereciandas en
        un contexto estatico
        */
        System.out.println("Metodo estatico");
    }
}
