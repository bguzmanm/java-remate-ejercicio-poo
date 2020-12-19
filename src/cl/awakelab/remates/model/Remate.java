package cl.awakelab.remates.model;

import java.util.Date;
import java.util.List;

public class Remate {

	private String nombreDelRemate;
	private Date fecha;
	private Date hora;
	
	private IProducto producto;
	private float precioBase;
	
	private List<Postura> posturas;
	
	/***
	 * Retorna la mejor postura al momento de ejecutarla.
	 * @return la mejor postura.
	 */
	public Postura getMejorPostura(){
		
		float mejorValor = 0;
		Postura mejorPostura = new Postura();
		
		for (Postura postura : posturas) {
			if (postura.getValorPostura() > mejorValor) {
				mejorPostura = postura;
				mejorValor = mejorPostura.getValorPostura();
			}
		}
		
		return mejorPostura;
	}
	
	public Remate() {
		
	}
	
	public Remate(String nombreDelRemate, Date fecha, Date hora, IProducto producto, float precioBase) {
		super();
		this.nombreDelRemate = nombreDelRemate;
		this.fecha = fecha;
		this.hora = hora;
		this.producto = producto;
		this.precioBase = precioBase;
	}
	
	public String getNombreDelRemate() {
		return nombreDelRemate;
	}
	public void setNombreDelRemate(String nombreDelRemate) {
		this.nombreDelRemate = nombreDelRemate;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	public IProducto getProducto() {
		return producto;
	}
	public void setProducto(IProducto producto) {
		this.producto = producto;
	}
	public float getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	public List<Postura> getPosturas() {
		return posturas;
	}

	public void setPosturas(List<Postura> posturas) {
		this.posturas = posturas;
	}
	
	
}
