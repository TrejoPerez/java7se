/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _26ModificadoresAcceso;

import _28Herencia.Animal;
import _28Herencia.Perro;

/**
 *
 * @author root
 */
public class MAcceso {
    /*
    private = solo puieden ser accedidas en la clase donde han sidop definidas
    public = El traibuto sera accedido por cualquier clase de la aplicacion
    protected = Las variablews solo pueden accedidas entre las mismas clases
    package(por defecto) = Ambito que no se define cuando no se le pone nigun ambito
    Por defecto java solo lo reconocera en el parquete donde sea creado
    */
    public static void main(String[] args){
        Perro p = new Perro("pastor","kaiser","carnivoro",3);
        p.mostrar();
        /*
        p.setEdad(3);
        p.setRaza("pastor");
        p.setNombre("kaiser");
        p.setTipo_alimentacion("Carnivoro");
        p.mostrar();
                
        */
    }
}
