package org.matiasjimenez.proyectousuario.model;

public class Usuario {
    private Long id;
    private String nombre;
    private String password;
    private String email;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String usuario) {
        this.nombre = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return id + " | " + nombre + " | " + email + " | " + password;
    }
}
