import java.util.Scanner;

public class Perrofinal{
	
	Scanner s = new Scanner(System.in);
	
	private String nombrePerro = "";
	private String color = "";
	private String raza = "";
	private String caracteristica = "";
	
	public void resumen2(){
		System.out.println("Escribe el nombre del perro: ");
		nombrePerro = s.nextLine();
	
		System.out.println("Escribe el color del perro: ");
		color = s.nextLine();
	
		System.out.println("Escribe la raza del perro: ");
		raza = s.nextLine();
		
		System.out.println("Escribe un caracteristica del perro: ");
		caracteristica = s.nextLine();
		
		System.out.println("\nEl perro se llama " + nombrePerro + 
		" Es de color " + color + " Raza " + raza +" " + caracteristica);
	}
}