package herencia;

 class ClsEmpleados {
	private String nombre;
	private String dni;
	private double sueldo;
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	public ClsEmpleados(String nombre, String dni, double sueldo) {
		this.nombre = nombre;
		this.dni = dni;
		this.sueldo = sueldo;
	}
	
	public double sueldoNeto() {
		double sueldoNet;
		sueldoNet=sueldo*getIRPF();
		return sueldoNet;
	}
	
 private double getIRPF() {
		double Irpf;
		if( sueldo<3000) {
			Irpf= 0.85; 
			return Irpf;     }
		else {Irpf=0.75;
		return Irpf;}
	}
}
