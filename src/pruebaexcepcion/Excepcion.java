/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexcepcion;

/**
 *
 * @author brian
 */
public class Excepcion extends Exception{
    public static final long serialVersionUID = 700L ;
    
    public Excepcion(String error){
        super(error);
    }
    
        
    
}
