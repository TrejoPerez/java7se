/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _38LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author root
 */
public class MainLinkedList {
    public static void main(String[] args) {
        /*
            LinkedList=Sus elementos tienen una referencia con su siguente elemento
        */
        List<Integer> lista = new LinkedList();
        //LinkedList lista2= new LinkedList();
        lista.add(1);
        lista.add(2);
        lista.add(2);

        System.out.println(lista.size());
        System.out.println(lista.get(0));
        System.out.println(lista.get(lista.size()-1));
    }
  
}
