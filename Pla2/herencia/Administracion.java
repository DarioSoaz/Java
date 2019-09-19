package herencia;

public class Administracion extends ClsEmpleados {

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	private String seccion;

	public Administracion(String nombre, String dni, double sueldo, String seccion) {
		super(nombre, dni, sueldo);
		this.seccion = seccion;
	}
	
}
