package capaLogica;

public class Persona {

	private String nombre;
	private String documento;
	private int telefono;
	private boolean esUruguayo;
	private long tarjeta;
	
	public Persona(String nombre, String documento, int telefono, boolean esUruguayo, long tarjeta) {
		
		this.nombre = nombre;
		this.documento = documento;
		this.telefono = telefono;
		this.esUruguayo = esUruguayo;
		this.tarjeta = tarjeta;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public boolean isEsUruguayo() {
		return esUruguayo;
	}
	public void setEsUruguayo(boolean esUruguayo) {
		this.esUruguayo = esUruguayo;
	}
	public long getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(long tarjeta) {
		this.tarjeta = tarjeta;
	}
	
	
}
