/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _47EscrituraArchivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author root
 */
public class MainEscrituraArchivos {
    public static void main(String[] args) throws IOException {
        /*
            FileWriter y Printwriter
        */
        FileWriter archivo = null;
        PrintWriter printer;
        try{
            
            File f = new File("/root/trejo.txt");
            //Que hacer si el archivo ya existe y se quiere seguir adicikonando
            archivo = new FileWriter(f,true);
            
            printer = new PrintWriter(archivo);
            
            printer.println(" Buen curso de java");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            //Indicar la liberacion o cierre del archivo
            if(archivo!=null)archivo.close();
            System.out.println("Archivo Cerrado");
        }
    }
 
}
