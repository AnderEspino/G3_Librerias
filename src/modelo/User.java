package modelo;

import java.time.LocalDate;

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
    private LocalDate fecha_ini;
    private Integer telefono;
    private Integer zip_code;
    private String direccion;
    private Integer compañia;
    private UserPrivilege privilege;
    private boolean activo;

    public User() {
    }

    public User(String nombre, String email, String contraseña, LocalDate fecha_ini, Integer telefono, Integer zip_code, String direccion, Integer compañia, UserPrivilege privilege, boolean activo) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.fecha_ini = fecha_ini;
        this.telefono = telefono;
        this.zip_code = zip_code;
        this.direccion = direccion;
        this.compañia = 1;
        this.activo = true;
        this.fecha_ini = LocalDate.now();
        this.privilege = UserPrivilege.USER;

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

    public LocalDate getFecha_ini() {
        return fecha_ini;
    }

    public void setFecha_ini(LocalDate fecha_ini) {
        this.fecha_ini = fecha_ini;
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

    public Integer getCompañia() {
        return compañia;
    }

    public void setCompañia(Integer compañia) {
        this.compañia = compañia;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "User{" + "nombre=" + nombre + ", email=" + email + ", contrase\u00f1a=" + contraseña + ", fecha_ini=" + fecha_ini + ", telefono=" + telefono + ", zip_code=" + zip_code + ", direccion=" + direccion + ", compa\u00f1ia=" + compañia + ", privilege=" + privilege + ", activo=" + activo + '}';
    }

}
