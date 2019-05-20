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
public class TestFactory {
    
    public static void main(String[] args) {
        Transporte t = Factory.contruir("Automovil");
        
        t.apagar();
        t.arrancar();
        t.encender();
        
        System.out.println(t.tipo());
    }
}
