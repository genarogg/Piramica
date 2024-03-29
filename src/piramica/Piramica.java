package piramica;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Genarogg
 * 
 * Las librerias esenciales para la visualizacion correcta se
 * encuentran en la carpeta dist
 */

public class Piramica {
    private JPanel jPanelSuperior,jPanelMedio;
    private JButton jBCalcular;
    private JTextArea jTextA;
    
    //Variables de introduccion de datos a la piramide:
    
    private JTextField jT1;     
    private JTextField jT2;     
    private JTextField jT3;     
    private JTextField jT4;     
    private JTextField jT5;     
    private JTextField jT6;     
    private JTextField jT7;     
    private JTextField jT8;     
    private JTextField jT9;
    private JTextField jT11; 
    private JTextField jT10;
    private JTextField jT12;
    private JTextField jT13;     
    private JTextField jT14;
    private JTextField jT15;
    private JTextField jT16;
    private JTextField jT17;
    private JTextField jT18;
    
    public Piramica(){
        JFrame jF = new JFrame ();
        
        //Invocacion de los paneles
        construccionDePanelSupertior();
        construccionDePanelMedio();
        
        //Establece la posicion en pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int alto = pantalla.height; 
        int ancho = pantalla.width; 
        
        jF.setBounds(  ancho/3 + 80, alto/5, 0 ,0 );
        
        //Desabilita la modificacion de la ventana(Tamaño)
        jF.setResizable(false);
        
        //Cambiar el icono
        ImageIcon ImageIcon = new ImageIcon(getClass().getResource("PiramicaV1.png"));
        Image Image = ImageIcon.getImage();
        jF.setIconImage(Image);
        
        //Titulo de la ventana
        jF.setTitle("Piramica v1.0                                           by: genarogg                                                        ");
       
        //Añadir paneles
        jF.add(jPanelSuperior,BorderLayout.NORTH);
        jF.add(jPanelMedio,BorderLayout.WEST);
        
        //JFrame
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jF.setVisible(true);
        jF.pack();
        
    }
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
                
                //Suma de los numeros de la quinta Columna:
                int su1c5 = sn1c4 + sn2c4;      
                int su2c5 = sn2c4 + sn3c4;      
                int su3c5 = sn3c4 + sn4c4;      
                int su4c5 = sn4c4 + sn5c4;      
                int su5c5 = sn5c4 + sn6c4;     
                int su6c5 = sn6c4 + sn7c4;      
                int su7c5 = sn7c4 + sn8c4;      
                int su8c5 = sn8c4 + sn9c4;      
                int su9c5 = sn9c4 + sn10c4;
                int su10c5 = sn10c4 + sn11c4;
                int su11c5 = sn11c4 + sn12c4;
                int su12c5 = sn12c4 + sn13c4;
                int su13c5 = sn13c4 + sn14c4;
                int su14c5 = sn14c4 + sn15c4;
                
                //Separacion de numeros(quintaColumna):
                
                int sn1c5 = su1c5 % 10;     
                int sn2c5 = su2c5 % 10;     
                int sn3c5 = su3c5 % 10;     
                int sn4c5 = su4c5 % 10;       
                int sn5c5 = su5c5 % 10;          
                int sn6c5 = su6c5 % 10;       
                int sn7c5 = su7c5 % 10;       
                int sn8c5 = su8c5 % 10;     
                int sn9c5 = su9c5 % 10;
                int sn10c5 = su10c5 % 10;
                int sn11c5 = su11c5 % 10;
                int sn12c5 = su12c5 % 10;
                int sn13c5 = su13c5 % 10;
                int sn14c5 = su14c5 % 10;
                
                //Suma de los numeros de la sexta Columna:
                int su1c6 = sn1c5 + sn2c5;      
                int su2c6 = sn2c5 + sn3c5;      
                int su3c6 = sn3c5 + sn4c5;      
                int su4c6 = sn4c5 + sn5c5;      
                int su5c6 = sn5c5 + sn6c5;      
                int su6c6 = sn6c5 + sn7c5;      
                int su7c6 = sn7c5 + sn8c5;      
                int su8c6 = sn8c5 + sn9c5;      
                int su9c6 = sn9c5 + sn10c5;
                int su10c6 = sn10c5 + sn11c5;
                int su11c6 = sn11c5 + sn12c5;
                int su12c6 = sn12c5 + sn13c5;
                int su13c6 = sn13c5 + sn14c5;
                
