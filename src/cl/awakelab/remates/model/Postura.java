package cl.awakelab.remates.model;

public class Postura {

	private Usuario usuario;
	private Remate remate;
	private float valorPostura;
	
	public Postura() {
		
	}
	
	public Postura(Usuario usuario, Remate remate, float valorPostura) {
		super();
		this.usuario = usuario;
		this.remate = remate;
		this.valorPostura = valorPostura;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Remate getRemate() {
		return remate;
	}
	public void setRemate(Remate remate) {
		this.remate = remate;
	}
	public float getValorPostura() {
		return valorPostura;
	}
	public void setValorPostura(float valorPostura) {
		this.valorPostura = valorPostura;
	}

	
	
	
}
