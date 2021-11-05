package ariketak3;

/**
 * Crea un programa en Eclipse con el siguiente c�digo. Ejec�talo l�nea por l�nea para ver qu� valor tiene 
 * la variable 'a' en cada iteraci�n del bucle y tras salir de �l.
 */
public class Debug {

	public static void main(String[] args) {

		int a=10, b=2;
		for (a=2; a<=300 && b<20; a*=b){
		    a++;
		}
	
		System.out.println ("Fin - a= " + a + " y b= " + b);
	}
}