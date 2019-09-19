package Interface;

public class Administracion extends ClsEmpleados implements Interface {

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
	public void Saludo() {
		System.out.println("Se ha producido un error en la factura, Saludos desde la Administración");
		
	}
}
