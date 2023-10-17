/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 * Esta excepcion se utiliza cuando hay algun error de conexion con la base de datos.
 * @author Ander 
 */
public class ConnectException extends Exception{
      
    public ConnectException(String msg) {
        super(msg);
    }
}
