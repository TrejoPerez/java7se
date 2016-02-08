/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _32ManejoFechasDateCalendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author root
 */
public class MainCalendarDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        int anio = fecha.getYear();
        int dia = fecha.getDate();
        /*
            calendar y calendargregoriano=Cuando no se hace referecnai a que tipo de clase se instaiciara
        De acuerdo a la clase, 
        Gregorian calendar puede obtener parametros en el constructor
        */
        //System.out.println(dia);
        //System.out.println(anio+1900);
        //JDK 6 y se usa calendar y apartir de la 8 se usa TIME
        /*No se puede instanciar ya que calendar es una clase abstracta
        Calendar calendario = new Calendar();
        
        Calendar calendario = Calendar.getInstance();
        int an = calendario.get(Calendar.YEAR);
        System.out.println(an);
        
        Calendar calendario = new GregorianCalendar();
        int an = calendario.get(Calendar.YEAR);
        System.out.println(an);
        */
        Calendar calendario = new GregorianCalendar(2015, Calendar.DECEMBER, 25);
        int mes = calendario.get(Calendar.MONTH);
        System.out.println(mes);
        
        
    }
    
}
