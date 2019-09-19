package clase3;

	import java.util.Scanner;

	public class program {

		public static void main(String[] args) {
			
			 String nombre;
			 String dni;
			 double sueldo;
			 
			 Scanner lle =new Scanner (System.in);
			 System.out.println("Introduce el nombre del empleado");
			 nombre=lle.nextLine();
			 System.out.println("Introduce su DNI");
			 dni=lle.nextLine();
			 System.out.println("Introduce su sueldo");
			 sueldo=lle.nextFloat();
			 
			 ClsEmpleados empleado = new ClsEmpleados(nombre,dni,sueldo);
			 
			 empleado.sueldoNeto();
		}
		
	}

