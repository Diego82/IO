package diapositivas;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerFicheroConFormato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fichero de entrada:
		File infile = new File("/home/matinal/Escritorio/nombres_mujer.txt");
		//Stream elegido: DataImputStream
		DataInputStream in = null;
		try {
			in = new DataInputStream(
					new BufferedInputStream(
							new FileInputStream(infile)));
			//Leemos un String
			String leido;
			while((leido=in.readLine())!=null)
				System.out.println(leido);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if (in!=null)
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}

}
