/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _39HashMapDiccionario;

import java.util.HashMap;

/**
 *
 * @author root
 */
public class MainDiccionarios {
    public static void main(String[] args) {
        /*
            HashMap = permite tener varios elementos con un identificador
        */
        HashMap diccionario = new HashMap();
        diccionario.put("user", "Trejo");
        diccionario.put("youtube", "mitocode");
        diccionario.put("facebook", "facebook.com");
        String respuesta = (String)diccionario.get("user");
        System.out.println(respuesta);
        //get devuelve un pbjeto de tipo object, se puede usar el casting
        //o el metodo toString
        String respuesta1 = diccionario.get("youtube").toString();
        System.out.println(respuesta1);
        //Comprobar si existe una lalve
        boolean resp = diccionario.containsKey("twitter");
        System.out.println(resp);
        //Para usar el paso de parametrois en reportes, es necesaio usar las keys para acceder a ellos
    }
}
