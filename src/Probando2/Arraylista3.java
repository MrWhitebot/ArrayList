package Probando2;

import java.util.ArrayList;

public class Arraylista3 {
	public static void main(String[] args) {
		ArrayList<String> miColeccion = new ArrayList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		String aux= miColeccion.get(2);
		miColeccion.set(2, miColeccion.get(1));
		miColeccion.set(1, aux);
		for (String elto : miColeccion) {
		System.out.println(elto);
		}
		}

}
