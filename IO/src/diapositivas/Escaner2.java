package diapositivas;

import java.util.Scanner;

public class Escaner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "juan:fernandez:22:true:222,22";
		Scanner in = new Scanner(frase);
		in.useDelimiter(":");
		String nombre = in.next();
		String apellido = in.next();
		int edad = in.nextInt();
		boolean condicion = in.nextBoolean();
		double pago = in.nextDouble();
		System.out.println("Nombre: "+nombre+"apellido: "+apellido);
		System.out.println("edad: "+edad+" condicion: "+condicion+" pago: "+pago);
		in.close();
	}

}
