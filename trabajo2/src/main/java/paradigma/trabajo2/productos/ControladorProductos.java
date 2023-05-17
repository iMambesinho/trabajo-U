/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradigma.trabajo2.productos;

import javax.swing.JOptionPane;

/**
 *
 * @author niko0
 */
public class ControladorProductos {
    private final ModeloProductos modelo_productos;
    private final VistaProductos vista_productos;
    
    public ControladorProductos() {
        modelo_productos = new ModeloProductos();
        vista_productos = new VistaProductos(this);
        vista_productos.setVisible(true);
    }
    
    public void agregarProducto(String nombre, String precio_string, String peso_string, String volumen_string ) {
        
        float precio = 0, peso = 0, volumen = 0; 
        
              
        if (nombre.equals("")){
           JOptionPane.showMessageDialog(null,"Rellena la casilla Nombre");
           return;
        }
        
        
        
        if (precio_string.equals("")){
           JOptionPane.showMessageDialog(null,"Rellena la casilla Precio");
           return;
        }
        else {          
            try {
               precio=Float.parseFloat(precio_string);
            }
            catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Ingresaste mal los datos del Precio");
                return;
            }      
        }
        
        
        if (peso_string.equals("")){
           JOptionPane.showMessageDialog(null,"Rellena la casilla Peso");
           return;
        }
        else {          
            try {
               peso=Float.parseFloat(peso_string);
            }
            catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Ingresaste mal los datos del Peso");
                return;
            }      
        }
        
        
        
        if (volumen_string.equals("")){
           JOptionPane.showMessageDialog(null,"Rellena la casilla Volumen");
           return;
        }
        else {          
            try {
               volumen=Float.parseFloat(volumen_string);
            }
            catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Ingresaste mal los datos del Volumen");
                return;
            }       
        }
        if (modelo_productos.agregarProducto(nombre, precio,peso,volumen)){
            JOptionPane.showMessageDialog(null,"Se agrego correctamente el producto");
            
        }
    }
}
