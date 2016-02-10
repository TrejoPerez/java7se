/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _48TryWithResources;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author root
 */
public class MainResources {
    public static void main(String[] args) {
        /*
            Alternativa para poder acceder a recursos y que sean manejados por java
        */
          /*
            FileWriter y Printwriter
        */
        //FileWriter archivo = null;
        PrintWriter printer;
        //En el bloque try va el recurso al que se necesita acceder
        File f = new File("/root/trejo.txt");
        try(FileWriter archivo = new FileWriter(f,true)){
            
            
            //Que hacer si el archivo ya existe y se quiere seguir adicikonando
            
            
            printer = new PrintWriter(archivo);
            
            printer.println("try with resoruces");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
