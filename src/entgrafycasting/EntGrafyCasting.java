/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entgrafycasting;

import javax.swing.JOptionPane;


/**
 *
 * @author guille
 */
public class EntGrafyCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "¡Este es el calculador de su promedio!");
    
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre.");
        JOptionPane.showMessageDialog(null, "¡Bienvenido/a, " + nombre + "!");
        String ingrnota1 = JOptionPane.showInputDialog("Ingrese la nota del primer trimestre.");
        String ingrnota2 = JOptionPane.showInputDialog("Ingrese la nota del segundo trimestre.");
        String ingrnota3 = JOptionPane.showInputDialog("Ingrese la nota del tercer trimestre.");
        
        //int nota1= Integer.parseInt(ingrnota1);
        //int nota2= Integer.parseInt(ingrnota2);
        //int nota3= Integer.parseInt(ingrnota3);
        
        float n1= Float.parseFloat(ingrnota1);
        float n2= Float.parseFloat(ingrnota2);
        float n3= Float.parseFloat(ingrnota3);
       
        float promedio = (n1+n2+n3)/3;
        
        JOptionPane.showMessageDialog(null,"Ingresó las notas " +(int)n1 + " , "+ (int)n2+" y "+ (int)n3);

        JOptionPane.showMessageDialog(null, "El proomedio de sus notas es: " + Math.round(promedio * 100d) / 100d);
        
        
                
        
        
            
        
        
    }
    
    
    
}
