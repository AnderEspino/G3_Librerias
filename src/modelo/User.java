package modelo;

import java.util.Date;
import java.util.logging.Logger;

/**
 * Clase JavaBean de User, reconpila la informacion sacada de las ventanas para
 * poder crear un usuario y recopilar su información
 *
 * @author Diego
 */
public class User {

    private String nombre;
    private String email;
    private String contraseña;
    private String contraRepe;
    private Date fecha_ini;
    private Date fecha_final;
    private Integer telefono;
    private Integer zip_code;
    private String direccion;
    private UserPrivilege privilege;

    public User() {
    }

    public User(String nombre, String email, String contraseña, String contraRepe, Date fecha_ini, Date fecha_final, Integer telefono, Integer zip_code, String direccion, UserPrivilege privilege) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.contraRepe = contraRepe;
        this.fecha_ini = fecha_ini;
        this.fecha_final = fecha_final;
        this.telefono = telefono;
        this.zip_code = zip_code;
        this.direccion = direccion;
        this.privilege = privilege;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getContraRepe() {
        return contraRepe;
    }

    public void setContraRepe(String contraRepe) {
        this.contraRepe = contraRepe;
    }

    public Date getFecha_ini() {
        return fecha_ini;
    }

    public void setFecha_ini(Date fecha_ini) {
        this.fecha_ini = fecha_ini;
    }

    public Date getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(Date fecha_final) {
        this.fecha_final = fecha_final;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getZip_code() {
        return zip_code;
    }

    public void setZip_code(Integer zip_code) {
        this.zip_code = zip_code;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public UserPrivilege getPrivilege() {
        return privilege;
    }

    public void setPrivilege(UserPrivilege privilege) {
        this.privilege = privilege;
    }

    @Override
    public String toString() {
        return "User{" + "nombre=" + nombre + ", email=" + email + ", contrase\u00f1a=" + contraseña + ", contraRepe=" + contraRepe + ", fecha_ini=" + fecha_ini + ", fecha_final=" + fecha_final + ", telefono=" + telefono + ", zip_code=" + zip_code + ", direccion=" + direccion + ", privilege=" + privilege + '}';
    }

}
