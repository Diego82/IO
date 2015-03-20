package diapositivas;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarFicheroConBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inFile = new File("/home/matinal/Escritorio/prueba.pdf");
		File outFile = new File("/home/matinal/Escritorio/salida2.txt");
		
		BufferedOutputStream out = null;
		BufferedInputStream in = null;
		
		//inicializamos los dos stream
		try {
			in = new BufferedInputStream(new FileInputStream(inFile));
			out = new BufferedOutputStream(new FileOutputStream(outFile));
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