                //Separacion de numeros(sextaColumna):
                int sn1c6 = su1c6 % 10;     
                int sn2c6 = su2c6 % 10;    
                int sn3c6 = su3c6 % 10;     
                int sn4c6 = su4c6 % 10;      
                int sn5c6 = su5c6 % 10;          
                int sn6c6 = su6c6 % 10;       
                int sn7c6 = su7c6 % 10;       
                int sn8c6 = su8c6 % 10;     
                int sn9c6 = su9c6 % 10;
                int sn10c6 = su10c6 % 10;
                int sn11c6 = su11c6 % 10; 
                int sn12c6 = su12c6 % 10;  
                int sn13c6 = su13c6 % 10; 
                
                //Suma de los numeros de la septima Columna:
                int su1c7 = sn1c6 + sn2c6;      
                int su2c7 = sn2c6 + sn3c6;      
                int su3c7 = sn3c6 + sn4c6;      
                int su4c7 = sn4c6 + sn5c6;      
                int su5c7 = sn5c6 + sn6c6;      
                int su6c7 = sn6c6 + sn7c6;      
                int su7c7 = sn7c6 + sn8c6;      
                int su8c7 = sn8c6 + sn9c6;      
                int su9c7 = sn9c6 + sn10c6;
                int su10c7 = sn10c6 + sn11c6;
                int su11c7 = sn11c6 + sn12c6;
                int su12c7 = sn12c6 + sn13c6;
                
                //Separacion de numeros(septimaColumna):
                int sn1c7 = su1c7 % 10;     
                int sn2c7 = su2c7 % 10;     
                int sn3c7 = su3c7 % 10;       
                int sn4c7 = su4c7 % 10;       
                int sn5c7 = su5c7 % 10;          
                int sn6c7 = su6c7 % 10;       
                int sn7c7 = su7c7 % 10;       
                int sn8c7 = su8c7 % 10;     
                int sn9c7 = su9c7 % 10;
                int sn10c7 = su10c7 % 10;
                int sn11c7 = su11c7 % 10; 
                int sn12c7 = su12c7 % 10;
               //-------------------------------------------------------------------
               //-------------------------------------------------------------------
               //Suma de los numeros de la segunda Columna:
                
                int su1c8 = sn1c7 + sn2c7;      
                int su2c8 = sn2c7 + sn3c7;      
                int su3c8 = sn3c7 + sn4c7;      
                int su4c8 = sn4c7 + sn5c7;      
                int su5c8 = sn5c7 + sn6c7;      
                int su6c8 = sn6c7 + sn7c7;      
                int su7c8 = sn7c7 + sn8c7;      
                int su8c8 = sn8c7 + sn9c7;      
                int su9c8 = sn9c7 + sn10c7;
                int su10c8 = sn10c7 + sn11c7;
                int su11c8 = sn11c7 + sn12c7;
                
                //Separacion de numeros(segundaColumna):
                int sn1c8 = su1c8 % 10;     
                int sn2c8 = su2c8 % 10;      
                int sn3c8 = su3c8 % 10;       
                int sn4c8 = su4c8 % 10;       
                int sn5c8 = su5c8 % 10;          
                int sn6c8 = su6c8 % 10;       
                int sn7c8 = su7c8 % 10;       
                int sn8c8 = su8c8 % 10;     
                int sn9c8 = su9c8 % 10;
                int sn10c8 = su10c8 % 10;
                int sn11c8 = su11c8 % 10;
                
                //Suma de los numeros de la segunda Columna:
                int su1c9 = sn1c8 + sn2c8;      
                int su2c9 = sn2c8 + sn3c8;      
                int su3c9 = sn3c8 + sn4c8;      
                int su4c9 = sn4c8 + sn5c8;      
                int su5c9 = sn5c8 + sn6c8;      
                int su6c9 = sn6c8 + sn7c8;      
                int su7c9 = sn7c8 + sn8c8;      
                int su8c9 = sn8c8 + sn9c8;      
                int su9c9 = sn9c8 + sn10c8;
                int su10c9 = sn10c8 + sn11c8;
                
                //Separacion de numeros(desimaColumna):
                int sn1c9 = su1c9 % 10;     
                int sn2c9 = su2c9 % 10;      
                int sn3c9 = su3c9 % 10;       
                int sn4c9 = su4c9 % 10;       
                int sn5c9 = su5c9 % 10;          
                int sn6c9 = su6c9 % 10;       
                int sn7c9 = su7c9 % 10;       
                int sn8c9 = su8c9 % 10;     
                int sn9c9 = su9c9 % 10;
                int sn10c9 = su10c9 % 10;
                
