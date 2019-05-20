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
public class Motocicleta implements Transporte{
    @Override
    public void arrancar(){
        System.out.println("Arrancando la Motocicleta");
    }

    @Override
    public void detener(){
        System.out.println("Deteniendo la Motocicleta");
    }

    @Override
    public void encender(){
        System.out.println("Encendiendo la Motocicleta");
    }

     @Override
    public void apagar(){
        System.out.println("Apagando la Motocicleta");
    }

     @Override
    public void pitar(){
        System.out.println("Sonado el clacson de la Motocicleta");
    }

     @Override
    public String tipo(){
       return "Motocicleta";
    }
}
