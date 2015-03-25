package diapositivas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AccessoAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try (RandomAccessFile fichero = new RandomAccessFile("/home/matinal/Escritorio/random.dat", "rw");) {
			//El puntero se encuentra siempre en la unidad 0
			//Todo lo que encuentro lo va a sobre escribir
			System.out.println("puntero del fichero: "+fichero.getFilePointer());
			System.out.println("Tamaño del fichero"+fichero.length());
			fichero.seek(fichero.length());
			for (int i = 0; i < 100; i++) {
				fichero.writeInt(i);
			}
			System.out.println("tamaño del archivo: "+fichero.length());
			System.out.println("puntero del fichero: "+fichero.getFilePointer());
			fichero.seek(45);
			System.out.println("Cambiamos la posicion del puntero: "+fichero.readInt());
			fichero.seek(36);
			System.out.println("Cambiamos la posicion de nuevo: "+fichero.readInt());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
