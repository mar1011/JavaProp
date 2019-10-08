package javaprop;

/**
 *
 * @author Mariana
 */
public class Domicilio{
		private String calle;
		private int altura;
		private int piso;
		private String depto;
		//private Barrio barrio;
		private String barrio;
		public Domicilio(String calle, int altura, int piso, String depto, String barrio) {
			super();
			this.calle = calle;
			this.altura = altura;
			this.piso = piso;
			this.depto = depto;
			this.barrio=barrio;
		}
                
                public Domicilio(String calle, int altura, String depto, String barrio){
                        super();
			this.calle = calle;
			this.altura = altura;
			this.depto = depto;
			this.barrio=barrio;
                }

		public String getCalle() {
			return calle;
		}

		public int getAltura() {
			return altura;
		}

		public int getPiso() {
                   
			return piso;
		}

		public String getDepto() {
                    
			return depto;
		}

                public String getBarrio() {
                    return barrio;
                }

    @Override
    public String toString() {
        return this.calle + " " + this.altura + this.piso + "  dpto: " + this.depto +" "+ this.barrio; 
    }
		
}
