package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;

public class ComprobarArchivos {

	public ComprobarArchivos() {

	}
	public boolean comprobar() {
		boolean bool = false;
		String rutaUsers =".\\src\\ficheros\\Files\\Usuarios.txt";
		String rutaTxtFacil = ".\\src\\ficheros\\Files\\TextoFacil.txt";
		String rutaTxtDif = ".\\src\\ficheros\\Files\\TextoDificl.txt";
		String estadisticas =".\\src\\ficheros\\Files\\Estadisticas.txt";
		try {
		File fileU = new File(rutaUsers);
		File fileFac = new File(rutaTxtFacil);
		File fileDif = new File(rutaTxtDif);
		File stats = new File(estadisticas);
		
		
		
		if(fileU.exists()&&fileFac.exists()&&fileDif.exists()&&stats.exists())
			bool= true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			return bool;

}
	
}
