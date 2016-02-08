/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _38LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author root
 */
public class RendimientoListas {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        long inicio1 = System.currentTimeMillis();
        
        for(int i =0;i<10000;i++){
            arrayList.add(i);
        }
        long fin1 = System.currentTimeMillis();
        System.out.println("arrayList add:  "+(fin1 - inicio1));
        //--------------------------
        long inicio2 = System.currentTimeMillis();
        for(int i =0;i<10000;i++){
            linkedList.add(i);
        }
        long fin2 = System.currentTimeMillis();
        System.out.println("linkedList add: "+(fin2 - inicio2));
        
        //operaciones get
        
        inicio1 = System.currentTimeMillis();
        for(int i =0;i<10000;i++){
            arrayList.get(i);
        }
         fin1 = System.currentTimeMillis();
        System.out.println("arrayList get:  "+(fin1 - inicio1));
        //--------------------------
        inicio2 = System.currentTimeMillis();
        for(int i =0;i<10000;i++){
            linkedList.get(i);
        }
       
         fin2 = System.currentTimeMillis();
        System.out.println("linkedList get: "+(fin2 - inicio2));
        
        //Operaciones remove
        inicio1 = System.currentTimeMillis();
        for(int i =9999;i>=0;i--){
            arrayList.remove(i);
        }
         fin1 = System.currentTimeMillis();
        System.out.println("arrayList remove:  "+(fin1 - inicio1));
        //--------------------------
        inicio2 = System.currentTimeMillis();
        for(int i =9999;i>=0;i--){
            linkedList.remove(i);
        }
       
         fin2 = System.currentTimeMillis();
        System.out.println("linkedList remove: "+(fin2 - inicio2));
        
        /*
            El get de arraylist es mejor porque se va directo al elemento y en linked list se tiene que
            recorrer nodo tras nodo
        arraylist para acceder varias veces a los elementos
        linked list en operaciones de agregar y remover
        */
        
        
    }
}
