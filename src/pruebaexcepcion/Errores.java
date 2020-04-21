/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexcepcion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author brian
 */
public class Errores {

    Errores() {

    }

    public void validarNumero(int numero) throws Excepcion {

        if (numero < 10) {
            throw new Excepcion("El numero es menor a 10");
        }
   
        /*
        if (numN.matches("[0-9]*")) {

        } else {
            throw new Excepcion("Ingreso una letra");
        }
*/
    }

}
