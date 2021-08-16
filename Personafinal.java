import java.util.Scanner;

public class Personafinal{
	
	Scanner sc = new Scanner(System.in);
	
	private String nombre = "";
	private int numeroTel = 0;
	private String direccion = "";
	
	public void resumen(){
		System.out.println("Escribe tu nombre: ");
		nombre = sc.nextLine();
	
		System.out.println("Escribe tu número de teléfono: ");
		numeroTel = sc.nextInt();

		
	
		System.out.println(nombre + " está buscando a su perro, si lo ven porfavor llamar al número: " + numeroTel);
	
	}
	
}