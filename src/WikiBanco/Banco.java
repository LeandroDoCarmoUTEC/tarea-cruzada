package WikiBanco;

import java.util.LinkedList;

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

	// Métodos
	
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
		System.out.println("El cajero con más dinero es: " + cajeromas.getNombre());
	}

}
