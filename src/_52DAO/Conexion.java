/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _52DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author root
 */
public class Conexion {
    protected Connection conexion;
        private final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
        //ruta en la que se hace conexion a la BD
        private final String DB_URL = "jdbc:mysql://localhost/ejemplojava";
        //BD credenciales
        private final String USER ="root";
        private final String PASS="password";
        
        public void conectar() throws Exception{
            try{
                conexion= DriverManager.getConnection(DB_URL,USER,PASS);
                //El error es que puede darse una expcecion de class not found exception
                Class.forName(MYSQL_DRIVER);
            }catch(Exception e){
                throw e;
            }
        }
        public void cerrar() throws SQLException{
            if(conexion!=null){
                //Si la conexion aun permanece abierta
                if(!conexion.isClosed()){
                    conexion.close();
                }
            }
        }
}
