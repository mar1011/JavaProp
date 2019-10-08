package javaprop;

/**
 *
 * @author Mariana
 */
public class Casa extends Inmueble{
    
	private int tienePileta;
	private int tieneGarage;
	private int tieneJardin;


    public Casa(int id, Domicilio domicilio, double superficie, int cantAmbientes, double precio, int reservado, int tieneGarage, int tienePileta, int tieneJardin ) {
        super(id, domicilio, superficie, cantAmbientes, precio, reservado);
        this.tieneGarage = tieneGarage;
        this.tienePileta = tienePileta;
        this.tieneJardin = tieneJardin;
    }

    public int getTienePileta() {
        return tienePileta;
    }

    public int getTieneGarage() {
        return tieneGarage;
    }

    public int getTieneJardin() {
        return tieneJardin;
    }

 
	
	


	

}
