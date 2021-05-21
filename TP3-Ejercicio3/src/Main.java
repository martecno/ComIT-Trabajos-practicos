import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.##");

		int cantPatentes;
		int contador = 0;
		Double porcentaje = null;
		Double nroPatente;
		Double valorAuto;
		Double totalPatentes = 0.0;
		Double montoAPagar = null;

		System.out.println("Ingrese la cantidad de patentes a ingresar");
		cantPatentes = sc.nextInt();

		while (cantPatentes < 1) {
			System.out.println("El número ingresado debe ser superior a 1. Ingrese la cantidad de patentes a ingresar");
			cantPatentes = sc.nextInt();
		}

		for (int i = 1; i <= cantPatentes; i++) {
			nroPatente = (Math.random() * ((3000000 - 800000) + 1)) + 800000;
			valorAuto = (Math.random() * ((5000000 - 1000000) + 1)) + 1000000;
			if (nroPatente < 1000000) {
				montoAPagar = valorAuto * 0.05;

				System.out.println("Su auto es de: $" + df.format(valorAuto)
						+ " \tPagará el 5% del valor de su modelo y es de: $" + df.format(montoAPagar));
			} else if ((nroPatente > 1000000) && (nroPatente < 2000000)) {
				montoAPagar = valorAuto * 0.1;
				System.out.println("Su auto es de: $" + df.format(valorAuto)
						+ " \tPagará el 10% del valor de su modelo y es de: $" + df.format(montoAPagar));
			} else if (nroPatente > 2000000) {
				montoAPagar = valorAuto * 0.15;
				System.out.println("Su auto es de: $" + df.format(valorAuto)
						+ " \tPagará el 15% del valor de su modelo y es de: $" + df.format(montoAPagar));
			} else {
				System.out.println("El monto es demasiado bajo para un automotor");
			}

			if (nroPatente > 1300000)
				contador += 1;

			porcentaje = (double) ((contador * 100) / cantPatentes);

			totalPatentes += nroPatente;
		}

		System.out.println(
				"\nEl monto total recaudado por el Registro Automotor es de : $" + df.format(totalPatentes) + "\n");
		System.out.println("El porcentaje de la numeración superior a 1.300.000 es del: " + porcentaje + "%");

	}

}
