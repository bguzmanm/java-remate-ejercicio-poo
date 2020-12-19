package cl.awakelab.remates.model;

import java.util.List;

public class Vehiculo implements IProducto {

	private int id;
	private String nombre;
	
	private float calificacion;
	private List<String> comentarios;
	private float precioPromedio;
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(int id, String nombre, float calificacion, float precioPromedio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.calificacion = calificacion;
		this.comentarios = comentarios;
		this.precioPromedio = precioPromedio;
	}

	@Override
	public float getCalificaciones() {
		// TODO Auto-generated method stub
		return calificacion;
	}

	@Override
	public List<String> getComentarios() {
		// TODO Auto-generated method stub
		return comentarios;
	}

	@Override
	public float getPrecioPromedio() {
		// TODO Auto-generated method stub
		return precioPromedio;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	

}
