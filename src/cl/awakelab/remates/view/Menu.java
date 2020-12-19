package cl.awakelab.remates.view;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import cl.awakelab.remates.controller.Controlador;

public class Menu {

	
	public void orquestaMenu() throws ParseException {
		muestraMenuPpal();
		int op;
		
		Controlador control = new Controlador();
		
		
		do {
			System.out.println("Seleccione una opción del menú:");
			op = opcionDeMenu();
			
			switch (op) {
			case 1: {
				control.mostrarRemates();
				muestraMenuPpal();
				break;
			}
			case 2: {
				control.mostrarProductos();
				muestraMenuPpal();
				break;
			}
			case 3: {
				System.out.println("Tenemos tus datos, no nos acuses...");
				break;
			}
			default:
				System.out.println("Achuntale a la opción 1, 2 o 3");
			}
			
			
		} while (op != 3);
	}
	
	
	public void muestraMenuPpal() {
    
		System.out.println("------------------------------------");
		System.out.println("El mercadito turbio de Abdúl Mustafá");
		System.out.println("------------------------------------");
		System.out.println("1. Listar Remates");
		System.out.println("2. Listar Productos del Sistema");
		System.out.println("3. Salir. Ve con Alá");
		

	}
	
	public int opcionDeMenu() {
		
		Scanner entrada = new Scanner(System.in);
		int op = entrada.nextInt();
		return op;
	}
	
	public void limpiaPantalla() throws IOException {
		Runtime.getRuntime().exec("clear");
	}
	
}
