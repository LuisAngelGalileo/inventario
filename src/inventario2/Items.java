package inventario2;

import java.util.Scanner;

public class Items {
	private String nombre;
	private String descripcion;
	private int defensa;
	private int ataque;
public Items() {
	
}	
public Items (String nombre, String descripcion, int defensa, int ataque) {
	this.nombre= nombre;
	this.descripcion = descripcion;
	this.defensa = defensa;
	this.ataque = ataque;
	}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public int getDefensa() {
	return defensa;
}

public void setDefensa(int defensa) {
	this.defensa = defensa;
}

public int getAtaque() {
	return ataque;
}

public void setAtaque(int ataque) {
	this.ataque = ataque;
}

public void carlos() {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Introduzca el nombre: ");
	String a = entrada.nextLine();
	setNombre(a);
	System.out.println(getNombre());
}

}