package Publicaciones;

public class Libro extends Publicacion {

	//Estanteria estanteria;
	private String nombre;
	private GeneroLiterario generoLiterario;
	private int nPaginas;
	private int nCapitulos;
	private int edicion;
	private Estado estado;

	public Libro(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}
}