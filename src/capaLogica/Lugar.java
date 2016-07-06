package capaLogica;

public class Lugar {
	
	private int montoDiario;
	private boolean estaOcupado;
	private boolean tipo; //si true cabania si false parcela
	
	/**
	 * @param montoDiario
	 * @param estaOcupado
	 * @param tipo
	 */
	public Lugar(int montoDiario, boolean estaOcupado, boolean tipo) {
		super();
		this.montoDiario = montoDiario;
		this.estaOcupado = estaOcupado;
		this.tipo = tipo;
	}
	public int getMontoDiario() {
		return montoDiario;
	}
	public void setMontoDiario(int montoDiario) {
		this.montoDiario = montoDiario;
	}
	public boolean isEstaOcupado() {
		return estaOcupado;
	}
	public void setEstaOcupado(boolean estaOcupado) {
		this.estaOcupado = estaOcupado;
	}
	public boolean isTipo() {
		return tipo;
	}
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	
}