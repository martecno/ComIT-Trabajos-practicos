import java.text.DecimalFormat;

public class MainAPP {

	public static void main(String[] args) {

		final int CANTALUMNOS = 70;
		Double notasTotal = 0.0;
		int[] alumnos = new int[CANTALUMNOS];
		Double[] notas = new Double[CANTALUMNOS];

		notasTotal = completadoDeDatos(CANTALUMNOS, notasTotal, alumnos, notas);
		impresionDatos(CANTALUMNOS, notasTotal, notas, alumnos);

	}

	private static Double completadoDeDatos(final int CANTALUMNOS, Double notasTotal, int[] alumnos, Double[] notas) {
		for (int i = 0; i < CANTALUMNOS; i++) {
			notas[i] = (Math.random() * (10 - 0)) + 0;
			alumnos[i] = i + 1;
			notasTotal += notas[i];

		}
		return notasTotal;
	}

	private static void impresionDatos(final int CANTALUMNOS, double notasTotal, Double[] notas, int[] alumnos) {
		Double promedio = notasTotal / CANTALUMNOS;
		DecimalFormat df = new DecimalFormat("###,###.##");

		System.out.println("La nota promedio es = " + df.format(promedio));
		System.out.println("\nLos alumnos que superan el promedio son:\n");
		System.out.println("Alumno\tNota");

		for (int i = 0; i < CANTALUMNOS; i++) {
			if (notas[i] > promedio) {
				System.out.println(alumnos[i] + "\t" + df.format(notas[i]));
			}
		}
	}

}
