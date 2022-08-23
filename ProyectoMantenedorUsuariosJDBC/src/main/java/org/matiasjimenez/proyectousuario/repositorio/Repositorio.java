package org.matiasjimenez.proyectousuario.repositorio;

import org.matiasjimenez.proyectousuario.model.Usuario;

import java.util.List;

public interface Repositorio<T> {

    List<T> listarUsuarios();

    void actualizarUsuario(Usuario usuario);

    void eliminarUsuario(Long id);

    void agregarUsuario(Usuario usuario);


}
