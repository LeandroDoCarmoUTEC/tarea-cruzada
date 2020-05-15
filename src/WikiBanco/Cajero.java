package WikiBanco;
import java.util.HashMap;
import java.util.LinkedList;

public class Cajero {
	private String nombre;
	private LinkedList<Billete> ListaBillete = new LinkedList<Billete>();
	//private LinkedList<Integer> ListaCantidad = new LinkedList<Integer>();
	HashMap<Billete,Integer> MapCantidad = new HashMap<Billete,Integer>();
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LinkedList<Billete> getListaBillete() {
		return ListaBillete;
	}
	public void setListaBillete(LinkedList<Billete> listaBillete) {
		ListaBillete = listaBillete;
	}
	public HashMap<Billete, Integer> getMapCantidad() {
		return MapCantidad;
	}
	public void setMapCantidad(HashMap<Billete, Integer> mapCantidad) {
		MapCantidad = mapCantidad;
	}

	//Métodos
	
	/*public int CalcularImporte() throws Exception {		
		int cantidad = 0;
		
		for (int i = 0; i < MapCantidad.size(); i++) {
			if (MapCantidad.get(i) > 0) {
				cantidad += MapCantidad.get(i);	
			}else {
				throw new Exception("KKKK");
			}
		}
		
		MapCantidad.forEach((k,v) -> {
			if (v > 0) {
				System.out.println("Key: " + k + ": Value: " + v);
				cantidad = cantidad + v;
			}else {
				throw new Exception("KKKK");
			}
			
		});
		
		return cantidad;
	}*/
	
	
	public void AgregarBillete(Billete b) {
		this.ListaBillete.add(b);
	}
}
