/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _40HashSet;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author root
 */
public class MainHashSet {
    public static void main(String[] args) {
        /*
        Este tipo de variable es ipredecibe, no permite valores repetidos
        implementar treeSet (Parte de la interfaz set)
        linkedhjasset=combina el poder en un hashset y un linkedlist
    */
    Set<String> lista = new HashSet<String>();
    lista.add("a");
    lista.add("b");
    lista.add("a");
    lista.add("a");
    lista.add("e");
    for(String dat:lista){
        System.out.println(dat);
    }
    
    }
}
