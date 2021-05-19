
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numEnt;
		int numEnt2;
		int numEnt3;
		int suma;
		int promedio;

		System.out.println("Ingrese el primer número entre 100 y 999");
		numEnt = solicitarEnteroPorTeclado(sc);
		numEnt = fueraderango(sc, numEnt);
		System.out.println("Ingrese el segundo número entre 100 y 999");
		numEnt2 = solicitarEnteroPorTeclado(sc);
		numEnt2 = fueraderango(sc, numEnt2);
		System.out.println("Ingrese el tercer número entre 100 y 999");
		numEnt3 = solicitarEnteroPorTeclado(sc);
		numEnt3 = fueraderango(sc, numEnt3);

		suma = suma(numEnt, numEnt2, numEnt3);
		promedio(suma);
		porcentajeDelPrimerNum(numEnt, suma);

	}

	private static void porcentajeDelPrimerNum(int numEnt, int suma) {
		int porcentaje = numEnt * 100 / suma;
		System.out.println(porcentaje + "%");
	}

	private static void promedio(int suma) {
		int promedio;
		promedio = suma / 3;
		System.out.println(promedio);
	}

	private static int suma(int numEnt, int numEnt2, int numEnt3) {
		int suma;
		suma = numEnt + numEnt2 + numEnt3;
		System.out.println(suma);
		return suma;
	}

	private static int solicitarEnteroPorTeclado(Scanner sc) {
		int numEnt;
		numEnt = sc.nextInt();
		return numEnt;
	}

	private static int fueraderango(Scanner sc, int num) {
		while ((num < 100) || (num > 999)) {
			System.out.println("Vuelva a ingresar el número");
			num = solicitarEnteroPorTeclado(sc);
		}
		return num;
	}

}
