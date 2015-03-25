package diapositivas;

import java.awt.LinearGradientPaint;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "esto es un texto que vamos a enviar a un fichero";
		File inFile = new File("/home/matinal/Escritorio/nombres_mujer.txt");
		File outFile = new File("/home/matinal/Escritorio/nombres_mujer_back.txt");
		//vamos a añadir a un flujo de salida el String texto y las diez
		//primeras lineas de inFile
		//Trabajamos try-catch con jdk-1.7
		try(BufferedReader in = new BufferedReader(new FileReader(inFile));
				PrintWriter out = new PrintWriter(new FileOutputStream(outFile))){
			out.write(texto);
			String lineaLeida;
			for (int i = 0; i < 10; i++) {
				lineaLeida = in.readLine();
				out.write(lineaLeida+"\n");
			}
		}
		catch (IOException ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}
		System.out.println("programa terminado");
	}

}
