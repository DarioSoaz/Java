package herencia;

public class Gerente extends ClsEmpleados {

	private String departamento;
	private int Dietas;
	
	
	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public int getDietas() {
		return Dietas;
	}


	public void setDietas(int dietas) {
		Dietas = dietas;
	}


	public Gerente(String nombre, String dni, double sueldo, String departamento, int dietas) {
		super(nombre, dni, sueldo);
		this.departamento = departamento;
		Dietas = dietas;
	}
	
	public double sueldoNeto() {
		double sueldo= super.sueldoNeto() + Dietas ;
		return sueldo;
	}
	
}
