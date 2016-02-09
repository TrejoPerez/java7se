/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _41Excepciones;

/**
 *
 * @author root
 */
public class MainExcepciones {
    private void proceso1(){
        int a=7,b =0;
        int division = a/b;
    }
    public static void main(String[] args) {
        /*
        try{}
        catch(){}
        finally{}
        */
        try{
            //proceso 1
            MainExcepciones m = new MainExcepciones();
            m.proceso1();
        }catch(Exception e){
            //manejo de excepcion
            System.out.println(e);
        }finally{
            //Este bloque se ejecuta si o si
            System.out.println("Bloque finally");
        }
    }
}
