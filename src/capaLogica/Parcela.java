package capaLogica;

public class Parcela extends Lugar {
	private int nroParcela;

	public Parcela(int montoDiario, boolean estaOcupado, boolean tipo, int nroParcela) {
		super(montoDiario, estaOcupado, tipo);
		this.nroParcela = nroParcela;
		// TODO Auto-generated constructor stub
	}

	public int getNroParcela() {
		return nroParcela;
	}

	public void setNroParcela(int nroParcela) {
		this.nroParcela = nroParcela;
	}

}
