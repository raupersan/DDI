package ProyectoRaul;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

	public static Coche crearCoche() {
		String marca;
		String color;
		String nBastidor;
		int kilometros;
		double vMax;
		char electrico;
		char antiguo;
		boolean electricob=false;
		boolean antiguob=false;
		sc.nextLine();
		System.out.println("Introduce la marca del coche");
		marca = sc.nextLine();
		System.out.println("Introduce el color");
		color = sc.nextLine();
		System.out.println("Introduce el número de bastidor");
		nBastidor = sc.nextLine();
		System.out.println("Introduce el número de kilómetros que tiene");
		kilometros = sc.nextInt();
		System.out.println("Indica su velocidad máxima");
		vMax = sc.nextDouble();
		System.out.println("Indica si es o no eléctrico");
		System.out.println("Si: s");
		System.out.println("No: n");
		electrico = sc.next().charAt(0);
		if(electrico=='s')
			electricob=true;
		System.out.println("Indica si es o no antigüo");
		System.out.println("Si: s");
		System.out.println("No: n");
		antiguo = sc.next().charAt(0);
		if(antiguo=='s')
			antiguob=true;
		Coche coche = new Coche(marca, color, nBastidor, kilometros, vMax, electricob, antiguob);
		return coche;
	}

	public static Barco crearBarco() {
		String marca;
		String color;
		String nBastidor;
		int kilometros;
		double vMax;
		int eslora;
		int calado;
		String tipo;

		sc.nextLine();
		System.out.println("Introduce la marca del barco");
		marca = sc.nextLine();
		System.out.println("Introduce el color");
		color = sc.nextLine();
		System.out.println("Introduce el número de bastidor");
		nBastidor = sc.nextLine();
		System.out.println("Introduce el número de kilómetros que tiene");
		kilometros = sc.nextInt();
		System.out.println("Indica su velocidad máxima");
		vMax = sc.nextDouble();
		System.out.println("Introduce la eslora del barco");
		eslora = sc.nextInt();
		System.out.println("Indica su calado");
		calado = sc.nextInt();
		tipo = sc.nextLine();
		Barco barco = new Barco(marca, color, nBastidor, kilometros, vMax, eslora, calado, tipo);
		return barco;
	}

	public static Avion crearAvion() {
		String marca;
		String color;
		String nBastidor;
		int kilometros;
		double vMax;
		byte motores;
		double velocidadMax;
		char combate;
		boolean combateb;
		sc.nextLine();
		System.out.println("Introduce la marca del avión");
		marca = sc.nextLine();
		System.out.println("Introduce el color");
		color = sc.nextLine();
		System.out.println("Introduce el número de bastidor");
		nBastidor = sc.nextLine();
		System.out.println("Introduce el número de kilómetros que tiene");
		kilometros = sc.nextInt();
		System.out.println("Indica su velocidad máxima");
		vMax = sc.nextDouble();
		System.out.println("Introduce el número de motores");
		motores = sc.nextByte();
		System.out.println("Indica su velocidad máxima");
		velocidadMax = sc.nextDouble();
		System.out.println("Indica si se trata o no de un avión de combate");
		System.out.println("Si: s");
		System.out.println("No: n");
		combate = sc.next().charAt(0);
		if (combate=='s')
			combateb=true;
		else
			combateb=false;
		Avion avion = new Avion(marca, color, nBastidor, kilometros, motores, vMax, combateb);
		return avion;
	}

	public static Scanner sc = new Scanner(System.in);

	public static double masRapido(ArrayList<Coche> coches, ArrayList<Barco> barcos, ArrayList<Avion> aviones) {
		double rapido = 0;
		double cocheMax;
		double barcoMax;
		double avionMax;
		for (int i = 0; i < coches.size(); i++) {
			if (rapido < coches.get(i).getVelocidadMax())
				rapido = coches.get(i).getVelocidadMax();
		}
		for (int i = 0; i < barcos.size(); i++) {
			if (rapido < barcos.get(i).getVelocidadMax())
				rapido = barcos.get(i).getVelocidadMax();
		}
		for (int i = 0; i < aviones.size(); i++) {
			if (rapido < aviones.get(i).getVelocidadMax())
				rapido = aviones.get(i).getVelocidadMax();
		}
		return rapido;
	}

	public static void main(String[] args) {
		int vehiculo;
		double rapido = 0;
		ArrayList<Coche> listaCoches = new ArrayList<Coche>();
		ArrayList<Barco> listaBarcos = new ArrayList<Barco>();
		ArrayList<Avion> listaAviones = new ArrayList<Avion>();
		ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();

		do {
			System.out.println("Introduce el tipo de vehículo que quieres registrar");
			System.out.println("1. Coche");
			System.out.println("2. Barco");
			System.out.println("3. Avión");
			System.out.println("4. Salir");
			vehiculo = sc.nextInt();

			if (vehiculo == 1)
				listaCoches.add(crearCoche());

			else if (vehiculo == 2)
				listaBarcos.add(crearBarco());

			else if (vehiculo==3)
				listaAviones.add(crearAvion());
			
			
		} while (vehiculo != 4);
		listaVehiculos.addAll(listaCoches);
		listaVehiculos.addAll(listaBarcos);
		listaVehiculos.addAll(listaAviones);
		listaVehiculos.sort(null);

		for (int i = 0; i < listaVehiculos.size(); i++) {
			if (i == listaVehiculos.size()-1)
				System.out.println(listaVehiculos.get(i).getnBastidor()
						+ " es el número de bastidor del vehículo más rápido, que es un "
						+ listaVehiculos.get(i).getClass().getCanonicalName() + " con una velocidad de: "
						+ listaVehiculos.get(i).getVelocidadMax() + "km/h");
		}

		for (int j = 0; j < listaCoches.size(); j++) {
			if (listaCoches.get(j).electrico == true) {
				System.out.println(listaCoches.get(j).getMarca() + " es eléctrico");
			}
		}
	}
}
