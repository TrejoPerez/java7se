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
public abstract class Animal {
    private String nombre;
    private String tipo_alimentacion;
    private Integer edad;

    public Animal(String nombre, String tipo_alimentacion, Integer edad) {
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_alimentacion() {
        return tipo_alimentacion;
    }

    public void setTipo_alimentacion(String tipo_alimentacion) {
        this.tipo_alimentacion = tipo_alimentacion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public abstract void alimentarse();
        
    
    public void moverse(){
        System.out.println("El animal se esta moviendo");
    }
    
}
