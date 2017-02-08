package Probando1;

import java.util.ArrayList;

public class Arraylista2 {
	public static void main(String[] args) {
		ArrayList<String> miColeccion = new ArrayList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		String ultimoElto=null;
		ultimoElto=miColeccion.get(miColeccion.size()-1);
		//String elto = miColeccion.get(i);^^
		System.out.println("El último elemento es: "+ ultimoElto);
		
	}
}
