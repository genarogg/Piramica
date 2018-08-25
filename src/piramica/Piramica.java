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
    
    public void construccionDePanelSupertior(){
        jPanelSuperior = new JPanel(); 
        
        //boton de accion
        jBCalcular = new JButton("Calcular");
         ActionListener listeners = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sN1 = jT1.getText();     
                String sN2 = jT2.getText();      
                String sN3 = jT3.getText();     
                String sN4 = jT4.getText();     
                String sN5 = jT5.getText();     
                String sN6 = jT6.getText();     
                String sN7 = jT7.getText();     
                String sN8 = jT8.getText();     
                String sN9 = jT9.getText();     
                String sN10 = jT10.getText();
                String sN11 = jT11.getText();
                String sN12 = jT12.getText();
                String sN13 = jT13.getText();
                String sN14 = jT14.getText();
                String sN15 = jT15.getText();
                String sN16 = jT16.getText();
                String sN17 = jT17.getText();
                String sN18 = jT18.getText();
                
                //Primera columna de la piramide:
                int c1n1 = Integer.parseInt(sN1);      
                int c1n2 = Integer.parseInt(sN2);      
                int c1n3 = Integer.parseInt(sN3);      
                int c1n4 = Integer.parseInt(sN4);      
                int c1n5 = Integer.parseInt(sN5);      
                int c1n6 = Integer.parseInt(sN6);      
                int c1n7 = Integer.parseInt(sN7);      
                int c1n8 = Integer.parseInt(sN8);      
                int c1n9 = Integer.parseInt(sN9); 
                int c1n10 = Integer.parseInt(sN10);
                int c1n11 = Integer.parseInt(sN11);
                int c1n12 = Integer.parseInt(sN12);
                int c1n13 = Integer.parseInt(sN13);
                int c1n14 = Integer.parseInt(sN14);
                int c1n15 = Integer.parseInt(sN15);
                int c1n16 = Integer.parseInt(sN16);
                int c1n17 = Integer.parseInt(sN17);
                int c1n18 = Integer.parseInt(sN18);

                
                
                
                
                
                
                
               
                
                
                
                }
        };
        
        jBCalcular.addActionListener(listeners);
         
        
        
        
        
        
    }
    public static void main(String[] args) {

    }    
}
