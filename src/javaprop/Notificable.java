package javaprop;

/**
 *
 * @author Mariana
 */
public interface Notificable {

	public abstract void notificarCambioPrecio(Inmueble inmueble, double precio);
	public abstract void notificarReserva(Inmueble inmueble);
}
