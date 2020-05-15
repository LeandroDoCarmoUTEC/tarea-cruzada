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
	
	
	//Métodos	
	public void agregarCajero(Cajero c) {
		this.listaCajero.add(c);
	}
	
}
