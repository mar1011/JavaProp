package javaprop;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariana
 */
public class Inmueble implements Notificable{

	private int id;
	private Domicilio domicilio;
	private double superficie;
	private int cantAmbientes;
	private double precio;
	private int reservado;
	private ArrayList<Cliente> interesados;
        
        public Inmueble(){
            this.id=0;
        }
	
	public Inmueble(int id,Domicilio domicilio,  double superficie, int cantAmbientes, double precio, int reservado) {

		this.id=id;
		this.domicilio = domicilio;
		this.superficie = superficie;
		this.cantAmbientes = cantAmbientes;
		this.precio = precio;
		this.reservado = reservado;
	}
	
	public int getID(){
            return id;
        }
	public Domicilio getDomicilio() {
		return domicilio;
	}

	public double getPrecio() {
		return precio;
	}

	public double getSuperficie() {
		return superficie;
	}

	public int getCantAmbientes() {
		return cantAmbientes;
	}

	public int getReservado() {
		return reservado;
	}

    public void setPrecio(double precio) throws DoubleFueraDeRangoException{
        double max = 999999999;
        if(precio>max){ 
        throw new DoubleFueraDeRangoException("Precio fuera del rango máximo");  
        }
        this.precio = precio;
        }

	@Override
	public void notificarCambioPrecio(Inmueble inmueble, double precio) {
            
        JOptionPane.showMessageDialog(null, "Enviando cambio de precio a interesados en Inmueble ");
            
	}

	@Override
	public void notificarReserva(Inmueble inmueble) {
            if(reservado==1){
	 JOptionPane.showMessageDialog(null, "El inmueble se encuentra reservado ");
          }
	}
}