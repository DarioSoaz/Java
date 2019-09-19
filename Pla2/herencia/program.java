package herencia;

	import java.util.Scanner;

	public class program {

		public static void main(String[] args) {
			
			 
			 
			 ClsEmpleados empleado = new ClsEmpleados("bnfbv","43256",2000);
			 
			 System.out.println("el sueldo es :"+empleado.sueldoNeto());
			 
			 Gerente jefecillo= new Gerente("dario","44555444h",2000,"Ventas",100);
			 
			 System.out.println("el sueldo es :"+jefecillo.sueldoNeto());
			 
			 Direccion director= new Direccion("Antonio","4436632667f",2000,3000);
			 
			 System.out.println("el sueldo es :"+director.sueldoNeto());
		}
		
	}

