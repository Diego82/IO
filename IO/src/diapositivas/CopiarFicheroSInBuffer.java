package diapositivas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarFicheroSInBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inFile = new File("/home/matinal/Escritorio/salida2.txt");
		File outFile = new File("/home/matinal/Escritorio/salida3.pdf");
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		//inicializamos los dos stream
		try {
			in = new FileInputStream(inFile);
			out = new FileOutputStream(outFile);
			//controlamos el tiempo de ejecucion
			long inicio = System.nanoTime();
			//Procedemos a la lectura del inputstream
			int c; //recogemos los bytes uno a uno hasta que encuentra un -1 (fin de la lectura)
			while((c=in.read())!=-1)
				out.write(c);
			//cogemos el final de la ejecucion
			long termina = System.nanoTime();
			System.out.println("Fichero copiado en "+(termina-inicio)/1000000+" ms");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { //cerramos los flujos
			if (in!=null)
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (out!=null)
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}

}
