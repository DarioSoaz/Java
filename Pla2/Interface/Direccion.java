package Interface;

public class Direccion extends ClsEmpleados implements Interface {

	private int StockOptions;

	public int getStockOptions() {
		return StockOptions;
	}

	public void setStockOptions(int stockOptions) {
		StockOptions = stockOptions;
	}

	public Direccion(String nombre, String dni, double sueldo, int stockOptions) {
		super(nombre, dni, sueldo);
		StockOptions = stockOptions;
	}
	
	public double sueldoNeto() {
		double sueldo= super.sueldoNeto() + (StockOptions*0.1) ;
		return sueldo;
	}
	public void Saludo() {
		System.out.println("Director general al habla");
		
	}
}
