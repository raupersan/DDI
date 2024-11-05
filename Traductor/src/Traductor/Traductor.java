package Traductor;

import java.io.BufferedReader;
import java.io.*;
import java.net.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Traductor {
	private static String obtenerHTML(URL direccion) throws IOException {
		String inputline, codigo = "";
		BufferedReader in = new BufferedReader(new InputStreamReader(direccion.openStream()));

		while ((inputline = in.readLine()) != null) {
			codigo += inputline;
		}
		in.close();
		return codigo;
	}

	public static void buscarHTML(String html) {
		int indice = html.indexOf("<a href=\"/traductor/dog?langFrom=en\" class=\"MhZ0VHvJ\">dog</a>");

		String resultado = html.substring(indice, indice + 100);
	}

	private static String traducirJsoup(String palabra) {
		String cadena = null;
		Document document = null;
		String webpage = "https://www.ingles.com/traductor/" + palabra;
		try {
			document = Jsoup.connect(webpage).get();
		} catch (IOException e) {
			e.printStackTrace();

			cadena = document.getElementById("quickdef1-es").getElementsByClass("MhZ0VHvJ").html().toUpperCase();

		}

		return webpage;

	}

	public static void main(String[] args) throws IOException {
		String palabra = " ";

		URL direccion = new URL("https://www.ingles.com/traductor/perro");
		String html = obtenerHTML(direccion);
		/**
		 * Versión tosca buscarHTML(html);
		 */

		System.out.println(traducirJsoup("perro"));

		// System.out.println(html);
	}

}
