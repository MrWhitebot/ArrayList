package Probando4;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylista5 {
	public static void main(String[] args) {
		ArrayList<String> miColeccion = new ArrayList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce un elemento: ");
		String entrada = sc.nextLine();
		boolean x = false;
		
		// Da valor a la variable "esta" para saber si el elemento introducido
		// está o no dentro de la lista
		//Mensaje final
		x = miColeccion.contains(entrada);
		System.out.println(x?"Está":"No está");
		}
		}
