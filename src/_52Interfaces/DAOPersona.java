/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _52Interfaces;

import _52PatronDAO.Persona;
import java.util.List;

/**
 *
 * @author root
 */
public interface DAOPersona {
    //Plantilla
    public void registrar(Persona per) throws Exception;
    public void modificar(Persona per) throws Exception;
    public void eliminar(Persona per) throws Exception;
    public List<Persona> listar() throws Exception;
    
    
}
