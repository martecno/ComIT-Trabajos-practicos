import java.text.DecimalFormat;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Double radio = 0.0;
		Double base1 = 0.0;
		Double base2 = 0.0;
		Double altura = 0.0;
		Double area = 0.0;
		String sn;

		sn = "s";

		while ("s".equalsIgnoreCase(sn)) {

			int opcion = opcionDeFigura(sc);
			opcion = comprobarValorDeLaOpcion(sc, opcion);

			switch (opcion) {
			case 1:
				radio = solicitarIntPorTeclado("Ingrese el rádio");
				area = Math.PI * (radio * radio);
				area(area);
				break;
			case 2:
				base1 = solicitarIntPorTeclado("Ingrese la base en cm");
				area = (base1 * base1);
				area(area);
				break;
			case 3:
				base1 = solicitarIntPorTeclado("Ingrese la base en cm");
				altura = solicitarIntPorTeclado("Ingrese la altura en cm");
				area = (base1 * altura);
				area(area);
				break;
			case 4:
				base1 = solicitarIntPorTeclado("Ingrese la base en cm");
				altura = solicitarIntPorTeclado("Ingrese la altura en cm");
				area = (base1 * altura) / 2;
				area(area);
				break;
			case 5:
				base1 = solicitarIntPorTeclado("Ingrese la base menor en cm");
				base2 = solicitarIntPorTeclado("Ingrese la base mayor en cm");
				altura = solicitarIntPorTeclado("Ingrese la altura en cm");
				area = ((base1 + base2) / 2) * altura;
				area(area);
				break;
			default:
				break;
			}
			sc.nextLine();
			sn = deseaCalcularAreas(sc);
		}

		System.out.println("\nSe terminaron de calcular las areas solicitadas");

	}

	private static int comprobarValorDeLaOpcion(Scanner sc, int opcion) {
		while (opcion < 0 || opcion > 5) {
			System.out.println("La opción que debe elegir es del 1 al 5");
			opcion = sc.nextInt();
		}
		return opcion;
	}

	private static int opcionDeFigura(Scanner sc) {
		System.out.println("Ingrese la figura sobre la cual desea sacar el área");
		System.out.println("1 - Círculo\n2 - Cuadrado\n3 - Rectángulo\n4 - Triángulo\n5 - Trapecio ");
		int opcion = sc.nextInt();
		return opcion;
	}

	private static String deseaCalcularAreas(Scanner sc) {
		System.out.println("\nDesea seguir calculando areas de las figuras? S/N");
		String sn = sc.nextLine();
		return sn;
	}

	private static void area(Double area) {
		DecimalFormat df = new DecimalFormat("###,###.##");
		System.out.println("El área de la figura seleccionada es = " + df.format(area) + "cm²");
	}

	private static Double solicitarIntPorTeclado(String mensaje) {
		Scanner scan = new Scanner(System.in);
		System.out.println(mensaje);
		Double valor = scan.nextDouble();
		return valor;
	}

}
