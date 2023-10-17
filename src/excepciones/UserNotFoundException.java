/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *  Este mensaje se muestra cuando el usuario introducido no existe o no se encuentra.
 * @author Ander
 */
public class UserNotFoundException extends Exception {

    public UserNotFoundException(String msg) {
        super(msg);
    }
}
