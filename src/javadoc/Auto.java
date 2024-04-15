package javadoc;
/**
 * @author Sebastian HT
 * 
 * Clase para representar un vehiculo de Tipo automovil.
 */
public class Auto extends Vehiculo {

	/**
	 * Variable con el numero de puertas del automovil.
	 */
	private int numeroDePuertas;

	/**
	 * cosntructor para crear una nueva instancia de auto.
	 * @param marca Marca del automovil.
	 * @param modelo Modelo del automovil.
	 * @param numeroDePuertas Numero de puertas del automovil.
	 */
	public Auto(String marca, String modelo, int numeroDePuertas) {
		super(marca, modelo);
		this.numeroDePuertas = numeroDePuertas;
	}
	
	/**
	 * metodo sobreescrito que muestra Marca, Modelo y Numero de puertas. 
	 * 
	 * @return retorna lo mismo que el metodo previamente pero incluye la variable numeroDePuertas.
	 * 
	 */
	
	@Override 
	public String mostrarDetalles() {
		return super.mostrarDetalles() + ", numero de puertas: " + numeroDePuertas; 
	}	
}
