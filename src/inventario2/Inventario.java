package inventario2;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
	private int pesoMochila;
	private int pesoMax;
	private int espacioTotal;
	private int espacioOcupado;
	private ArrayList<Items> mochila = new ArrayList();
public Inventario (){
	 
}
Scanner espacio = new Scanner(System.in);
	public Inventario (int pesoMochila, int pesoMax, int espacioTotal, int espacioOcupado, ArrayList mochila) {
		this.pesoMochila=pesoMochila;
		this.pesoMax=pesoMax;
		this.espacioTotal=espacioTotal;
		this.espacioOcupado=espacioTotal;
		this.mochila=mochila;
	}

	public ArrayList<Items> getMochila() {
		return mochila;
	}

	public void setMochila(ArrayList<Items> mochila) {
		this.mochila = mochila;
	}

	public int getPesoMochila() {
		return pesoMochila;
	}

	public void setPesoMochila(int pesoMochila) {
		this.pesoMochila = pesoMochila;
	}

	public int getPesoMax() {
		return pesoMax;
	}

	public void setPesoMax(int pesoMax) {
		this.pesoMax = pesoMax;
	}

	public int getEspacioTotal() {
		return espacioTotal;
	}

	public void setEspacioTotal(int espacioTotal) {
		this.espacioTotal = espacioTotal;
	}

	public int getEspacioOcupado() {
		return espacioOcupado;
	}

	public void setEspacioOcupado(int espacioOcupado) {
		this.espacioOcupado = espacioOcupado;
	}
 public void aniadirItem(){
	 Items it=new Items();
	 System.out.println("Nombre del item:");
	 String nombre = espacio.nextLine();
	 it.setNombre(nombre);
	 System.out.println("Descripcion de "+ it.getNombre());
	 String descripcion= espacio.nextLine();
	 it.setDescripcion(descripcion);
	 System.out.println("Ataque de "+ it.getNombre());
	 int ataque= espacio.nextInt();
	 it.setAtaque(ataque);
	 System.out.println("Defensa de "+ it.getNombre());
	 int defensa= espacio.nextInt();
	 it.setDefensa(defensa);
	 mochila.add(it);
	 
 }
}