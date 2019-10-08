package javaprop;

/**
 *
 * @author Mariana
 */
public class Departamento extends Inmueble{

	private int tieneCochera;
	private int tieneBaulera;

    public Departamento(int id, Domicilio domicilio, double superficie, int cantAmbientes, double precio, int reservado, int tieneCochera, int tieneBaulera ) {
        super(id, domicilio, superficie, cantAmbientes, precio, reservado);
        this.tieneCochera = tieneCochera;
        this.tieneBaulera = tieneBaulera;
    }

    public int getTieneCochera() {
        return tieneCochera;
    }

    public int getTieneBaulera() {
        return tieneBaulera;
    }
	
}
