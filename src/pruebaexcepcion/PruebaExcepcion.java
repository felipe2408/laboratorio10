/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexcepcion;


import javax.swing.JOptionPane;


/**
 *
 * @author brian
 */
public class PruebaExcepcion {

    public static void main(String args[]) {
        PruebaExcepcion ejecutar = new PruebaExcepcion();
        Errores error = new Errores();
        
        try {
             int numero, divisor;
        String numN,diviN;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero "));
        divisor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el divisor "));
            
            ejecutar.leer(numero, divisor);
            
                     
            try {
                error.validarNumero(numero);  
            } catch (Excepcion ex) {
                JOptionPane.showMessageDialog(null, "Error no se puede dividir entre 0" + ex.getMessage());
            }
            
        }
        catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(null, "El error es =  " + ex.getMessage());
        }
        catch(NumberFormatException en){
            JOptionPane.showMessageDialog(null, "Error ingresaste una letra"+en.getMessage());
        }
        

    }

    public void leer(int num, int divi) throws ArithmeticException, NumberFormatException {
        float resultado = 0;
        resultado = num / divi;

    }

}
