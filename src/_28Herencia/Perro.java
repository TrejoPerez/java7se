/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _28Herencia;

/**
 *
 * @author root
 */
public class Perro extends Animal{

    //Si la clase que se herada tiene un constructor, entonces tambien se debe de definir el contructor 
    //de esta clase
    public Perro(String raza, String nombre, String tipo_alimentacion, Integer edad) {
        super(nombre, tipo_alimentacion, edad);
        this.raza = raza;
    }
    
    private String raza;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void mostrar(){
        System.out.println(getNombre()+" - "+getTipo_alimentacion()+" - " + getEdad() + " - "+getRaza());
    }
    
}
