package diapositivas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileReader2 {
	public static void main(String[] args) {
		//solo para archivos de texto
		File inFile = new File("/home/matinal/Escritorio/nombres_mujer.txt");
		//stream elegido FileReader, lo envolvemos con BufferedReader
		//Lo vamos a escribir en un fichero:
		File outFile = new File("/home/matinal/Escritorio/salida.txt");
		//lectura del mismo
		try (BufferedReader in = new BufferedReader(new FileReader(inFile));
				BufferedWriter out = new BufferedWriter(new FileWriter(outFile))){
			String lineaLeida;
			while ((lineaLeida=in.readLine())!=null){
				out.write(lineaLeida+"\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("termina el programa");
	}
}
