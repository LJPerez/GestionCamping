package capaLogica;

import java.util.Calendar;

public class Estadia {
	
	private Calendar fechaIngreso = Calendar.getInstance();
	private Calendar fechaSalida = Calendar.getInstance();
	private int cantidad;
	private int monto;
	private int parcelaCabania;
	private Persona titular;
	private int nroCabaniaParcela;
	
	/**
	 * @author Agustin
	 * @param fechaIngreso
	 * @param fechaSalida
	 * @param cantidad
	 * @param monto
	 * @param parcelaCabania
	 * @param titular
	 */
	public Estadia(Calendar fechaIngreso, Calendar fechaSalida, int cantidad, int monto, int parcelaCabania, Persona titular) {
		super();
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.cantidad = cantidad;
		this.monto = monto;
		this.parcelaCabania=parcelaCabania;
		this.titular = titular;
	}

	/**
	 * @param fechaIngreso
	 * @param fechaSalida
	 * @param cantidad
	 * @param titular
	 * @param nroCabaniaParcela
	 */
	public Estadia(Calendar fechaIngreso, Calendar fechaSalida, int cantidad, Persona titular, int nroCabaniaParcela) {
		super();
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.cantidad = cantidad;
		this.titular = titular;
		this.nroCabaniaParcela = nroCabaniaParcela;
	}

	
	public Calendar getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Calendar fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Calendar getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Calendar fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public int getParcelaCabania() {
		return parcelaCabania;
	}

	public void setParcelaCabania(int parcelaCabania) {
		this.parcelaCabania = parcelaCabania;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	
	
	
	
}
