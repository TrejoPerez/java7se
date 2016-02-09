/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _45File;

import java.io.File;

/**
 *
 * @author root
 */
public class MainFile {
    public static void main(String[] args) throws Exception{
       File archivo = new File("/root/Seguridad Informatica/trejo.txt");
       boolean respuesta = archivo.exists();
        System.out.println(respuesta);
        //Crear un directorio
        File archivo2 = new File("/root/Seguridad Informatica/java");
        boolean respuesta2=archivo2.mkdir();
        System.out.println(respuesta2);
        
        //Crear varios direcctorios
        
        File archivo3 = new File("/root/Seguridad Informatica/java/java1/java2");
        boolean respuesta3=archivo3.mkdirs();
        System.out.println(respuesta3);
        
        //Renombrar
        File archivo4 = new File("/root/Seguridad Informatica/trejo.txt");
        boolean respuesta4 = archivo4.renameTo(new File ("/root/Seguridad Informatica/trejop.txt"));
        System.out.println(respuesta4);
        
        //Borrar
        File archivo5 = new File("/root/Seguridad Informatica/trejop.txt");
        boolean respuesta5 = archivo5.delete();
        System.out.println(respuesta5);
    }
}
