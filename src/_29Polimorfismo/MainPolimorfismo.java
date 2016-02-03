/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _29Polimorfismo;

/**
 *
 * @author root
 */
public class MainPolimorfismo {
    public static void main(String[] args){
        //Un objeto se comporta de distintas maneras dependiendo quien lo herede
        Animal p = new Perro("pastor", "kaiser", "carne", 2);
        p.alimentarse();
        Animal c = new Caballo("caballo", "hojas",4);
        c.alimentarse();
    }
}
