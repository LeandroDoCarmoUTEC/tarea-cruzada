package WikiBanco;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Map;

public class Banco {
	private String nombre;
	private String direccion;
	private LinkedList<Cajero> listaCajero = new LinkedList<Cajero>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public LinkedList<Cajero> getlistaCajero() {
		return listaCajero;
	}

	public void setListaCajero(LinkedList<Cajero> listaCajero) {
		this.listaCajero = listaCajero;
	}

	// M�todos

	public void agregarCajero(Cajero c) {
		this.listaCajero.add(c);
	}

	public void recorrerCajeros() {
		Cajero cajeromenos = null;
		Cajero cajeromas = null;

		for (Cajero c : listaCajero) {
			try {
				if (cajeromenos == null || cajeromenos.calcularImporte() > c.calcularImporte()) {
					cajeromenos = c;

				}
				if (cajeromas == null || cajeromas.calcularImporte() < c.calcularImporte()) {
					cajeromas = c;
				}
			} catch (Exception e) {

			}

			System.out.println(c.toString());
		}
		System.out.println("El cajero con menos dinero es: " + cajeromenos.getNombre());
		System.out.println("El cajero con m�s dinero es: " + cajeromas.getNombre());
	}

	
	/**
	 * Devuelve datos sobre el primer cajero de la lista
	 * @throws Exception Si no hay cajero lanza una excepci�n
	 */
	public void devolverPrimerCajero() throws Exception {
		if (this.listaCajero.size() > 0) {
			System.out.println("El primer cajero de la lista es: " + this.listaCajero.get(0).getNombre());
		} else {
			throw new Exception("ERROR: No hay cajero en la lista");
		}
	}
	
	/**
	 * Devuelve datos sobre el �ltimo cajero de la lista
	 * @throws Exception Si no hay cajero lanza una excepci�n
	 */
	public void devolverUltimoCajero() throws Exception {
		if (this.listaCajero.size() > 0) {
			System.out.println("El �ltimo cajero de la lista es: " + this.listaCajero.getLast().getNombre());			
		} else {
			throw new Exception("ERROR: No hay cajero en la lista");
		}
	}
	
	

}
