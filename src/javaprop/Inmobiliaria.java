package javaprop;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariana
 */
public class Inmobiliaria implements Notificable{
	private int id;	
	private String nombre;
	private String mail;
	private double comision;
	private ArrayList <Inmueble> inmuebles;
	
	public Inmobiliaria(int id, String nombre, String mail, double comision) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.mail = mail;
		this.comision = comision;
	}
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getMail() {
		return mail;
	}

	public double getComision() {
		return comision;
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
		return "Inmobiliaria [id=" + id + ", nombre=" + nombre + ", mail=" + mail + ", comision=" + comision + "]";
	}
}