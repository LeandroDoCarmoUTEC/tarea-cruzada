package WikiBanco;

import java.util.HashMap;
import java.util.LinkedList;

public class Cajero {
	private String nombre;
	private LinkedList<Billete> listaBillete = new LinkedList<Billete>();
	HashMap<Billete, Integer> mapCantidad = new HashMap<Billete, Integer>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LinkedList<Billete> getListaBillete() {
		return listaBillete;
	}

	public void setListaBillete(LinkedList<Billete> listaBillete) {
		this.listaBillete = listaBillete;
	}

	public HashMap<Billete, Integer> getMapCantidad() {
		return mapCantidad;
	}

	public void setMapCantidad(HashMap<Billete, Integer> mapCantidad) {
		this.mapCantidad = mapCantidad;
	}

	// Métodos

	public int calcularImporte() throws Exception {
		int cantidad = 0;
int monto = 0;
		for (int i : mapCantidad.values()) {
			monto = mapCantidad.
			cantidad += i;
		}

		return cantidad;
	}

	public void AgregarBillete(Billete b) {
		this.listaBillete.add(b);

	}

	public String toString() {return this.nombre + "; " + calcularImporte();}
}
