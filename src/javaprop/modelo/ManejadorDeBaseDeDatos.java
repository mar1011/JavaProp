package javaprop.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author caemci
 */
public class ManejadorDeBaseDeDatos {
    
    private String direccion;
    private String usuario;
    private String clave;
    private Connection conexion;

    public ManejadorDeBaseDeDatos(String direccion, String usuario, String clave) throws SQLException {
        this.direccion = direccion;
        this.usuario = usuario;
        this.clave = clave;
        this.conectar();
    }
    
    private void conectar() throws SQLException {
        this.conexion = DriverManager.getConnection("jdbc:mysql://"+this.direccion,this.usuario,this.clave);
    }
    
    public ResultSet procesarConsulta (String sql) throws SQLException {
        Statement s = conexion.createStatement();
        ResultSet rs = s.executeQuery(sql);
        return rs;
    }
    
    public void procesarAccion (String sql) throws SQLException {
        Statement s = conexion.createStatement();
        s.executeUpdate(sql);
    }
    
    public PreparedStatement procesarActualizacion (String sql) throws SQLException {
        PreparedStatement ps = conexion.prepareStatement(sql);
        return ps;
    }
}
