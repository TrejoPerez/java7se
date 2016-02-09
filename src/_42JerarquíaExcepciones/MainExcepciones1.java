/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _42JerarquíaExcepciones;

/**
 *
 * @author root
 */
public class MainExcepciones1 {
   private void proceso1(){
        int a=7,b =0;
        int division = a/b;
    }
    public static void main(String[] args) {
        /*
        try{}
        catch(){}
        finally{}
        La clase exception es la mayor de todas
        No puede habwer una excepcion amyou y una menor
        NullPointerException=Se genera cuando no se instancia a un objeto
        */
        try{
            //proceso 1
            MainExcepciones1 m =null;
            m.proceso1();
            //ArithmeticException a
            //
        }catch(NullPointerException a){
            //manejo de excepcion
            System.out.println(a.getMessage());
        }catch(ArithmeticException ax){
            System.out.println(ax.getMessage());
        }catch(Exception ex){
            
        }
            finally{
            //Este bloque se ejecuta si o si
            System.out.println("Bloque finally");
        }
    }
}
