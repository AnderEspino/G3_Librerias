package modelo;

import java.io.Serializable;

/**
 * Esta clase sirve recoger y mandar los mensajes que se enviaran al servidor.
 *
 * @author Ander
 */
public class Message implements Serializable {

    //Atributos 
    private MessageType msg;
    private User user;

    /**
     * Aqui esta los getters y los setters del msg y de user.
     *
     * @return msg (getMessage)
     * @return user (getUser)
     *
     */
    public MessageType getMsg() {
        return msg;
    }

    public void setMsg(MessageType msg) {
        this.msg = msg;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
