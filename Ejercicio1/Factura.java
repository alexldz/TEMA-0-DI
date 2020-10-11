package Ejercicio1;

public class Factura {

	private double Importe;
	private String descripcion;

	@Override

	public String toString() {
		return "Producto " + descripcion + ",\t PVP: " + Importe;
	}

	public void setImporte(double importe) {
		this.Importe = importe;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getImporte() {
		return Importe;
	}

	public String getDescripcion() {
		return descripcion;
	}

}