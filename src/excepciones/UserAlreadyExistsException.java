/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 * Este mensaje aparece cuando el usuario que ha introducido ya existe
 * previamente.
 *
 * @author Ander
 */
public class UserAlreadyExistsException extends Exception{

    public UserAlreadyExistsException(String msg) {
        super(msg);
    }
}
