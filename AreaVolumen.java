import java.util.Scanner;

/**
 * Herramienta para hallar el area de un circulo y el volumen de una esfera.
 *
 * @author (GINinja)
 * @version (07282019)
 */
   public class AreaVolumen {
	private static Scanner scan;

	public static void main(String[] args) {
		double radio, area, Volumen;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese el valor del radio: ");
		radio = scan.nextDouble();
		
		area =  4 * Math.PI * radio * radio;
		Volumen = (4.0 / 3) * Math.PI * radio * radio * radio;

		System.out.format("\n El area del circulo es: = %.2f", area);
		System.out.format("\n El volumen de la esfera es: = %.2f", Volumen);
	}
}