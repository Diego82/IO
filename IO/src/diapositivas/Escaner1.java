package diapositivas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Escaner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//vamos a leer un archivo
		File inFile = new File("/home/matinal/Escritorio/Prueba2.txt");
		try (Scanner in = new Scanner(inFile,"ISO-8859-15");){
			String valorLeido;
			while(in.hasNext()){
				valorLeido = in.next();
				System.out.println(valorLeido);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
