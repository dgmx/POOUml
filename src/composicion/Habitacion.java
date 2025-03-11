package composicion;

import java.util.Objects;

public class Habitacion {

	private int numero;
	private String tipo;

	public Habitacion(int numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Habitacion [numero=" + numero + ", tipo=" + tipo + "]";
	}
}

