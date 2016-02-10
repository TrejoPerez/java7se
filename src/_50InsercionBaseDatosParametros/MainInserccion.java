/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _50InsercionBaseDatosParametros;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 *
 * @author root
 */
//Solicitar al usuario los datos para ser grabados
public class MainInserccion {
    public String solicitarValores(){
        Scanner sc= new Scanner(System.in);
        String nombre = sc.next();
        return nombre;
        
    }
    public void registrarBD(String valor){
         /*
            JAva por defecto trae un API para poder acceder a la BD, es el JDB 
        son mecanismos para interactuar con d,iferentes BD, sql, postgrest, oracle
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
           //Cada ? es un parametro
            PreparedStatement st = (PreparedStatement) conexion.prepareStatement("INSERT INTO `persona`(`nombre`) VALUES (?)");
            //El 1 corresponder al primer ?
            st.setString(1, valor);
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
    public static void main(String[] args) {
        MainInserccion ms = new MainInserccion();
        String valor = ms.solicitarValores();
        if(valor!=null){
            ms.registrarBD(valor);
        }
        
    }
}
