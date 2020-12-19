package cl.awakelab.remates.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cl.awakelab.remates.model.IProducto;
import cl.awakelab.remates.model.Postura;
import cl.awakelab.remates.model.Remate;
import cl.awakelab.remates.model.Tecnologico;
import cl.awakelab.remates.model.Usuario;
import cl.awakelab.remates.model.Vehiculo;

public class Controlador {

	private List<Remate> listadoRemate = new ArrayList<Remate>();
	private List<IProducto> listadoProductos = new ArrayList<IProducto>();
	
	
	public Controlador() throws ParseException {
		creaRemates();
	}
	
	public void mostrarProductos() {
		System.out.println("----------------------------");
		for (IProducto p : listadoProductos ) {
			System.out.println(p.getNombre() + " $" + p.getPrecioPromedio() + " - " + p.getCalificaciones());
		}
	}
	
	
	public void mostrarRemates() {
		
		
		for (Remate remate : listadoRemate) {
			System.out.println("----------------------------");
			System.out.println(remate.getNombreDelRemate());
			System.out.println("Postur Mínima: " + remate.getPrecioBase());
			System.out.println("Mejor postura: " + remate.getMejorPostura().getUsuario().getNombre() + " - " + 
					remate.getMejorPostura().getValorPostura()); 
			
		}
		
	}
	
	private void creaRemates() throws ParseException {
		
		// variables para el manejo de fechas.
		Date hoy = new SimpleDateFormat("dd/MM/yyyy").parse("19/12/2020");
		Date ahora = new SimpleDateFormat("hh:mm").parse("16:00");
		
		//Creo los productos que estarán en remate.
		IProducto p1 = new Tecnologico(1, "Refrigerador Inteligente", 5, 5000f);
		IProducto p2 = new Vehiculo(2, "Citroneta de oro", 6, 450000f);
		IProducto p3 = new Vehiculo(3, "Mini enchapado en diamantes", 7, 645000f);
		
		//agrego los productos al listado, para poder mostrarlos.
		listadoProductos.add(p1);
		listadoProductos.add(p2);
		listadoProductos.add(p3);
		
		
		//Creo los 3 remates que estarán disponibles.
		Remate r1 = new Remate("Remate de Refrigerador Inteligente", hoy, ahora, p1, 3000f);
		Remate r2 = new Remate("Remate de Citroneta enchapada en oro de 10 kilates", hoy, ahora, p2, 350000f);
		Remate r3 = new Remate("Remate de Mini enchapada en diamantes de sangre", hoy, ahora, p3, 523000f);
		
		//creo los usuarios que harán posturas.
		Usuario u1 = new Usuario(1, "Andronico Luksic", "Chile", 4000f);
		Usuario u2 = new Usuario(2, "Sebastian Piñera", "Chile", 3000f);
		Usuario u3 = new Usuario(3, "Brian Guzmán", "Chile", 2500f);
		
		//Creo las posturas que hicieron los usuarios a los remates.
		Postura post1 = new Postura(u1, r1, 3001f);
		Postura post2 = new Postura(u2, r1, 3002f);
		Postura post3 = new Postura(u3, r1, 3010f);

		Postura post5 = new Postura(u2, r2, 350009f);
		Postura post4 = new Postura(u1, r2, 350010f);
		Postura post6 = new Postura(u3, r2, 350001f);
		Postura post10 = new Postura(u2, r2, 350015f);
		
		Postura post9 = new Postura(u3, r3, 523010f);
		Postura post7 = new Postura(u1, r3, 523012f);
		Postura post8 = new Postura(u2, r3, 523007f);
		
		
		//vinculo los remates a las posturas, creando una lista de posturas para cada remate.
		List<Postura> l1 = new ArrayList<Postura>();
		
		l1.add(post1);
		l1.add(post2);
		l1.add(post3);
		
		r1.setPosturas(l1);
		
		List<Postura> l2 = new ArrayList<Postura>();
		
		l2.add(post4);
		l2.add(post5);
		l2.add(post6);
		l2.add(post10);
		
		r2.setPosturas(l2);
		
		List<Postura> l3 = new ArrayList<Postura>();
		
		l3.add(post9);
		l3.add(post8);
		l3.add(post7);
		
		r3.setPosturas(l3);
		
		//agrego a el listado de remates, los remates.
		listadoRemate.add(r1);
		listadoRemate.add(r2);
		listadoRemate.add(r3);
		
		
	}
	
}
