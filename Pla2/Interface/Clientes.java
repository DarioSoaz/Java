package Interface;

public class Clientes implements Interface{

	private String nombre;
	private String email;
	private String tipo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Clientes(String nombre, String email, String tipo) {
		this.nombre = nombre;
		this.email = email;
		this.tipo = tipo;
	}
	
	public void Saludo() {
		System.out.println("SALUDOS, soy un Cliente");
		
	}
	
	
}
