/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _43ThrowThrows;

/**
 *
 * @author root
 */
public class MainThrow {
    private void metodo1(){
        try{
            metodo2();
        }catch(Exception e){
            System.out.println("Metodo 1 exception" + e.getMessage());
            
        }
    }
    private void metodo2() throws Exception{
        try{
            metodo3();
        }catch(Exception e){
            //System.out.println(e.getMessage());
            //Enviarlo a la capa uno
            throw e;
        }
    }
    private void metodo3() throws Exception{
        try{
            //Caputar un error aproposito
            int division = 1/0;
        }catch(Exception e){
            //throw una instancia de clase
            //throw new Exception("Enviando a la capa superior");
            throw e;
            //Manejar este error por la capa 2
        }
    }
    /*
        throw lanza una excepcion y necesita de la palabbra new  y throws lanza una
        excepcion en particular
    */
    private void lanzarExcepcion(){
        //Aqui se lajza una excepcion a proposito
        
        throw new ArithmeticException();
    }
    public static void main(String[] args) {
        /*
            Como delegar una excepcion a un metodo que esta en un nivel superior
        
        */
        MainThrow m = new MainThrow();
        //m.metodo1();
        m.lanzarExcepcion();
    }
}
