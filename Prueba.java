/*************************************************************************************************************
Prueba.java
Autor: Jeremy Mejía
Fecha de Creación: Agosto de 2021
Última Modificación: Agosto de 2021

Ejercicio No. 1 Simulador para encontrar perros
Driver program  
*************************************************************************************************************/


import java.util.Scanner;
import java.util.Random;
class Prueba{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\nBienvenido, vamos a encontar a tu perro \n" + 
		"Elige una opción \n" + 
		"1. Imprimir anuncio - Q 25.00 \n" +
		"2. Llamar a la perrera - ningun costo \n" +
		"3. Contratar un anuncio en el periódico - Q 125.00 \n" + 
		"4. Salir");
		int numero = 0; 
		int a = (int)(Math.random()*(20-1+1)+1);
		int gasto = (int)(Math.random()*(1000-1+1)+1);
		int anuncio = 25;
		int periodico = 125;
		int resultadoA = gasto - anuncio;
		int resultadoP = gasto - periodico;
		int SiNo = 0;
		for(int i = 1; i<=1; i++)
			System.out.println("\nDispones de Q " + gasto + ".00 para poder buscar a tu perro");
		
		
		System.out.println("Selecciona un número:"); 
		numero = scan.nextInt();
		
		if (numero == 1){
			Personafinal pe = new Personafinal();
			
			pe.resumen();
			
			Perrofinal per = new Perrofinal();
			
			per.resumen2();
			
			for(int i = 1; i<=1; i++)
			System.out.println("Número al azar: " + (int)(Math.random()*(20-1+1)+1));
		
			if (a <= 10){
				System.out.println("*Alguien llama de inmediato y dice: Hay un perrito perdido, puede ser el tuyo*\n ");
			}
			else if (a > 10){
				System.out.println("*Sigue colocando anuncios*\n");
			}
			System.out.println("\nDispones de Q " + resultadoA + ".00 para poder buscar a tu perro");
			
			if (resultadoA <= 0){
				System.out.println("*No tienes suficiente dinero*\n");
			}
		}
		else if (numero == 2){
			
			Personafinal pe = new Personafinal();
			
			pe.resumen();
			
			Perrofinal per = new Perrofinal();
			
			per.resumen2();
			
			System.out.println("Lamando...");
			for(int i = 1; i<=1; i++)
			System.out.println("Número al azar: " + (int)(Math.random()*(20-1+1)+1));
		
			if (a <= 5){
				System.out.println("*Hay un perro nuevo en la perrera, puede ser el tuyo*\n ");
			}
			else if (a > 5){
				System.out.println("*Lo siendo no han traído nuevos perros*\n ");
			}
			
		}
		else if (numero == 3){
			Personafinal pe = new Personafinal();
			
			pe.resumen();
			
			Perrofinal per = new Perrofinal();
			
			per.resumen2();
			
			System.out.println("*Cae una llamada*");
			for(int i = 1; i<=1; i++)
			System.out.println("Número al azar: " + (int)(Math.random()*(20-1+1)+1));
		
			if (a <= 15){
				System.out.println("*Tengo a tu perro*\n ");
			}
			else if (a > 15){
				System.out.println("*No hay señales de vida del perro*\n ");
			}
			System.out.println("\nDispones de Q " + resultadoP + ".00 para poder buscar a tu perro");
			if (resultadoP <= 0){
				System.out.println("*No tienes suficiente dinero*\n");
			}
		}
		else if (numero == 4){
			System.out.println("Un gusto atenderte");
		}
		else if (numero >= 5){
			System.out.println("Empeiza de nuevo, instrucción no válida," +
			"recuerda que debes de marcar un número del 1 al 4");
			
		}
	}
	
}
