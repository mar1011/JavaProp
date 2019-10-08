package javaprop.modelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javaprop.Barrio;
import javaprop.Casa;
import javaprop.Cliente;
import javaprop.Departamento;
import javaprop.Inmobiliaria;
import javaprop.Inmueble;
import javaprop.Domicilio;
/**
 *
 * @author Mariana
 */
public class Modelo {
    
	private ManejadorDeBaseDeDatos mbd;
	
	public void conectar(String host, String user, String pass) throws SQLException {
		this.mbd = new ManejadorDeBaseDeDatos(host, user, pass);
	}
	
	public ArrayList<Inmobiliaria> obtenerInmobiliarias() throws SQLException {
        ArrayList<Inmobiliaria> inmobiliarias = new ArrayList<Inmobiliaria>();   
        ResultSet resultado = mbd.procesarConsulta("SELECT * FROM inmobiliaria ");
        while (resultado.next()) {
            inmobiliarias.add(generarInmobiliaria(resultado));
        }
        return inmobiliarias; 
        }
        
	public ArrayList<Inmueble> obtenerCasas(int id) throws SQLException{
            ArrayList<Inmueble> casas = new ArrayList<Inmueble>();
            ResultSet resultado = mbd.procesarConsulta("SELECT id_inmueble,calle,altura,depto,barrio,superficie,cant_ambientes,precio,reservado,tiene_garaje,tiene_pileta,tiene_jardin "
                    + "FROM inmueble i, inmobiliaria inmo, casa c "
                    + "WHERE i.fk_id_inmobiliaria=inmo.id_inmobiliaria "
                    + "AND i.id_inmueble=c.fk_id_inmueble "
                    + "AND fk_id_inmobiliaria= " + id);
        
            while (resultado.next()) {
            casas.add(generarCasa(resultado));
        }
        return casas;
       } 

        public ArrayList<Inmueble> obtenerDeptos(int id) throws SQLException{
            ArrayList<Inmueble> deptos = new ArrayList<Inmueble>();
            ResultSet resultado = mbd.procesarConsulta("SELECT id_inmueble,calle,altura,piso,depto,barrio,superficie,cant_ambientes,precio,reservado, tiene_cochera, tiene_baulera "
                    + "FROM inmueble i, inmobiliaria inmo, departamento d "
                    + "WHERE i.fk_id_inmobiliaria=inmo.id_inmobiliaria "
                    + "AND i.id_inmueble=d.fk_id_inmueble "
                    + "AND fk_id_inmobiliaria= " + id);
        
            while (resultado.next()) {
            deptos.add(generarDepartamento(resultado));
        }
        return deptos;
       } 
        
        public Inmueble obtenerInmueble(int id) throws SQLException{
            ResultSet resultado = mbd.procesarConsulta("SELECT * FROM inmueble WHERE id_inmueble=" + id);
            resultado.next();
            Inmueble inmueble = generarInmueble(resultado);
             return inmueble;
        }
        
        public ArrayList<Cliente> obtenerClienteInteresado (int id) throws SQLException{
            ArrayList<Cliente> interesados = new ArrayList<Cliente>();
            ResultSet resultado = mbd.procesarConsulta("SELECT id_cliente,nombre,apellido,mail,movil "
                    + "FROM inmuebles_clientes ic, cliente c, inmueble i "
                    + "WHERE ic.fk_id_cliente=c.id_cliente "
                    + "AND ic.fk_id_inmueble=i.id_inmueble "
                    + "AND id_inmueble= "+ id);
        
            while (resultado.next()) {
            interesados.add(generarInteresado(resultado));
        }
        return interesados;
        }
        
        public Cliente obtenerInteresado (int id) throws SQLException{
            ResultSet resultado = mbd.procesarConsulta("SELECT * FROM cliente WHERE id_cliente = " + id);
            resultado.next();
            Cliente interesado = generarInteresado(resultado);
            return interesado;
        }
        
