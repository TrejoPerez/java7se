/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _44ExcepcionesPersonalizadas;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class MainPersonalizadas {

    /**
     * @param args the command line arguments
     * Se tienen que manejar ciertos errores propios personalizables
     */
    public static void main(String[] args) throws EdadExcepcion{
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        //Para declarar valores finales es mejor usar finally
        final int EDAD_MAXIMA = 100;
        if(edad < EDAD_MAXIMA){
            System.out.println("Bienvenido");
        }else{
            //Las excepciones tiene que ser capturadas dentro de un try catch
            //Tambioen se puede evitar el bloque trycatch si se usa la palabra throws 
            //y se maneja la excepcion creada
            //try{
                throw new EdadExcepcion("Edad no permitida o edad no correcta");
            //}
            //catch(Exception e){  System.out.println("Tu errror fue "+e.getMessage());}
            
        }
    }
    
}
