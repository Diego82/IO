package diapositivas;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class StringFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "Esto es una frase con ñ";
		//convertimos a un array de byte
		byte[] array = frase.getBytes();
		//Creamos el inmputString
		ByteArrayInputStream in = new ByteArrayInputStream(array);
		//vamos a volcar ese flujo de byte (stream) a un archivo
		//Primero creamos el archivo
		String path = "/home/matinal/Escritorio/out.txt";
		File outFile = new File(path);
		//Creamos el flujo de byte de salida outputstream
		//obviamente sera una FileOutpuStream
		FileOutputStream out = null;
		try {
			out  = new FileOutputStream(outFile);
			int c;
			while((c=in.read())!= -1){
				out.write(c);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if (out !=null)
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (in != null)
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}	
		
	}

}
