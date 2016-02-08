/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _34EjemploAplicativo1;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Banco b = new Banco();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("Bienvenido al banco xyz, ingresa tu numero de cuenta");
        int cuenta = sc.nextInt();
        switch(cuenta){
            case 1:
                System.out.println("Bienvenido " + b.getPer1().getNombre());
                System.out.println("--------------------------------");
                System.out.println("Ingrese la operacion a realizar");
                System.out.println("A)Depositar");
                System.out.println("B)Retirar");
                String operacion = sc.next();
                switch (operacion){
                    case "A":
                        System.out.println("--------------------------------");
                        System.out.println("Ingrese el monto a depositar: ");
                        double montoDeposito = sc.nextDouble();
                        b.getPer1().setMonto(b.getPer1().getMonto() + montoDeposito);
                        System.out.println("El monto final es "+b.getPer1().getMonto());
                        break;
                    case "B":
                        System.out.println("--------------------------------");
                        System.out.println("Ingrese el monto a retirar: ");
                        double montoRetirar = sc.nextDouble();
                        b.getPer1().setMonto(b.getPer1().getMonto() - montoRetirar);
                        System.out.println("El monto final es "+b.getPer1().getMonto());

                        
                        break;
                }
                break;
            case 2:
                System.out.println("Bienvenido " + b.getPer2().getNombre());
                System.out.println("--------------------------------");
                System.out.println("Ingrese la operacion a realizar");
                System.out.println("A)Depositar");
                System.out.println("B)Retirar");
                String operacion1 = sc.next();

                  switch (operacion1){
                    case "A":
                        System.out.println("--------------------------------");
                        System.out.println("Ingrese el monto a depositar: ");
                        double montoDeposito = sc.nextDouble();
                        b.getPer2().setMonto(b.getPer2().getMonto() + montoDeposito);
                        System.out.println("El monto final es "+b.getPer2().getMonto());
                        break;
                    case "B":
                        System.out.println("--------------------------------");
                        System.out.println("Ingrese el monto a retirar: ");
                        double montoRetirar = sc.nextDouble();
                        b.getPer2().setMonto(b.getPer2().getMonto() - montoRetirar);
                        System.out.println("El monto final es "+b.getPer2().getMonto());

                        
                        break;
                }
                break;
            case 3:
                System.out.println("Bienvenido " + b.getPer3().getNombre());
                System.out.println("--------------------------------");
                System.out.println("Ingrese la operacion a realizar");
                System.out.println("A)Depositar");
                System.out.println("B)Retirar");
                String operacion2 = sc.next();
                  switch (operacion2){
                    case "A":
                        System.out.println("--------------------------------");
                        System.out.println("Ingrese el monto a depositar: ");
                        double montoDeposito = sc.nextDouble();
                        b.getPer3().setMonto(b.getPer3().getMonto() + montoDeposito);
                        System.out.println("El monto final es "+b.getPer3().getMonto());
                        break;
                    case "B":
                        System.out.println("--------------------------------");
                        System.out.println("Ingrese el monto a retirar: ");
                        double montoRetirar = sc.nextDouble();
                        b.getPer3().setMonto(b.getPer3().getMonto() - montoRetirar);
                        System.out.println("El monto final es "+b.getPer3().getMonto());

                        
                        break;
                }
                break;
            default:
                System.out.println("Cuenta no registrada");
                System.exit(0);
        }
        System.out.println(b.getPer1().getMonto() + b.getPer2().getMonto() + b.getPer3().getMonto());
    }
    
}
