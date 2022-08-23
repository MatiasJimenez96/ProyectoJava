package org.matiasjimenez.proyectousuario.repositorio;


import org.matiasjimenez.proyectousuario.model.Usuario;
import org.matiasjimenez.proyectousuario.util.ConexionBaseDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class usuarioRepositorioImpl implements Repositorio<Usuario> {

    private Connection getConnection() throws SQLException {
        return ConexionBaseDatos.getConnection();
    }

    @Override
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios")) {
            while (rs.next()) {
                Usuario usuario = getUsuarioBBDD(rs);
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usuarios;
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        String sql = "UPDATE usuarios SET username=?, password=?, email=? WHERE id=?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(4, usuario.getId());
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getPassword());
            stmt.setString(3, usuario.getEmail());


            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void eliminarUsuario(Long id) {
        String sql = "DELETE FROM usuarios WHERE id=?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios(username, password, email) VALUES (?,?,?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getPassword());
            stmt.setString(3, usuario.getEmail());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    private static Usuario getUsuarioBBDD(ResultSet rs) throws SQLException {
        Usuario usuario = new Usuario();
        usuario.setId(rs.getLong(1));
        usuario.setNombre(rs.getString(2));
        usuario.setPassword(rs.getString(3));
        usuario.setEmail(rs.getString(4));
        return usuario;
    }
}
