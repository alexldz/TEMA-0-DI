package Ejercicio1;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Factura> listaCompra = new ArrayList<Factura>();

		Factura F = new Factura();

		F.setDescripcion("Leche");
		F.setImporte(0.75);
		listaCompra.add(F);
		F = new Factura();

		F.setDescripcion("Pam");
		F.setImporte(0.50);
		listaCompra.add(F);
		F = new Factura();

		F.setDescripcion("Salmón");
		F.setImporte(8.99);
		listaCompra.add(F);
		F = new Factura();

		F.setDescripcion("Aguacates");
		F.setImporte(2.95);
		listaCompra.add(F);
		F = new Factura();

		F.setDescripcion("Friegasuelos");
		F.setImporte(1.20);
		listaCompra.add(F);
		F = new Factura();

		F.setDescripcion("Cerveza");
		F.setImporte(0.56);
		listaCompra.add(F);
		F = new Factura();

		F.setDescripcion("Sandia");
		F.setImporte(1.45);
		listaCompra.add(F);
		F = new Factura();

		for (int i = 0; i < listaCompra.size(); i++) {

			System.out.println(listaCompra.get(i));

		}

	}

}
