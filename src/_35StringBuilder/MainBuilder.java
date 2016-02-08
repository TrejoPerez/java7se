/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _35StringBuilder;

/**
 *
 * @author root
 */
public class MainBuilder {
    /*  Los String son inmutables
        StringBuilder = Es crecomendale usarlco cuando se quieran usar concatenaciones de Strings 
        
    Diferencia, el rendimiento entre concatenacion con signo mas y atravez del metodo append
    Con el signo + i9mplicitamente se esta haciendo el Stringbuilkder obeniendo 
    el metodo toString haciendo referencia a esa misma direccion de memoria
    */
    public static void main(String[] args) {
        
        /*String texto = "Hoola soy trejo";
        texto = " Suscribete "+" al canal";
        System.out.println(texto);
        StringBuilder textoBuilder = new StringBuilder();
        textoBuilder.append("Hola soy trejo").append("Suscribete al canal");
        System.out.println(textoBuilder.toString());
        */
        long tiempo_inicio = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<1000;i++){
            stringBuilder.append(i);
            
        }
        long tiempo_fin = System.nanoTime();
        double diferencia = (tiempo_fin - tiempo_inicio);
        System.out.println(diferencia);
        //---------------------------
        long tiempo_inicio2 = System.nanoTime();
        String texto="";
        for(int i=0;i<1000;i++){
            texto +=  i;
            
        }
        long tiempo_fin2 = System.nanoTime();
        double diferencia2 = (tiempo_fin2 - tiempo_inicio2);
        System.out.println(diferencia2);
    }
    
    
}
