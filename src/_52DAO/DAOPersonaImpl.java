/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _52DAO;

import _52Interfaces.DAOPersona;
import _52PatronDAO.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class DAOPersonaImpl extends Conexion implements DAOPersona{

    @Override
    public void registrar(Persona per) throws Exception {
        try{
            this.conectar();
            PreparedStatement ps =this.conexion.prepareStatement("INSERT INTO persona(nombre) VALUES(?)");
            ps.setString(1, per.getNombre());
            ps.executeUpdate();
        }catch(Exception e){
            //enviar el error a una capa superior para que sea mostrado al usuario
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void modificar(Persona per) throws Exception {
        try{
            this.conectar();
            
            PreparedStatement ps =this.conexion.prepareStatement("UPDATE persona set nombre =? where Id_serial = ?");
            ps.setString(1, per.getNombre());
            ps.setInt(2, per.getId());
            ps.executeUpdate();
        }catch(Exception e){
            //enviar el error a una capa superior para que sea mostrado al usuario
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void eliminar(Persona per) throws Exception {
        try{
            this.conectar();
            PreparedStatement ps =this.conexion.prepareStatement("DELETE FROM persona WHERE Id_serial=?");
            ps.setInt(1, per.getId());
            ps.executeUpdate();
        }catch(Exception e){
            //enviar el error a una capa superior para que sea mostrado al usuario
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public List<Persona> listar() throws Exception {
        List<Persona> lista = null;
        try{
            this.conectar();
            PreparedStatement ps =this.conexion.prepareStatement("SELECT * FROM persona");            
             lista = new ArrayList();
            ResultSet rs = ps.executeQuery();
           //Aqui se va recorriendo el ResulSet
           while(rs.next()){
               //Almacenar los datos en un objeto
               Persona per = new Persona();
               per.setId(rs.getInt("Id_serial"));
               per.setNombre(rs.getString("nombre"));
               lista.add(per);
           }
           //Cuando se cierra el statemen se cierra el resulset 
           rs.close();
            ps.close();
        }catch(Exception e){
            //enviar el error a una capa superior para que sea mostrado al usuario
            throw e;
        }finally{
            this.cerrar();
        }
        return lista;
    }
    
    
}
