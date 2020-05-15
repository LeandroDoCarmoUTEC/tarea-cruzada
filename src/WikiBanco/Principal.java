package WikiBanco;
import WikiBanco.Cajero;
public class Principal {

	public static void main(String[] args) {
		
		Banco Banco1 = new Banco();
		Banco1.setNombre("Republica");
		Banco1.setDireccion("Artigas y Chile");
		
		
		Cajero Cajero1 = new Cajero();
		Cajero1.setNombre("Cajero 1");
		
	
		Billete Billete500 = new Billete();
		Billete500.setNombre("Billete de 500");
		Billete500.setValor(500);
		
		Billete Billete1000 = new Billete();
		Billete1000.setNombre("Juanita");
		Billete1000.setValor(1000);
		
		Billete Billete2000 = new Billete();
		Billete2000.setNombre("Billete de 2000");
		Billete2000.setValor(2000);
		
		
		Banco1.agregarCajero(Cajero1);
		
		Cajero1.AgregarBillete(Billete500);
		Cajero1.AgregarBillete(Billete1000);
		Cajero1.AgregarBillete(Billete2000);
		
		Cajero1.MapCantidad.put(Billete500, 10);
		Cajero1.MapCantidad.put(Billete1000, 10);
		Cajero1.MapCantidad.put(Billete2000, 10);
		
		try {
			System.out.println(Cajero1.CalcularImporte());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
