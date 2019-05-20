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
public class Automovil implements Transporte {

    @Override
    public void arrancar(){
        System.out.println("Arrancando el Automovil");
    }

    @Override
    public void detener(){
        System.out.println("Deteniendo el Automovil");
    }

    @Override
    public void encender(){
        System.out.println("Encendiendo el Automovil");
    }

     @Override
    public void apagar(){
        System.out.println("Apagando el Automovil");
    }

     @Override
    public void pitar(){
        System.out.println("Sonado el clacson el Automovil");
    }

     @Override
    public String tipo(){
       return "Automovil";
    }
}
