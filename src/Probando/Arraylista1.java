package Probando;

import java.util.ArrayList;

public class Arraylista1 {

	public static void main(String[] args) {
		ArrayList<String> miColeccion = new ArrayList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		for (String elto : miColeccion) {
		//String elto = miColeccion.get(i);
		System.out.println(elto);
		}
	}
}
