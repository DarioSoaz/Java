package Interface;

	import java.util.Scanner;

	public class program {

		public static void main(String[] args) {
			
			 
			 
			 ClsEmpleados empleado = new ClsEmpleados("bnfbv","43256",2000);
			 
			 empleado.Saludo();
			 
			 Gerente jefecillo= new Gerente("dario","44555444h",2000,"Ventas",100);
			 
			 jefecillo.Saludo();
			 
			 Direccion director= new Direccion("Antonio","4436632667f",2000,3000);
			 
			 director.Saludo();
			 
			 Clientes cliente= new Clientes("jose","jose@gga.com","fijo");
			 cliente.Saludo();
			 
			 Administracion adminis= new Administracion("Maria","556654433f",1000,"Cuentas");
			 adminis.Saludo();
			 
		}
		
	}

