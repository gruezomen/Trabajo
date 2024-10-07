import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.*;


public class PrincipalOther {
    public static void main(String args[]){
        //Conexion conexion = new Conexion();
        //conexion.conectarMySQL();
        //conexion.cerrarConexion();
        //conexion.registrar("Philipinas", "2");
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ventana frame = new Ventana();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
