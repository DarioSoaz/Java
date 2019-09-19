package paquete;

public class ClsEmpleados {

	 String nombre;
	 String dni;
	 float sueldo;
	
	public ClsEmpleados(String nombre, String dni, float sueldo) {
		this.nombre = nombre;
		this.dni = dni;
		this.sueldo = sueldo;
	}
	
	public void sueldoNeto() {
		double sueldoNet;
		sueldoNet=sueldo*0.85;
		System.out.println("el Sueldo neto de "+nombre+ " es de "+sueldoNet);
	}
	
	public ClsEmpleados(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	
	
	
}
