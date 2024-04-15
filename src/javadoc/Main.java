package javadoc;
/**
 * @author Sebastian HT
 * 
 * clase principal para ejecutar la aplicacion.
 * 
 */
public class Main {

	/**
	 * metodo de entrada a la aplicacion que al ejecutarse 
	 * crea una instancia de la clase auto y muestra sus detalles. 
	 * 
	 * @param args argumentos de la linea de comandos, no utilizados en esta aplicacion.
	 */
	public static void main(String[] args) {
		//crea una auto de marca toyota.

		Auto miAuto = new Auto ("Toyota", "Supra MK4", 4);
		
		System.out.println(miAuto.mostrarDetalles());
		
	}

}
