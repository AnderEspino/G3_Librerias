package modelo;

import java.io.Serializable;

/**
 *  Este enumerador sirve para asignar todos los tipos de mensajes.
 * @author Ander, Diego
 */
public enum MessageType implements Serializable {
    SIGNIN_REQUEST,
    SIGNUP_REQUEST,
    OK_RESPONSE,
    USER_ALREADY_EXISTS_RESPONSE,
    CONNECTION_ERROR_RESPONSE,
    INCORRECT_CREDENTIALS_RESPONSE,
    USER_NOT_FOUND_RESPONSE,
    ERROR_RESPONSE,
    MAX_THREAD_USER;
}
