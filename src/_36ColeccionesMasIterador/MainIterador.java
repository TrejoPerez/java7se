/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _36ColeccionesMasIterador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author root
 */
public class MainIterador {
    /**/
    public static void main(String[] args) {
        //Generalmente se usan para colecciones de objetos
        Persona p = new Persona();
        p.setNombre("Jose");
        p.setCuenta(1);
        p.setMonto(1500);
        
        Persona p1 = new Persona();
        p1.setNombre("alrbeto");
        p1.setCuenta(2);
        p1.setMonto(1500000);
        
        Persona p2 = new Persona();
        p2.setNombre("marlen");
        p.setCuenta(3);
        p.setMonto(1502555550);
        /*
        List<String> lista = new ArrayList();
        lista.add("elemento");
        lista.add("jorge");
        lista.add("malo");
        */
        List<Persona> lista = new ArrayList();
        lista.add(p);
        lista.add(p1);
        lista.add(p2);
        /*
        for(String s : lista){
            //System.out.println(s);
        }*/
        for(Persona s : lista){
            System.out.println(s.getNombre());
        }
        //Iterator, objeto que permite recorrer sobre una lista
        Iterator<Persona> iterador = lista.iterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
    }
}
