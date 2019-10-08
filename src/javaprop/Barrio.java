
package javaprop;
/**
 *
 * @author Mariana
 */
public enum Barrio {
    AGRONOMÍA ("Agronomía"),
	ALMAGRO ("Almagro"),
	BALVANERA ("Balvanera"),
	BARRACAS ("Barracas"),
	BELGRANO ("Belgrano"),
	BOEDO ("Boedo"),
	CABALLITO ("Caballito"),
	CHACARITA ("Chacarita"),
	COGHLAN ("Coghlan"),
	COLEGIALES ("Colegiales"),
	CONSTITUCION ("Constitución"),
	FLORES ("Flores"),
	FLORESTA ("Floresta"),
	LA_PATERNAL ("La Paternal"),
	LA_BOCA ("La Boca"),
	LINIERS ("Liniers"),
	MATADEROS ("Mataderos"),
	MONSERRAT ("Monserrat"),
	MONTE_CASTRO ("Monte Castro"),
	NUEVA_POMPEYA ("Nueva Pompeya"),
	NUÑEZ ("Núnez"),
	PALERMO ("Palermo"),
	PARQUE_AVELLANEDA ("Parque Avellaneda"),
	PARQUE_CHACABUCO ("Parque Chacabuco"),
	PARQUE_CHAS ("Parque Chas"),
	PARQUE_PATRICIOS ("Parque Patricios"),
	PUERTO_MADERO ("Puerto Madero"),
	RECOLETA ("Recoleta"),
	RETIRO ("Retiro"),
	SAAVEDRA ("Saavedra"),
	SAN_CRISTOBAL ("San Cristóbal"),
	SAN_NICOLAS ("San Nicolás"),
	SAN_TELMO ("San Telmo"),
	VELEZ_SARSFIELD ("Vélez Sárfielz"),
	VERSALLES ("Versalles"),
	VILLA_CRESPO ("Villa Crespo"),
	VILLA_DEL_PARQUE ("Villa del Parque"),
	VILLA_DEVOTO ("Villa Devoto"),
	VILLA_GENERAL_MITRE ("Villa General Mitre"),
	VILLA_LUGANO ("Villa Lugano"),
	VILLA_LURO ("Villa Luro"),
	VILLA_ORTUZAR ("Villa Ortúzar"),
	VILLA_PUEYRREDON ("Villa Pueyrredón"),
	VILLA_REAL ("Villa Real"),
	VILLA_RIACHUELO ("Villa Riachuelo"),
	VILLA_SANTA_RITA ("Villa Santa Rita"),
	VILLA_SOLDATI ("Villa Soldati"),
	VILLA_URQUIZA ("Villa Urquiza"),
        OTRO ("Otro");

        private String minuscula;
        
        private Barrio(String m){
            this.minuscula= m;
        }
        
        public String getMinuscula(){
            return minuscula;
        }
        
        @Override
        public String toString(){
            return this.minuscula;
        }
}
