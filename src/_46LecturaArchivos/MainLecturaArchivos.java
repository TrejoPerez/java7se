/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _46LecturaArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class MainLecturaArchivos {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        /*
            Las imagenes se guardan en bytes
            FileReader = Se hace una lectura de una fuente
        
        */
        File f = new File("/root/texto.txt");
        FileReader fr = new FileReader(f);
        //Reccore el conteido del archivo txt
        BufferedReader bf = new BufferedReader(fr);
        String t;
        while((t=bf.readLine())!= null){
            System.out.println(t); 
        }
        bf.close();
        FileInputStream fis = new FileInputStream(f);
        //El scanner es para tambien poder leer el fis y se le pasa el tipo de formato
        Scanner sc = new Scanner(fis,"UTF-8");
        //Caputar el contenido de la entrada del escaner
        String t1= sc.next();
        //El sout de la captura de la variable scanner
        System.out.println("Soy el t1: "+t1);
        fis.close();
        /*if(fis.read()!=-1){
            //Retorna un bytecode
            System.out.println(fis.read());
        }*/
        
    }
    
}
