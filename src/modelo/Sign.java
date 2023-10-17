package modelo;

import excepciones.IncorrectCredentialsException;
import excepciones.ConnectException;
import excepciones.UserNotFoundException;
import excepciones.UserAlreadyExistsException;

/**
 * Interfaz principal del programa, tiene los métodos para hacer el registro y
 * el inicio de sesión con sus respectivas excepciones a lanzar
 *
 * @author Diego
 */
public interface Sign {

    /**
     * Método executeLogin, se encarga de hacer registro a nuestra aplicación
     *
     * @param user
     * @return user
     * @throws excepciones.ConnectException
     * @throws excepciones.IncorrectCredentialsException
     * @throws excepciones.UserAlreadyExistsException
     */
    public User excecuteLogin(User user) throws ConnectException, IncorrectCredentialsException, UserAlreadyExistsException;

    /**
     * Método executeSignIn, se encarga de hacer el inicio de sesión
     *
     * @param user
     * @return user
     * @throws excepciones.UserNotFoundException
     * @throws excepciones.ConnectException
     */
    public User executeSignIn(User user) throws UserNotFoundException, ConnectException;
}
