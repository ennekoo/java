package ariketak3;

/**
 * Crea un programa en Eclipse con el siguiente c�digo. Ejec�talo l�nea por l�nea para ver qu� valor tiene la variable 'resultado' 
 * en cada sentencia y al final del programa.
 */
public class Debug2 {

	public static void main(String[] args) {

        int a=10;
        int b=20;
        int c=40;
        int d=35;
     
        int resultado=(a+b)/2;
        resultado=d*resultado;
        resultado+=(c/2);
 
        System.out.println("El resultado es: " + resultado); 
	}
}