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
public class MainStatics {
    public static void main(String[] args) {
        /*
        El metodo main es estaytico porque al inicia el programa no hay objetos y 
        por lo tanto se necesita entrar a la definicion de la clase
            Static(de clase)=Puede ser accedidio atraves de la definicon de la clase
            No estatico(instancia) = tiene que estar instanciados para poder acceder a ellos
        */
        Persona p = new Persona();
        p.setEdad(24);
        p.setNombre("Trejo");;
        //p.mostrarInstancia();
        
        Persona.mostraClase();
    }
    
}
