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
                
                //Suma de los numeros de la Terera Columna:
                int su1c2 = sn1c2 + sn2c2;      
                int su2c2 = sn2c2 + sn3c2;     
                int su3c2 = sn3c2 + sn4c2;     
                int su4c2 = sn4c2 + sn5c2;     
                int su5c2 = sn5c2 + sn6c2;      
                int su6c2 = sn6c2 + sn7c2;      
                int su7c2 = sn7c2 + sn8c2;      
                int su8c2 = sn8c2 + sn9c2;      
                int su9c2 = sn9c2 + sn10c2;
                int su10c2 = sn10c2 + sn11c2;
                int su11c2 = sn11c2 + sn12c2;
                int su12c2 = sn12c2 + sn13c2;
                int su13c2 = sn13c2 + sn14c2;
                int su14c2 = sn14c2 + sn15c2;
                int su15c2 = sn15c2 + sn16c2;
                int su16c2 = sn16c2 + sn17c2;
                
                //Separacion de numeros(terseraColumna):
                int sn1c3 = su1c2 % 10;     
                int sn2c3 = su2c2 % 10;      
                int sn3c3 = su3c2 % 10;     
                int sn4c3 = su4c2 % 10;     
                int sn5c3 = su5c2 % 10;     
                int sn6c3 = su6c2 % 10;       
                int sn7c3 = su7c2 % 10;       
                int sn8c3 = su8c2 % 10;     
                int sn9c3 = su9c2 % 10;
                int sn10c3 = su10c2 % 10;
                int sn11c3 = su11c2 % 10;
                int sn12c3 = su12c2 % 10;
                int sn13c3 = su13c2 % 10;
                int sn14c3 = su14c2 % 10;  
                int sn15c3 = su15c2 % 10;
                int sn16c3 = su16c2 % 10;
                
                //Suma de los numeros de la cuarta Columna:
                int su1c4 = sn1c3 + sn2c3;      
                int su2c4 = sn2c3 + sn3c3;      
                int su3c4 = sn3c3 + sn4c3;      
                int su4c4 = sn4c3 + sn5c3;      
                int su5c4 = sn5c3 + sn6c3;      
                int su6c4 = sn6c3 + sn7c3;      
                int su7c4 = sn7c3 + sn8c3;      
                int su8c4 = sn8c3 + sn9c3;      
                int su9c4 = sn9c3 + sn10c3;
                int su10c4 = sn10c3 + sn11c3;
                int su11c4 = sn11c3 + sn12c3;
                int su12c4 = sn12c3 + sn13c3;
                int su13c4 = sn13c3 + sn14c3;
                int su14c4 = sn14c3 + sn15c3;
                int su15c4 = sn15c3 + sn16c3;
                
                //Separacion de numeros(cuartaColumna):
                int sn1c4 = su1c4 % 10;     
                int sn2c4 = su2c4 % 10;      
                int sn3c4 = su3c4 % 10;       
                int sn4c4 = su4c4 % 10;      
                int sn5c4 = su5c4 % 10;     
                int sn6c4 = su6c4 % 10;      
                int sn7c4 = su7c4 % 10;       
                int sn8c4 = su8c4 % 10;     
                int sn9c4 = su9c4 % 10;
                int sn10c4 = su10c4 % 10;
                int sn11c4 = su11c4 % 10;
                int sn12c4 = su12c4 % 10;
                int sn13c4 = su13c4 % 10; 
                int sn14c4 = su14c4 % 10; 
                int sn15c4 = su15c4 % 10;
                
                
                
                
                
                
                
               
                
                
                
                }
        };
        
        jBCalcular.addActionListener(listeners);
         
        
        
        
        
        
    }
    public static void main(String[] args) {

    }    
}
