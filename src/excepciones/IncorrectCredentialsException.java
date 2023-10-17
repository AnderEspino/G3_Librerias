/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 * Este mensaje se muestra cuando alguna de las credenciales de inicio de sesion
 * no coinciden.
 *
 * @author Ander
 */
public class IncorrectCredentialsException extends Exception{

    public IncorrectCredentialsException(String msg) {
        super(msg);
    }
}
