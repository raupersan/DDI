package EmailSimple;

import java.io.*;

public class Body {
	public static String leerCuerpo(String ruta) {
		String linea="";
		String enviar="";
		try {
	
			BufferedReader br = new BufferedReader(new FileReader(new File(ruta)));
			try {
				while((linea=br.readLine())!=null) {
					enviar=enviar+linea;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
		return enviar;
	}
}

