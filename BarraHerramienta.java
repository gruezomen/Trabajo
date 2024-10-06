import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;


public class BarraHerramienta extends JInternalFrame{
    
        private JPanel contentPane;
        private JLabel etiqueta;
    
    public BarraHerramienta(/*JPanel ventana, JPanel mostrar*/){
        super("Barra de Herramientas", true, true, true, true);
        this.setSize(300, 300);
        this.setLocation(50,50);
        this.setVisible(true);
        
        
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);
        
        JButton clase = new  JButton("......");
        clase.setBounds(100,170, 30, 30);
        contentPane.add(clase);
        
        JButton relacion = new  JButton("......");
        relacion.setBounds(200,170, 30, 30);
        contentPane.add(relacion);
        
        
        /*clase.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Clase panelC = new Clase();
                
                
            }
        });*/
    }
    
}
