package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int contador=0;
		int salidaBucle=0;
		int opcionGeneral;
		int opcion1=0;
		int respuesta1=0;
		int opcion2=0;
		int opcion3=0;
		int opcion4=0;
		int opcion5=0;
		int opcion6=0;
		String [] flameado  = new String [6];
		String [] flameadoMoe = new String[] {"2 cucharadas de brandy",
				"1 cucharada de licor de moras", "2 cucharadas de crema de mentas", "2 cucharadas de zumo de piña",
				"2 cucharadas de pacharán","2 cucharadas de jarabe de hierbabuena"};


		do {

			opcionGeneral = menu ();
			switch (opcionGeneral) {

			case 1:
				if (flameado [0]==null) {
					
					opcion1= menu1 ();
					respuesta1 = Integer.parseInt(teclado.readLine());

					if (respuesta1==1) {
						flameado [0]= "2 cucharadas de brandy";
					} else if (respuesta1==2) {
						flameado [0]= "2 cucharadas de ron blanco";
					} else {
						flameado [0]= "2 cucharadas de ginebra";
					}
					contador++;
				}else {
					System.out.println("Este ingrediente ya lo has elegido");
				}
				break;
			case 2:
				if (flameado [1]==null) {
					opcion2 = menu2 ();
					respuesta1 = Integer.parseInt(teclado.readLine());
					if (respuesta1==1) {
						flameado [1]= "1 cucharada de licor de moras";
					} else if (respuesta1==2) {
						flameado [1]= "1 cucharada de orujo de hierbas";
					} else {
						flameado [1]= "2 cucharadas de granadina";
					}
					contador++;
				} else {
					System.out.println("Este ingrediente ya lo has elegido");
				}
				break;
			case 3:
				if (flameado [2]==null) {
					opcion3 = menu3 ();
					respuesta1 = Integer.parseInt(teclado.readLine());
					if (respuesta1==1) {
						flameado [2]= "2 cucharadas de crema de mentas";
					} else if (respuesta1==2) {
						flameado [2]= "2 cucharadas de Baileys";
					} else {
						flameado [2]= "2 cucharadas de crema de Orujo";
					}
					contador++;
				}else {
					System.out.println("Este ingrediente ya lo has elegido");
				}
				break;
			case 4:
				if (flameado [3]==null) {
					opcion4 = menu4 ();
					respuesta1 = Integer.parseInt(teclado.readLine());
					if (respuesta1==1) {
						flameado [3]= "2 cucharadas de zumo de piña";
					} else if (respuesta1==2) {
						flameado [3]= "2 cucharadas de zumo de naranja";
					} else {
						flameado [3]= "2 cucharadas de zumo de manzana";
					}
					contador++;
				}else {
					System.out.println("Este ingrediente ya lo has elegido");
				}
				break;
			case 5:
				if (flameado [4]==null) {
					opcion5 = menu5 ();
					respuesta1 = Integer.parseInt(teclado.readLine());
					if (respuesta1==1) {
						flameado [4]= "2 cucharadas de pacharán";
					} else if (respuesta1==2) {
						flameado [4]= "2 cucharadas de vodka";
					} else {
						flameado [4]= "2 cucharadas de whiskey";
					}
					contador++;
				}else {
					System.out.println("Este ingrediente ya lo has elegido");
				}
				break;
			case 6:
				if (flameado [5]==null) {
					opcion6 = menu6 ();
					respuesta1 = Integer.parseInt(teclado.readLine());
					if (respuesta1==1) {
						flameado [5]= "2 cucharadas de jarabe de hierbabuena";
					} else if (respuesta1==2) {
						flameado [5]= "2 cucharadas de jarabe de regaliz";
					} else {
						flameado [5]= "2 cucharadas de jarabe para la tos";
					}
					contador++;
				}else {
					System.out.println("Este ingrediente ya lo has elegido");
				}
				break;

			}
			System.out.println(contador);

		} while (opcionGeneral!=7 || contador!=6);

		System.out.println("Tu flameado lleva ");

		for (int i = 0; i < flameado.length; i++) {
			System.out.println(i+1+ ")" + flameado[i]);
		}

		if (Arrays.equals(flameado, flameadoMoe)) {
			System.out.println("El flameado de Homer. Te lo cambio por una rosquilla.");
		} else {
			System.out.println("Ese no es el flameado correcto");
			//Método acaparar
		}



	}

	public static int menu () throws NumberFormatException, IOException {

		System.out.println("Nadie se le escapa a Moe. No ha nacido quién. ¿Me ayudas a preparar mi flame...digo tu flameado? \n\t"+
				"\n\t 1) Primer Ingrediente"+
				"\n\t 2) Segundo Ingrediente"+
				"\n\t 3) Tercer Ingrediente"+
				"\n\t 4) Cuarto Ingrediente"+
				"\n\t 5) Quinto Ingrediente"+
				"\n\t 6) Sexto Ingrediente"+
				"\n\t 7) Salir");

		return Integer.parseInt(teclado.readLine());
	}

	public static int menu1 () throws NumberFormatException, IOException {

		System.out.println("Primer ingrediente \n\t"+
				"\n\t 1) 2 cucharadas de brandy"+
				"\n\t 2) 2 cucharadas de ron blanco"+
				"\n\t 3) 2 cucharadas de ginebra");


		return Integer.parseInt(teclado.readLine());
	}
	public static int menu2 () throws NumberFormatException, IOException {

		System.out.println("Segundo ingrediente \n\t"+
				"\n\t 1) 1 cucharada de licor de moras"+
				"\n\t 2) 1 cucharada de orujo de hierbas"+
				"\n\t 3) 2 cucharadas de granadina");


		return Integer.parseInt(teclado.readLine());
	}
	public static int menu3 () throws NumberFormatException, IOException {

		System.out.println("Tercer ingrediente \n\t"+
				"\n\t 1) 2 cucharadas de crema de mentas"+
				"\n\t 2) 2 cucharadas de Baileys"+
				"\n\t 3) 2 cucharadas de crema de Orujo");


		return Integer.parseInt(teclado.readLine());
	}
	public static int menu4 () throws NumberFormatException, IOException {

		System.out.println("Cuarto ingrediente \n\t"+
				"\n\t 1) 2 cucharadas de zumo de piña"+
				"\n\t 2) 2 cucharadas de zumo de naranja"+
				"\n\t 3) 2 cucharadas de zumo de manzana");


		return Integer.parseInt(teclado.readLine());
	}
	public static int menu5 () throws NumberFormatException, IOException {

		System.out.println("Quinto ingrediente \n\t"+
				"\n\t 1) 2 cucharadas de pacharán"+
				"\n\t 2) 2 cucharadas de vodka"+
				"\n\t 3) 2 cucharadas de whiskey");


		return Integer.parseInt(teclado.readLine());
	}
	public static int menu6 () throws NumberFormatException, IOException {

		System.out.println("Sexto ingrediente \n\t"+
				"\n\t 1) 2 cucharadas de jarabe de hierbabuena"+
				"\n\t 2) 2 cucharadas de jarabe de regaliz"+
				"\n\t 3) 2 cucharadas de jarabe para la tos");


		return Integer.parseInt(teclado.readLine());
	}


}
