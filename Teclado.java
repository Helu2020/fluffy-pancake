package modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado {
	public static int pideEntero(String mensaje){
		int entero=0;
		String texto="";
		boolean error=false;
		
		do {
			System.out.println(mensaje);
			error=false;
			BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
			try {
				texto=teclado.readLine();
				entero=Integer.parseInt(texto);
				teclado.close();
			} catch (NumberFormatException e) {
				System.out.println("No has introducido un número entero");
				error=true;
			} catch (IOException e) {
				System.out.println("Error");
				error=true;
			}
		} while(!error);
		return entero;

	}

	public static int pideEnteroPositivo(String mensaje){
		int numero=0;
		String texto="";
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		try {
			while(numero<=0){
				System.out.println("Introduce un número entero positivo, mayor que cero");
				texto=teclado.readLine();
				numero=Integer.parseUnsignedInt(texto);
			}
		} catch (NumberFormatException e) {
			System.out.println("No has introducido un entero");
		} catch (IOException e) {
			System.out.println("Error");
		}
		return numero;
	}

	public static double pideDouble(String mensaje){
		double decimal=0;
		String texto="";
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		try {
			texto=teclado.readLine();
			decimal=Double.parseDouble(texto);
		} catch (NumberFormatException e) {
			System.out.println("No has introducido un número");
		} catch (IOException e) {
			System.out.println("Error");
		}
		return decimal;
	}

	public static float pideFloat(String mensaje){
		float numeroFloat=0;
		String texto="";
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		try {
			texto=teclado.readLine();
			numeroFloat=Float.parseFloat(texto);
		} catch (NumberFormatException e) {
			System.out.println("No has introducido un número entero");
		} catch (IOException e) {
			System.out.println("Error");
		}
		return numeroFloat;
	}

	public static String pideString(String mensaje){
		String texto="";
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(mensaje);
		try {
			texto=teclado.readLine();
		} catch (IOException e) {
			System.out.println("Error");
		}
		return texto;
	}
}