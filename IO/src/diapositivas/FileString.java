package diapositivas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileString {

	public static void main(String[] args) {

		//recepcionamos un flujo de bytes desde un archivo
		//escogemos com inputStream FileInputStream
		//previamente degejos crear un objeto File
		File inFile = new File("/home/matinal/Escritorio/out.txt");
		FileInputStream in = null;
		String textoaRecibir ="";
		try {
			in = new FileInputStream(inFile);
			
			int c;
			while((c=in.read())!=-1){
				textoaRecibir+=(char)c;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if (in != null)
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		System.out.println(textoaRecibir);
	}

}
