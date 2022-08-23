package org.matiasjimenez.proyectousuario.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConexionBaseDatos {
    private static String url = "jdbc:mysql://localhost:3306/java_curso";
    private static String usuario = "root";
    private static String contrasena = "";
    private static BasicDataSource pool;

    public static BasicDataSource getInstance() throws SQLException{  // POOL DE CONEXIONES
        if (pool==null){
            pool = new BasicDataSource();
            pool.setUrl(url);
            pool.setUsername(usuario);
            pool.setPassword(contrasena);

            pool.setInitialSize(3); // 3 conexioens abiertas al iniciar
            pool.setMinIdle(3); // 3 conexiones minimas esperando a ser utilizadas
            pool.setMaxIdle(8); // 8 conexiones como maximas inactivas
            pool.setMaxTotal(8); //
        }
        return pool;
    }

    public static Connection getConnection() throws SQLException {
        return getInstance().getConnection();
    }

}
