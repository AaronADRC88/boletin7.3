
package boletin7.pkg3;

import javax.swing.JOptionPane;

public class Masmenoscero {
    public double numero;
    
    public Masmenoscero(){
    }
   public Masmenoscero(double n){
       n=this.numero;
   } 
    public double pedirDato(){
    String respuesta = JOptionPane.showInputDialog("introduce nº");
    double b = Double.parseDouble(respuesta);
    return b;
   }
    public void comparacion (double numero){
        if(numero>0){
            JOptionPane.showMessageDialog(null, "+");
        }
        else{
            if (numero==0){
            JOptionPane.showMessageDialog(null, "0");
        }
            else {
            JOptionPane.showMessageDialog(null, "-");
        }
    }


 }
}


