/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradigma.trabajo2.productos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author niko0
 */
public class ModeloProductos {
    private  final String driver="com.mysql.jdbc.Driver";
    private  final String user="root";
    private  final String pass="NM24c08";
    private  final String url="jdbc:mysql://localhost:3306/inventario";
    private Connection con;
    
    
     public void conector() {
     // Reseteamos a null la conexion a la b
        try{
            Class.forName(driver);
            // Nos conectamos a la bd
            con= (Connection) DriverManager.getConnection(url, user, pass);
            // Si la conexion fue exitosa mostramos un mensaje de conexion exitosa            
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Conexion fallida");
        }
    }
    public boolean agregarProducto(String nombre,float precio,float peso,float volumen){
        conector();
        try {
            PreparedStatement sql = con.prepareStatement("INSERT INTO productos (Nombre, Precio, Peso, Volumen) VALUES (?,?,?,?)");
            sql.setString(1,nombre);
            sql.setFloat(2,precio);
            sql.setFloat(3,peso);
            sql.setFloat(4,volumen);
            sql.execute();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"La informacion NO PUDO ENVIARSE");
            return false;
        }
        finally{
            try {
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"La base de datos no se pudo cerrar");
            }
        }
            
        return true; 
       
    }
}