                //Suma de los numeros de la desima Columna:
                int su1c10 = sn1c9 + sn2c9;      
                int su2c10 = sn2c9 + sn3c9;      
                int su3c10 = sn3c9 + sn4c9;      
                int su4c10 = sn4c9 + sn5c9;      
                int su5c10 = sn5c9 + sn6c9;      
                int su6c10 = sn6c9 + sn7c9;      
                int su7c10 = sn7c9 + sn8c9;      
                int su8c10 = sn8c9 + sn9c9;      
                int su9c10 = sn9c9 + sn10c9;
                
                //Separacion de numeros(desimarimeraColumna):
                int sn1c10 = su1c10 % 10;     
                int sn2c10 = su2c10 % 10;      
                int sn3c10 = su3c10 % 10;       
                int sn4c10 = su4c10 % 10;       
                int sn5c10 = su5c10 % 10;          
                int sn6c10 = su6c10 % 10;       
                int sn7c10 = su7c10 % 10;       
                int sn8c10 = su8c10 % 10;     
                int sn9c10 = su9c10 % 10;
                
                //Suma de los numeros de la desimarimera Columna:
                int su1c11 = sn1c10 + sn2c10;      
                int su2c11 = sn2c10 + sn3c10;      
                int su3c11 = sn3c10 + sn4c10;      
                int su4c11 = sn4c10 + sn5c10;      
                int su5c11 = sn5c10 + sn6c10;      
                int su6c11 = sn6c10 + sn7c10;      
                int su7c11 = sn7c10 + sn8c10;      
                int su8c11 = sn8c10 + sn9c10;
                
                //Separacion de numeros(desimaSegundaColumna):
                int sn1c11 = su1c11 % 10;     
                int sn2c11 = su2c11 % 10;      
                int sn3c11 = su3c11 % 10;       
                int sn4c11 = su4c11 % 10;       
                int sn5c11 = su5c11 % 10;          
                int sn6c11 = su6c11 % 10;       
                int sn7c11 = su7c11 % 10;       
                int sn8c11 = su8c11 % 10;
                
                //Suma de los numeros de la desimaSegunda Columna:
                int su1c12 = sn1c11 + sn2c11;      
                int su2c12 = sn2c11 + sn3c11;      
                int su3c12 = sn3c11 + sn4c11;      
                int su4c12 = sn4c11 + sn5c11;      
                int su5c12 = sn5c11 + sn6c11;      
                int su6c12 = sn6c11 + sn7c11;      
                int su7c12 = sn7c11 + sn8c11;      
                    
                //Separacion de numeros(desimaTerseraColumna):
                int sn1c12 = su1c12 % 10;     
                int sn2c12 = su2c12 % 10;      
                int sn3c12 = su3c12 % 10;       
                int sn4c12 = su4c12 % 10;       
                int sn5c12 = su5c12 % 10;          
                int sn6c12 = su6c12 % 10;       
                int sn7c12 = su7c12 % 10;       
                
                //Suma de los numeros de la desimaTersera Columna:
                int su1c13 = sn1c12 + sn2c12;      
                int su2c13 = sn2c12 + sn3c12;      
                int su3c13 = sn3c12 + sn4c12;      
                int su4c13 = sn4c12 + sn5c12;      
                int su5c13 = sn5c12 + sn6c12;      
                int su6c13 = sn6c12 + sn7c12;      

                //Separacion de numeros(desimaTerseraColumna):
                int sn1c13 = su1c13 % 10;     
                int sn2c13 = su2c13 % 10;      
                int sn3c13 = su3c13 % 10;       
                int sn4c13 = su4c13 % 10;       
                int sn5c13 = su5c13 % 10;          
                int sn6c13 = su6c13 % 10;       
                
                //Suma de los numeros de la desimaCuarta Columna:
                int su1c14 = sn1c13 + sn2c13;      
                int su2c14 = sn2c13 + sn3c13;      
                int su3c14 = sn3c13 + sn4c13;      
                int su4c14 = sn4c13 + sn5c13;      
                int su5c14 = sn5c13 + sn6c13;      
                
                //Separacion de numeros(desimaCuartaColumna):
                int sn1c14 = su1c14 % 10;     
                int sn2c14 = su2c14 % 10;      
                int sn3c14 = su3c14 % 10;       
                int sn4c14 = su4c14 % 10;       
                int sn5c14 = su5c14 % 10;          

                //Suma de los numeros de la desimaQuinta Columna:
                int su1c15 = sn1c14 + sn2c14;      
                int su2c15 = sn2c14 + sn3c14;      
                int su3c15 = sn3c14 + sn4c14;      
                int su4c15 = sn4c14 + sn5c14;      

