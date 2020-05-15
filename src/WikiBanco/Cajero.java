package WikiBanco;

import java.util.HashMap;
import java.util.Map;
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
/**
 * Metodo creado para calcular el importe de cada cajero 
 * @return int Importe total del cajero en pesos
 * @throws Exception si la cantidad de billete es cero, corre excepcion
 */
	public int calcularImporte() throws Exception {
		int importe = 0;

		for (Map.Entry<Billete, Integer> mapCant : mapCantidad.entrySet()) {
			Billete bi = mapCant.getKey();
			if (mapCant.getValue() > 0) {
							importe += bi.getValor() * mapCant.getValue();
			} else {
				throw new Exception( this.nombre + " -> No hay " + bi.getNombre());
			}

		}

		return importe;
	}

	public void AgregarBillete(Billete b) {
		this.listaBillete.add(b);

	}

	public String toString() {
		String msj = "";
		try {
			int i = calcularImporte();
			msj = this.nombre + ": $" + i;

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		return msj;
	}
}
