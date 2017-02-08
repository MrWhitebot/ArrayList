package Probando3;

import java.util.ArrayList;

public class Arraylista4 {
	public static void main(String[] args) {
		ArrayList<String> miColeccion = new ArrayList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");

        //String aux = miColeccion.get(0);  
        //miColeccion.add(aux);                    
        //miColeccion.remove(0);  
        String aux = miColeccion.get(miColeccion.size()-1);  
        miColeccion.add(0,aux);                    
        miColeccion.remove(miColeccion.size()-1); 
		for (String elto : miColeccion) {
			System.out.println(elto);
		}
	}
}
