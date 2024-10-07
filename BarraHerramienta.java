import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BarraHerramienta extends JInternalFrame{
    
        private JPanel contentPane;
        private JLabel etiqueta;
    
    public BarraHerramienta(JDesktopPane ventana){
        super("Barra de Herramientas", true, true, true, true);
        this.setSize(200, 250);
        this.setLocation(50,50);
        this.setVisible(true);
        
        
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);
        
        JButton clase = new  JButton("Clase");
        clase.setBounds(20,20, 70, 30);
        contentPane.add(clase);
        
        JButton relacion = new  JButton("Relacion");
        relacion.setBounds(90,20, 90, 30);
        contentPane.add(relacion);
        
        
        clase.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Clase panelC = new Clase();
                ventana.add(panelC);
                
            }
        });
    }
    
}
