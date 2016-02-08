/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _37ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class MainArray {
    public static void main(String[] args) {
        /*
            Collection c = Crear la lista apartir de otra coleccion
            int initialCapacity = Crear la lista con una capacidad inicial
        */
        long inicio1 = System.currentTimeMillis();
        List<Integer> lista = new ArrayList();
        for(int i =0;i<1000000;i++){
            lista.add(i);
        }/*
        lista.add(1);//1 Procesador 1bloque de memoria  
        lista.add(2);//1 Procesador 1bloque de memoria  
        lista.add(3);//1 Procesador 1bloque de memoria  
        lista.add(4);//1 Procesador 1bloque de memoria  
        lista.add(5);//1 Procesador 1bloque de memoria  
        */
        long fin1 = System.currentTimeMillis();
        System.out.println("Proceso1 "+(fin1 - inicio1));
        //Al momento de instanciar actuo una sola vez y separo 5 bloques de memoria
        //1 procesador 5 bloques, cuando lo reccorra solo le asignara su valor a cada bloque
        long inicio2 = System.currentTimeMillis();
        List<Integer> lista2 = new ArrayList(1000000);
        for(int i =0;i<1000000;i++){
            lista2.add(i);
        }
        /*
        lista2.add(1);//1 Procesador 1bloque de memoria  
        lista2.add(2);//1 Procesador 1bloque de memoria  
        lista2.add(3);//1 Procesador 1bloque de memoria  
        lista2.add(4);//1 Procesador 1bloque de memoria  
        lista2.add(5);//1 Procesador 1bloque de memoria  
        */
        long fin2 = System.currentTimeMillis();
        System.out.println("Proceso2 "+(fin2 - inicio2));
        
        int dato =lista2.get(500);
        System.out.println(dato);
        //operaciones, agregar,limpiar,remplazar,obtener posicion
    }
}
