/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _52PatronDAO;

import _52DAO.DAOPersonaImpl;
import _52Interfaces.DAOPersona;

/**
 *
 * @author root
 */
public class MainDAO {
    public static void main(String[] args) {
        //Persona per = new Persona();
        //per.setId(6);
        //per.setNombre("Marleneeeeeeeeeeeeeeee");
        //per.setNombre("Josetrejoperez");
        try{
            DAOPersona dao = new DAOPersonaImpl();
            //dao.registrar(per);
            //dao.modificar(per);
            //dao.eliminar(per);
            for(Persona p :dao.listar()){
            System.out.println(p.getId() + " - " + p.getNombre());
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
