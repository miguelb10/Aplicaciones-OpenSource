package pe.edu.upc.entity;

public class Fruta {
	//Atributos de instancia
	private String nombre;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	private String color;
	private String sabor;
	
	//Atributos de clase
	public static String LugarOrigen="UPC";	

	public Fruta(String nombre, String color, String sabor) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.sabor = sabor;
	}

	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", color=" + color + ", sabor=" + sabor + "]";
	}
	

}
