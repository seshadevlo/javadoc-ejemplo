package javadoc;
/**
 * @author Sebastian HT
 * 
 * Clase base para representar un vehiculo generico.
 */
public class Vehiculo {

	/**
	 * marca del vehiculo.
	 */
	protected String marca;
	/**
	 * modelo del vehiculo.
	 */
	protected String modelo;
	
	
	/**
	 * cosntructor para crear una instancia de vehiculo.
	 * 
	 * @param marca del vehiculo.
	 * @param modelo del vehiculo.
	 */
	public Vehiculo(String marca, String modelo) {
		
		this.marca = marca;
		this.modelo = modelo;
	}
	
	/**
	 * Muestra la Marca y el Modelo del vehiculo.
	 *  
	 * @return una cadena de texto que indica Marca y Modelo del vehiculo.
	 * 
	 */
	
	public String mostrarDetalles() {
		return "Marca: "+marca+", Modelo: "+modelo;
		
	}
	
}
