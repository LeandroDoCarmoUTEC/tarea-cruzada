package WikiBanco;

import WikiBanco.Cajero;

public class Principal {

	public static void main(String[] args) {

		Banco Banco1 = new Banco();
		Banco1.setNombre("Republica");
		Banco1.setDireccion("Artigas y Chile");

		Cajero Cajero1 = new Cajero();
		Cajero1.setNombre("Cajero 1");
		Cajero Cajero2 = new Cajero();
		Cajero2.setNombre("Cajero 2");
		Cajero Cajero3 = new Cajero();
		Cajero3.setNombre("Cajero 3");
		Cajero Cajero4 = new Cajero();
		Cajero4.setNombre("Cajero 4");
		Cajero Cajero5 = new Cajero();
		Cajero5.setNombre("Cajero 5");
		Cajero Cajero6 = new Cajero();
		Cajero6.setNombre("Cajero 6");
		Cajero Cajero7 = new Cajero();
		Cajero7.setNombre("Cajero 7");
		Cajero Cajero8 = new Cajero();
		Cajero8.setNombre("Cajero 8");

		Billete Billete500 = new Billete();
		Billete500.setNombre("Billete de 500");
		Billete500.setValor(500);

		Billete Billete1000 = new Billete();
		Billete1000.setNombre("Billete de 1000");
		Billete1000.setValor(1000);

		Billete Billete2000 = new Billete();
		Billete2000.setNombre("Billete de 2000");
		Billete2000.setValor(2000);

		Banco1.agregarCajero(Cajero1);
		Banco1.agregarCajero(Cajero2);
		Banco1.agregarCajero(Cajero3);
		Banco1.agregarCajero(Cajero4);
		Banco1.agregarCajero(Cajero5);
		Banco1.agregarCajero(Cajero6);
		Banco1.agregarCajero(Cajero7);
		Banco1.agregarCajero(Cajero8);

		Cajero1.AgregarBillete(Billete500);
		Cajero1.AgregarBillete(Billete1000);
		Cajero1.AgregarBillete(Billete2000);

		Cajero1.mapCantidad.put(Billete500, 1000);
		Cajero1.mapCantidad.put(Billete1000, 500);
		Cajero1.mapCantidad.put(Billete2000, 100);

		Cajero2.AgregarBillete(Billete500);
		Cajero2.AgregarBillete(Billete1000);
		Cajero2.AgregarBillete(Billete2000);

		Cajero2.mapCantidad.put(Billete500, 10000);
		Cajero2.mapCantidad.put(Billete1000, 500);
		Cajero2.mapCantidad.put(Billete2000, 1000);

		Cajero3.AgregarBillete(Billete500);
		Cajero3.AgregarBillete(Billete1000);
		Cajero3.AgregarBillete(Billete2000);

		Cajero3.mapCantidad.put(Billete500, 10);
		Cajero3.mapCantidad.put(Billete1000, 500);
		Cajero3.mapCantidad.put(Billete2000, 2000);

		Cajero4.AgregarBillete(Billete500);
		Cajero4.AgregarBillete(Billete1000);
		Cajero4.AgregarBillete(Billete2000);

		Cajero4.mapCantidad.put(Billete500, 1);
		Cajero4.mapCantidad.put(Billete1000, 5000);
		Cajero4.mapCantidad.put(Billete2000, 20);

		Cajero5.AgregarBillete(Billete500);
		Cajero5.AgregarBillete(Billete1000);
		Cajero5.AgregarBillete(Billete2000);

		Cajero5.mapCantidad.put(Billete500, 1000);
		Cajero5.mapCantidad.put(Billete1000, 50);
		Cajero5.mapCantidad.put(Billete2000, 2000);

		Cajero6.AgregarBillete(Billete500);
		Cajero6.AgregarBillete(Billete1000);
		Cajero6.AgregarBillete(Billete2000);

		Cajero6.mapCantidad.put(Billete500, 10);
		Cajero6.mapCantidad.put(Billete1000, 50);
		Cajero6.mapCantidad.put(Billete2000, 2);

		Cajero7.AgregarBillete(Billete500);
		Cajero7.AgregarBillete(Billete1000);
		Cajero7.AgregarBillete(Billete2000);

		Cajero7.mapCantidad.put(Billete500, 0);
		Cajero7.mapCantidad.put(Billete1000, 5);
		Cajero7.mapCantidad.put(Billete2000, 200);

		Cajero8.AgregarBillete(Billete500);
		Cajero8.AgregarBillete(Billete1000);
		Cajero8.AgregarBillete(Billete2000);

		Cajero8.mapCantidad.put(Billete500, 10);
		Cajero8.mapCantidad.put(Billete1000, 5000);
		Cajero8.mapCantidad.put(Billete2000, 200);

		try {
			Banco1.recorrerCajeros();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
