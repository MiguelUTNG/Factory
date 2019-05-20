/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author Miguel
 */
public interface Transporte {
    
    public void arrancar();
    
    public void detener();
    
    public void encender();
    
    public void apagar();
    
    public void pitar();
    
    public String tipo();
}
