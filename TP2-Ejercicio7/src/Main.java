import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.##");

		int edad;  
		int experiencia;
		int remuneracion;
		String sn;
		String nombre;

		System.out.println("Ingrese el nombre del solicitante");
		nombre = sc.nextLine();
		System.out.println("Ingrese la edad del solicitante");
		edad = sc.nextInt();
		System.out.println("Ingrese la experiencia del solicitante");
		experiencia = sc.nextInt();
		System.out.println("Ingrese la remuneración pretendida del solicitante");
		remuneracion = sc.nextInt();
		sc.nextLine();

		if (edad >= 18 && edad <= 35) {
			if (edad > 32 && (experiencia > 6) || (edad < 32) || (experiencia < 3 && (remuneracion < 50000)) || ((edad >=33 && edad <=35) && (experiencia>=6)))
				System.out.println("El solicitante " + nombre + " fue aceptado");
			else if (edad >= 32 && ((experiencia < 6) && (experiencia > 3)))
				System.out.println("El solicitante " + nombre + " fue aceptado en forma condicional");
			else if ( edad<33 )
			System.out.println("pepe");
			else
				System.out.println("El solicitante " + nombre + " fue rechazado");
		} else
			System.out.println("El solicitante " + nombre + " fue rechazado");
		

	}

}