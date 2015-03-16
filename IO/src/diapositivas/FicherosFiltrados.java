package diapositivas;

import java.io.File;
import java.io.FilenameFilter;

public class FicherosFiltrados {
	public static void main(String[] args) {
		if (args.length==0) {
			System.out.println("no hay argumentos");
			System.exit(1); //Manda a la linea un 1 y no continua el programa
		}
		File directorio = new File(args[0]);
		//Si es un directorio, hacemos un filtro 
		if (directorio.isDirectory()){
			String[] archivos = directorio.list(new FilenameFilter() {
				
				@Override
				public boolean accept(File directorio, String name) {
					// TODO Auto-generated method stub
					return name.endsWith(".java");
				}
			});
			//imprimimos los valores
			for (int i = 0; i < archivos.length; i++) {
				System.out.println("nombre del archivo: "+archivos[i]);
			}
		}
	}
}
