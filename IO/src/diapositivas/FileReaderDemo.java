package diapositivas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inFile = new File("/home/matinal/Escritorio/nombres_mujer.txt");
		//stream elegido FileReader
		BufferedReader in = null;
		//lectura del mismo
		//usamos int para leer el codigo del caracter
		try {
			in = new FileReader(inFile);
			out
			while((c=in.read())!=-1)
				System.out.println(in);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
