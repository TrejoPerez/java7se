/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _56PaletaSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author root
 */
public class MainPaletaSwing {
    public static void main(String[] args) {
        //Swing=compoentes para seleccionar componentes, labels, textbox
        final JFrame ventana = new JFrame("Mi primer ventana swing");
        ventana.setSize(300, 200);
        ventana.setVisible(true);
        //Agregar un jPanel
        JPanel jP = new JPanel();
        //Agregar un boton
        JButton jB = new JButton("Saludar");
        JButton jB1 = new JButton("Adios");
        jP.add(jB);
        jP.add(jB1);
        ventana.add(jP);
        //Liberar los recuross de la ventana
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //ventana.add(jB);
        jB.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, "Hola trejo");
                String captura = JOptionPane.showInputDialog(null, "Ingrese nombre");
                JOptionPane.showMessageDialog(null, "Hola "+captura);
            }     
        });
        jB1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.dispatchEvent(new WindowEvent(ventana,WindowEvent.WINDOW_CLOSING));
            }
        });
    }
}
