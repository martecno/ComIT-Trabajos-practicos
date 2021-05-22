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

		whileCompleto(sc, sn);

		System.out.println("\nSe terminaron de calcular las areas solicitadas");

	}

	private static void whileCompleto(Scanner sc, String sn) {
		while ("s".equalsIgnoreCase(sn)) {

			int opcion = opcionDeFigura(sc);
			opcion = comprobarValorDeLaOpcion(sc, opcion);

			switchCompleto(opcion);
			sc.nextLine();
			sn = deseaCalcularAreas(sc);
		}
	}

	private static void switchCompleto(int opcion) {
		switch (opcion) {
		case 1:
			circulo();
			break;
		case 2:
			cuadrado();
			break;
		case 3:
			rectangulo();
			break;
		case 4:
			triangulo();
			break;
		case 5:
			trapecio();
			break;
		default:
			break;
		}
	}

	private static void trapecio() {
		Double base1;
		Double base2;
		Double altura;
		Double area;
		base1 = solicitarIntPorTeclado("Ingrese la base menor en cm");
		base2 = solicitarIntPorTeclado("Ingrese la base mayor en cm");
		altura = solicitarIntPorTeclado("Ingrese la altura en cm");
		area = ((base1 + base2) / 2) * altura;
		area(area);
	}

	private static void triangulo() {
		Double base1;
		Double altura;
		Double area;
		base1 = solicitarIntPorTeclado("Ingrese la base en cm");
		altura = solicitarIntPorTeclado("Ingrese la altura en cm");
		area = (base1 * altura) / 2;
		area(area);
	}

	private static void rectangulo() {
		Double base1;
		Double altura;
		Double area;
		base1 = solicitarIntPorTeclado("Ingrese la base en cm");
		altura = solicitarIntPorTeclado("Ingrese la altura en cm");
		area = (base1 * altura);
		area(area);
	}

	private static void cuadrado() {
		Double base1;
		Double area;
		base1 = solicitarIntPorTeclado("Ingrese la base en cm");
		area = (base1 * base1);
		area(area);
	}

	private static void circulo() {
		Double radio;
		Double area;
		radio = solicitarIntPorTeclado("Ingrese el r�dio");
		area = Math.PI * (radio * radio);
		area(area);
	}

	private static int comprobarValorDeLaOpcion(Scanner sc, int opcion) {
		while (opcion < 0 || opcion > 5) {
			System.out.println("La opci�n que debe elegir es del 1 al 5");
			opcion = sc.nextInt();
		}
		return opcion;
	}

	private static int opcionDeFigura(Scanner sc) {
		System.out.println("Ingrese la figura sobre la cual desea sacar el �rea");
		System.out.println("1 - C�rculo\n2 - Cuadrado\n3 - Rect�ngulo\n4 - Tri�ngulo\n5 - Trapecio ");
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
		System.out.println("El �rea de la figura seleccionada es = " + df.format(area) + "cm�");
	}

	private static Double solicitarIntPorTeclado(String mensaje) {
		Scanner scan = new Scanner(System.in);
		System.out.println(mensaje);
		Double valor = scan.nextDouble();
		return valor;
	}
}
