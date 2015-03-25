package diapositivas;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class guardarObjetos {
	public static void main(String[] args) {
		List<Persona> lista = new ArrayList<Persona>();
		Persona p1 = new Persona("diego", 23);
		lista.add(p1);
		Persona p2 = new Persona("pedro", 23);
		lista.add(p2);
		Persona p3 = new Persona("miguel", 23);
		lista.add(p3);
		Persona p4 = new Persona("martin", 23);
		lista.add(p4);
		Persona p5 = new Persona("david", 23);
		lista.add(p5);
		System.out.println(lista);
		//vamos a guardar esa lista en un fichero
		//primero creamos el objeto 
		try (ObjectOutputStream out1 = new ObjectOutputStream(
				new FileOutputStream(
					new File("/home/matinal/Escritorio/objeto.dat")));){
			out1.writeObject(lista);
		}
		catch (IOException ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}
		System.out.println("termina programa");
	}
	
}
class Persona implements Serializable{
	String nombre;
	int edad;
	/**
	 * @param nombre
	 * @param edad
	 */
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