                //Separacion de numeros(desimaQuintaColumna):
                int sn1c15 = su1c15 % 10;     
                int sn2c15 = su2c15 % 10;      
                int sn3c15 = su3c15 % 10;       
                int sn4c15 = su4c15 % 10;       
                
                //Suma de los numeros de la desimasexta Columna:
                int su1c16 = sn1c15 + sn2c15;      
                int su2c16 = sn2c15 + sn3c15;      
                int su3c16 = sn3c15 + sn4c15;      
                  
                //Separacion de numeros(desimaSextaColumna):
                int sn1c16 = su1c16 % 10;     
                int sn2c16 = su2c16 % 10;      
                int sn3c16 = su3c16 % 10;   
                
                //Suma de los numeros de la desimaseptima Columna:
                int su1c17 = sn1c16 + sn2c16;      
                int su2c17 = sn2c16 + sn3c16;      
                 
                //Separacion de numeros(desimaseptimaColumna):
                int sn1c17 = su1c17 % 10;     
                int sn2c17 = su2c17 % 10;      

                //Suma de los numeros de la desimaOctava Columna:
                int su1c18 = sn1c17 + sn2c17;      
                      
                //Separacion de numeros(desimaOctavaColumna):
                int sn1c18 = su1c18 % 10;
               
                //Introduccion de datos al textArea
                jTextA.setText("" + "  " + c1n1 + "  " + c1n2  + "  " + c1n3  + "  " + c1n4  + "  " + c1n5 + "  " + c1n6 + "  " + c1n7 + "  " + c1n8 + "  " + c1n9 + "  " + c1n10 + "  " + c1n11 + "  "  + c1n12 + "  "  + c1n13 + "  " + c1n14 + "  " + c1n15 + "  " + c1n16 + "  " + c1n17 + "  " + c1n18 + "  " + 
                        
                               "\n" + "    " + sn1c2 + "  " + sn2c2 + "  " + sn3c2 + "  " + sn4c2 + "  " + sn5c2 + "  " + sn6c2 + "  " + sn7c2 + "  " + sn8c2 + "  " + sn9c2 + "  " + sn10c2 + "  " + sn11c2 + "  " + sn12c2 + "  " + sn13c2 + "  " + sn14c2 + "  " + sn15c2 + "  " + sn16c2 + "  " + sn17c2 + "  " + 
                               "\n" + "      " + sn1c3 + "  " + sn2c3 + "  " + sn3c3 + "  " + sn4c3 + "  " + sn5c3 + "  " + sn6c3 + "  " + sn7c3 + "  " + sn8c3 + "  " + sn9c3 + "  " + sn10c3 + "  " + sn11c3 + "  " + sn12c3 + "  " + sn13c3 + "  " + sn14c3 + "  " + sn15c3 + "  " + sn16c3 + "  " + 
                               "\n" + "        " + sn1c4 + "  " + sn2c4 + "  " + sn3c4 + "  " + sn4c4 + "  " + sn5c4 + "  " + sn6c4 + "  " + sn7c4 + "  " + sn8c4 + "  " + sn9c4 + "  " + sn10c4 + "  " + sn11c4 + "  " + sn12c4 + "  " + sn13c4 + "  " + sn14c4 + "  " + sn15c4 + "  " + 
                               "\n" + "          " + sn1c5 + "  " + sn2c5 + "  " + sn3c5 + "  " + sn4c5 + "  " + sn5c5 + "  " + sn6c5 + "  " + sn7c5 + "  " + sn8c5 + "  " + sn9c5 + "  " + sn10c5 + "  " + sn11c5 + "  " + sn12c5 + "  " + sn13c5 + "  " + sn14c5 + "  " + 
                               "\n" + "            " + sn1c6 + "  " + sn2c6 + "  " + sn3c6 + "  " + sn4c6 + "  " + sn5c6 + "  " + sn6c6 + "  " + sn7c6 + "  " + sn8c6 + "  " + sn9c6 + "  " + sn10c6 + "  " + sn11c6 + "  " + sn12c6 + "  " + sn13c6 + "  " + 
                               "\n" + "              " + sn1c7 + "  " + sn2c7 + "  " + sn3c7 + "  " + sn4c7 + "  " + sn5c7 + "  " + sn6c7 + "  " + sn7c7 + "  " + sn8c7 + "  " + sn9c7 + "  " + sn10c7 + "  " + sn11c7 + "  " + sn12c7 + "  " + 
                               "\n" + "                " + sn1c8 + "  " + sn2c8 + "  " + sn3c8 + "  " + sn4c8 + "  " + sn5c8 + "  " + sn6c8 + "  " + sn7c8 + "  " + sn8c8 + "  " + sn9c8 + "  " + sn10c8 + "  " + sn11c8 + "  " + 
                               "\n" + "                  " + sn1c9 + "  " + sn2c9 + "  " + sn3c9 + "  " + sn4c9 + "  " + sn5c9 + "  " + sn6c9 + "  " + sn7c9 + "  " + sn8c9 + "  " + sn9c9 + "  " + sn10c9 + "  " + 
                               
                               "\n" + "                    " + sn1c10 + "  " + sn2c10 + "  " + sn3c10 + "  " + sn4c10 + "  " + sn5c10 + "  " + sn6c10 + "  " + sn7c10 + "  " + sn8c10 + "  " + sn9c10 + "  " + 
                               "\n" + "                      " + sn1c11 + "  " + sn2c11 + "  " + sn3c11 + "  " + sn4c11 + "  " + sn5c11 + "  " + sn6c11 + "  " + sn7c11 + "  " + sn8c11 + "  " + 
                               "\n" + "                        " + sn1c12 + "  " + sn2c12 + "  " + sn3c12 + "  " + sn4c12 + "  " + sn5c12 + "  " + sn6c12 + "  " + sn7c12 + "  " + 
                               "\n" + "                          " + sn1c13 + "  " + sn2c13 + "  " + sn3c13 + "  " + sn4c13 + "  " + sn5c13 + "  " + sn6c13 + "  " + 
                               "\n" + "                            " + sn1c14 + "  " + sn2c14 + "  " + sn3c14 + "  " + sn4c14 + "  " + sn5c14 + "  " + 
                               "\n" + "                              " + sn1c15 + "  " + sn2c15 + "  " + sn3c15 + "  " + sn4c15 + "  " + 
                               "\n" + "                                " + sn1c16 + "  " + sn2c16 + "  " + sn3c16 + "  " + 
                               "\n" + "                                  " + sn1c17 + "  " + sn2c17 + "  " +
                               "\n" + "                                    " + sn1c18 + "  ");
                }
        };
        
        jBCalcular.addActionListener(listeners);
         
        //tamaño de los JtextField    
        jT1 = new JTextField(1);    jT10 = new JTextField(1);
        jT2 = new JTextField(1);    jT11 = new JTextField(1);
        jT3 = new JTextField(1);    jT12 = new JTextField(1);
        jT4 = new JTextField(1);    jT13 = new JTextField(1);
        jT5 = new JTextField(1);    jT14 = new JTextField(1);
        jT6 = new JTextField(1);    jT15 = new JTextField(1);
        jT7 = new JTextField(1);    jT16 = new JTextField(1);
        jT8 = new JTextField(1);    jT17 = new JTextField(1);
        jT9 = new JTextField(1);    jT18 = new JTextField(1);
        
        /*//Teste
        jT1.setText("1");   
        jT2.setText("2");   
        jT3.setText("3");   
        jT4.setText("4");   
        jT5.setText("5");   
        jT6.setText("6");   
        jT7.setText("7");   
        jT8.setText("8");   
        jT9.setText("9");
        jT10.setText("1");
        jT11.setText("2");
        jT12.setText("3");
        jT13.setText("4");
        jT14.setText("5");
        jT15.setText("6");
        jT16.setText("7");
        jT17.setText("8"); 
        jT18.setText("9");
        */
        
        //layout del panel superior
        FlowLayout flowL = new FlowLayout(FlowLayout.LEFT);
        
        flowL.setHgap(1);   flowL.setVgap(2);
        
        //Añadir los jtextfield al panel
        jPanelSuperior.add(jT1);    
        jPanelSuperior.add(jT2);    
        jPanelSuperior.add(jT3);    
        jPanelSuperior.add(jT4);        
        jPanelSuperior.add(jT5);    
        jPanelSuperior.add(jT6);    
        jPanelSuperior.add(jT7);    
        jPanelSuperior.add(jT8);    
        jPanelSuperior.add(jT9); 
        jPanelSuperior.add(jT10);
        jPanelSuperior.add(jT11);
        jPanelSuperior.add(jT12);
        jPanelSuperior.add(jT13);
        jPanelSuperior.add(jT14);
        jPanelSuperior.add(jT15);
        jPanelSuperior.add(jT16);   
        jPanelSuperior.add(jT17);   
        jPanelSuperior.add(jT18);
        
        jPanelSuperior.add(jBCalcular);
    }
    public static void main(String[] args) {

        try{
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel");
        }
        catch(UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e){
            
        }
        new Piramica();  
    }    
}