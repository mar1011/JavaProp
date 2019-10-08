package javaprop;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariana
 */
public class Cliente implements Notificable{
        private int id;
        private String nombre;
	private String apellido;
	private String mail;
        private String celular;
	private ArrayList<Cliente> clientes;
        
     public Cliente() {
        this.id = 0;
    }

    public Cliente(int id, String nombre, String apellido, String mail, String celular) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.celular = celular;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMail() {
        return mail;
    }

    public String getCelular() {
        return celular;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMail(String mail) {
       
        this.mail = mail;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
	
	@Override
	public void notificarCambioPrecio(Inmueble inmueble, double precio) {
	JOptionPane.showMessageDialog(null, "Enviando cambio de precio a interesados en Inmueble ");
	}
	@Override
	public void notificarReserva(Inmueble inmueble) {
        JOptionPane.showMessageDialog(null, "El inmueble se encuentra reservado ");
		
	}

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido + " " + this.mail + " " + this.celular;
    }

 
	
	
}


