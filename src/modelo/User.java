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
    private String contraRepe;
    private LocalDate fecha_ini;
    private Integer telefono;
    private Integer zip_code;
    private String direccion;
    private Integer compañia;
    private UserPrivilege privilege;
    private boolean activo;

    public User() {
        this.compañia = 1;
        this.activo = true;
        this.fecha_ini = LocalDate.now();
    }

    public User(String nombre, String email, String contraseña, String contraRepe, LocalDate fecha_ini, Integer telefono, Integer zip_code, String direccion, UserPrivilege privilege, Integer compañia, boolean activo) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.contraRepe = contraRepe;
        this.fecha_ini = fecha_ini;
        this.telefono = telefono;
        this.zip_code = zip_code;
        this.direccion = direccion;
        this.privilege = privilege;
        this.activo = activo;
        this.compañia = compañia;
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
        return "User{" + "nombre=" + nombre + ", email=" + email + ", contrase\u00f1a=" + contraseña + ", contraRepe=" + contraRepe + ", fecha_ini=" + fecha_ini + ", telefono=" + telefono + ", zip_code=" + zip_code + ", direccion=" + direccion + ", compa\u00f1ia=" + compañia + ", privilege=" + privilege + ", activo=" + activo + '}';
    }

}
