package examenentornos;
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		
		
		
		
		int opcion;
			System.out.println("Menu de opciones:");
			System.out.println("1.Área triángulo");
			System.out.println("2.Área círculo");
			System.out.println("3.Área del cono:");
			System.out.println("4.Área del cilindro:");
			System.out.println("5.Salir");
			System.out.println("Seleccione una opción:");
			opcion=sc.nextInt();
			
		switch (opcion) {
		case 1:
			System.out.print("Ingrese la base del triángulo: ");
			 double baseTriangulo = sc.nextDouble();
			 System.out.print("Ingrese la altura del triángulo: ");
			 double alturaTriangulo = sc.nextDouble();
			 double total=0.5*baseTriangulo*alturaTriangulo;
			 break;
			 case 2:
			 System.out.print("Ingrese el radio del círculo: ");
			 double radioCirculo = sc.nextDouble();
			 double total=Math.PI*Math.pow(radioCirculo,2);
			 break;
			 case 3:
			 System.out.print("Ingrese el radio de la base del cono: ");
			 double radioCono = sc.nextDouble();
			 System.out.print("Ingrese la altura del cono: ");
			 double alturaCono = sc.nextDouble();
			 double total=Math.PI*radioCono*(radioCono+Math.sqrt(Math.pow(alturaCono,2)+Math.pow(radioCono,2)));
			 break;
			case 4:
			System.out.print("Ingresa el radio del cilindro:");
			double radioCilindro = sc.nextDouble();
			System.out.print("Ingresa la altura del cilindro:");
			double alturaCilindro = sc.nextDouble();
			double total=2*Math.PI*radioCilindro*(radioCilindro + alturaCilindro);
			case 5:
			System.out.println("Adios, muy buenas");
			 default:
				 System.out.println("Opción no válida. Inténtelo de nuevo.");
		}
		
	}

}
