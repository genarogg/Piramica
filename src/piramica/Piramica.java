package piramica;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Genarogg
 */

public class Piramica {
    JPanel jPanelSuperior,jPanelMedio;
    JButton jBCalcular;
    JTextArea jTextA;
    
    //Variables de introduccion de datos a la piramide:
    
    JTextField jT1;     
    JTextField jT2;     
    JTextField jT3;     
    JTextField jT4;     
    JTextField jT5;     
    JTextField jT6;     
    JTextField jT7;     
    JTextField jT8;     
    JTextField jT9;
    JTextField jT11; 
    JTextField jT10;
    JTextField jT12;
    JTextField jT13;     
    JTextField jT14;
    JTextField jT15;
    JTextField jT16;
    JTextField jT17;
    JTextField jT18;
    
    public void construccionDePanelMedio(){
       //Invocacion
       jPanelMedio = new JPanel();
       jTextA = new JTextArea(18,25);
       
       //Tamaño y fuene de la letra
       jTextA.setFont(new Font(null ,1, 24));
       jTextA.setForeground(new java.awt.Color(0, 102, 204));
       
       //anular la edicion del area de texto
       jTextA.setEditable(false);
       
       //Layout de panel 
       FlowLayout flowL = new FlowLayout(FlowLayout.LEFT);
       
       //añadir layout al panel
       jPanelMedio.setLayout(flowL);
       
       //añadir el area de texto a jpanel
       jPanelMedio.add(jTextA);     
    }
    
    public static void main(String[] args) {

    }    
}
