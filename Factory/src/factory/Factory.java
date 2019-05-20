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
public class Factory {

    public static Transporte contruir(String tipo) {
        switch (tipo) {
            case "Automovil":
                return new Automovil();
            case "Motocicleta":
                return new Motocicleta();
            default:
                System.out.println("No coinciden objetos en la Factory");
                return null;
        }
    }
}
