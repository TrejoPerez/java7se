/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _34EjemploAplicativo1;

/**
 *
 * @author root
 */
public class Banco {
    private Persona per1;
    private Persona per2;
    private Persona per3;
    public Banco(){
        per1 = new Persona();
        per1.setCuenta(1);
        per1.setNombre("Mito");
        per1.setMonto(1000);
        per2 = new Persona();
        per2.setCuenta(2);
        per2.setNombre("Code");
        per2.setMonto(1000);
        per3 = new Persona();
        per3.setCuenta(3);
        per3.setNombre("Jaime");
        per3.setMonto(1000);
    }

    public Persona getPer1() {
        return per1;
    }

    public void setPer1(Persona per1) {
        this.per1 = per1;
    }

    public Persona getPer2() {
        return per2;
    }

    public void setPer2(Persona per2) {
        this.per2 = per2;
    }

    public Persona getPer3() {
        return per3;
    }

    public void setPer3(Persona per3) {
        this.per3 = per3;
    }
    
}
