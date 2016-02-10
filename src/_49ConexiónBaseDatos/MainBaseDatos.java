/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _49ConexiónBaseDatos;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author root
 * Patron de diseño ?= Conjunto destandarisado para odrenar la forma de trabajar(ordenar el codigo
 * otros desarrolladores entiendan el codig)
 * DAO=Separa la logica de la aplicacion con el acceso a la BD, con el fin de tener un orden
 */
public class MainBaseDatos {
    public static void main(String[] args) throws SQLException {
        /*
            JAva por defecto trae un API para poder acceder a la BD, es el JDB 
        son mecanismos para interactuar con diferentes BD, sql, postgrest, oracle
        Se tiene que tener una BD instalada
        Se uasara postgres
        */
        //permite distinguir que tipo de bd se va a usar
        final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
        //ruta en la que se hace conexion a la BD
        final String DB_URL = "jdbc:mysql://localhost/ejemplojava";
        //BD credenciales
        final String USER ="root";
        final String PASS="password";
        //Conexion 
        //Connection conexion = null;
        //Intentarlo con trywithresources
        try(Connection conexion= DriverManager.getConnection(DB_URL,USER,PASS)){
            //
           Class.forName(MYSQL_DRIVER);
           //Conexion atravez del DRIVERMANAGER
           //conexion= DriverManager.getConnection(DB_URL,USER,PASS);
           //PreparedStatement=Clase para interactuar operaciones CRUD en BD
            PreparedStatement st = (PreparedStatement) conexion.prepareStatement("INSERT INTO `persona`(`nombre`) VALUES ('Trejo perez')");
            //Aqui se ejecuta el bloque de arriba
            st.executeUpdate();
            //Se cierra la sentecia
            st.close();
        }catch(Exception e){
            e.getMessage();
        }/*finally{
        //El try with resoruces maneja el finally de forma implicita
            //Aqui se liberan los recursos
            //Si la conexion se logro realizar
            //Se manda el error porque el try with resources
            if(conexion!=null){
                    !conexion.isClosed()=Si esta diferente de cerrado, se cierra
                
                if(!conexion.isClosed()){
                    //La conexion se cierra
                    conexion.close();
                }
            }
        }*/
    }
}
