package ej4;


import java.util.Scanner;
public class ej4 {

	public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		double tamano;
		int sumar =0;
		int a [][]=  new int[100][100];

		System.out.println("Indica la dimensión de tu matriz cuadrada");
         tamano=sc.nextDouble(); 
         
		
		for(int i=0; i<tamano; i++) {
			
			for (int j=0; j<tamano;j++){
				a[i][j]=(int)Math.random();
				sumar=sumar+a[i][j];
				}
		}
		System.out.println(sumar);
	}

}
