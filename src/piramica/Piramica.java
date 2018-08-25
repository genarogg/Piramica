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

                //Seguda columna de la piramide(suma):
                int c2n1 = c1n1 + c1n2;
                int c2n2 = c1n2 + c1n3; 
                int c2n3 = c1n3 + c1n4;
                int c2n4 = c1n4 + c1n5;
                int c2n5 = c1n5 + c1n6;
                int c2n6 = c1n6 + c1n7;
                int c2n7 = c1n7 + c1n8;
                int c2n8 = c1n8 + c1n9; 
                int c2n9 = c1n9 + c1n10;
                int c2n10 = c1n10 + c1n11;
                int c2n11 = c1n11 + c1n12;
                int c2n12 = c1n12 + c1n13;
                int c2n13 = c1n13 + c1n14;    
                int c2n14 = c1n14 + c1n15; 
                int c2n15 = c1n15 + c1n16;     
                int c2n16 = c1n16 + c1n17; 
                int c2n17 = c1n17 + c1n18;
                
                //Separacion de numeros(segundaColumna):
                int sn1c2 = c2n1 % 10;     
                int sn2c2 = c2n2 % 10;      
                int sn3c2 = c2n3 % 10;     
                int sn4c2 = c2n4 % 10;     
                int sn5c2 = c2n5 % 10;       
                int sn6c2 = c2n6 % 10;     
                int sn7c2 = c2n7 % 10;     
                int sn8c2 = c2n8 % 10;     
                int sn9c2 = c2n9 % 10;
                int sn10c2 = c2n10 % 10;
                int sn11c2 = c2n11 % 10;
                int sn12c2 = c2n12 % 10;
                int sn13c2 = c2n13 % 10; 
                int sn14c2 = c2n14 % 10;
                int sn15c2 = c2n15 % 10;  
                int sn16c2 = c2n16 % 10;  
                int sn17c2 = c2n17 % 10; 
                
                
                
                
                
                
                
                
               
                
                
                
                }
        };
        
        jBCalcular.addActionListener(listeners);
         
        
        
        
        
        
    }
    public static void main(String[] args) {

    }    
}
