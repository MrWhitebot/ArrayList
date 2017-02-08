package Probando5;
import java.util.ArrayList;
import java.util.Iterator;
public class Collection {

	public static void main(String[] args) {
	
		ArrayList<String> miColeccion = new ArrayList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		String elto;
		Iterator<String> paseador = miColeccion.iterator();
		while (paseador.hasNext()){
		elto = paseador.next();
		if(elto.substring(0).startsWith("S")){
			paseador.remove();
		}
		
		}
		paseador=miColeccion.iterator();
		while(paseador.hasNext()){
			System.out.println(paseador.next());
		}
		}
		

}