        public void agregarInteresado (Cliente cli) throws SQLException{
            String campos = "(nombre, apellido, mail, movil)";
            String consulta = "INSERT INTO cliente " + campos + "VALUES (?,?,?,?)";
            PreparedStatement ps = mbd.procesarActualizacion(consulta);
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getApellido());
            ps.setString(3, cli.getMail());
            ps.setString(4, cli.getCelular());
            ps.executeUpdate();
        }
        
        public void actualizarInteresado (Cliente cli) throws SQLException{
            String campos= "nombre = ?, apellido = ?, mail = ?, movil = ?";
            String consulta = "UPDATE cliente SET " + campos + " WHERE id_cliente = " + cli.getId();
            PreparedStatement ps = mbd.procesarActualizacion(consulta);
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getApellido());
            ps.setString(3, cli.getMail());
            ps.setString(4, cli.getCelular());
            ps.executeUpdate();
        }
        
        public void borrarInteresado (Cliente cli) throws SQLException{
            mbd.procesarAccion("DELETE inmuebles_clientes.* FROM inmuebles_clientes"
                    + " JOIN cliente"
                    + " ON cliente.id_cliente = inmuebles_clientes.fk_id_cliente"
                    + " WHERE id_cliente= " + cli.getId());
            mbd.procesarAccion("DELETE FROM cliente WHERE id_cliente = "+ cli.getId() );
        }
        
        public void actualizarPrecioInmueble (Inmueble in) throws SQLException{
            String campo ="precio = ?";
            String consulta = "UPDATE inmueble SET " + campo + " WHERE id_inmueble= " + in.getID();
            PreparedStatement ps = mbd.procesarActualizacion(consulta);
            ps.setDouble(1,in.getPrecio());
            ps.executeUpdate();
        }
        
        
    private Inmobiliaria generarInmobiliaria (ResultSet rs) throws SQLException {
        int id = rs.getInt(1);
        String nom = rs.getString(2);
        String mail = rs.getString(3);
        double comi = rs.getDouble(4);
        return new Inmobiliaria(id, nom, mail, comi);
    }
    
    private Inmueble generarInmueble (ResultSet rs) throws SQLException {
        int id = rs.getInt(1);
        String calle = rs.getString(3);
        int alt = rs.getInt(4);
        int piso = 0;
        if(rs.getInt(5)>0 ){
        piso = rs.getInt(5);    
        }
        
        String depto = "-";
        if(rs.getString(6)!=null){
        depto = rs.getString(6);    
        }
        
        /*Barrio barrio = Barrio.OTRO;
        if(rs.getString(7) != null){
            barrio = Barrio.valueOf(rs.getString(7));
        }*/
        String barrio = rs.getString(7); 
        double superf = rs.getDouble(8);
        int ambi = rs.getInt(9);
        double precio = rs.getDouble(10);
        int reser = rs.getInt(11);
        
        Domicilio domicilio =  new Domicilio(calle,alt,depto,barrio);
        return new Inmueble(id,domicilio,superf,ambi,precio,reser);

    }
    
    private Casa generarCasa (ResultSet rs) throws SQLException{
        int id = rs.getInt(1);
        String calle = rs.getString(2);
        int alt = rs.getInt(3);        
        String depto = "-";
        if(rs.getString(4)!=null){
        depto = rs.getString(4);    
        }
         /*Barrio barrio = Barrio.OTRO;
        if(rs.getString(7) != null){
            barrio = Barrio.valueOf(rs.getString(7));
        }*/
       String barrio = rs.getString(5); 
        double superf = rs.getDouble(6);
        int ambi = rs.getInt(7);
        double precio = rs.getDouble(8);
        int reser = rs.getInt(9);
        int garaje = rs.getInt(10);
        int pileta = rs.getInt(11);
        int jardin = rs.getInt(12);
        
        Domicilio domicilio =  new Domicilio(calle,alt,depto,barrio);
        return new Casa(id,domicilio,superf,ambi,precio,reser,garaje,pileta,jardin);
    }
    
    private Departamento generarDepartamento (ResultSet rs) throws SQLException{
    int id = rs.getInt(1);
        String calle = rs.getString(2);
        int alt = rs.getInt(3);
        int piso = 0;
        if(rs.getInt(4)>0 ){
        piso = rs.getInt(4);    
        }
        String depto = "";
        if(rs.getString(5)!=null){
        depto = rs.getString(5);    
        }
         /*Barrio barrio = Barrio.OTRO;
        if(rs.getString(7) != null){
            barrio = Barrio.valueOf(rs.getString(7));
        }*/
        String barrio = rs.getString(6); 
        double superf = rs.getDouble(7);
        int ambi = rs.getInt(8);
        double precio = rs.getDouble(9);
        int reser = rs.getInt(10);
        int cochera = rs.getInt(11);
        int baulera = rs.getInt(12);
        
        Domicilio domicilio =  new Domicilio(calle,alt,piso,depto,barrio);
        return new Departamento (id,domicilio,superf,ambi,precio,reser,cochera,baulera);
    }
    
    private Cliente generarInteresado (ResultSet rs) throws SQLException{
        int id = rs.getInt(1);
        String nombre = rs.getString(2);
        String apellido = rs.getString(3);
        String mail = rs.getString(4);
        String celular = rs.getString(5);
        
        return new Cliente(id,nombre,apellido,mail,celular);
    }
    
}