package capaLogica;

public class Cabania extends Lugar {
	private String identificador;

	public Cabania(int montoDiario, boolean estaOcupado, boolean tipo, String identificador) {
		super(montoDiario, estaOcupado, tipo);
		this.identificador = identificador;
		// TODO Auto-generated constructor stub
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

}
