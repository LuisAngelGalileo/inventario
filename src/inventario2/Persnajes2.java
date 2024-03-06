package inventario2;

import java.util.ArrayList;
import java.util.Scanner;

public class Persnajes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc=0;
		Scanner mochila = new Scanner(System.in);		
		Items it=new Items();
		String a;
	
		
System.out.println("Q QUERES HACER MAMABICHO:");
System.out.println("1. Añadir nuevo item a la mochila:");
System.out.println("2. Modificar un item que ya existe:");
System.out.println("3. Eliminar un item de la mochila:");
System.out.println("4. Cargar/Guardar");
System.out.println("5. Salir");
opc=mochila.nextInt();

switch(opc) {
case 1:
	System.out.println("ESTAS AÑADIEDO UN ITEM:");
	System.out.println("Nombre:");
	a = mochila.nextLine();
	it.setNombre(a);
	System.out.println("Descripcion:");
	System.out.println("peso:");
case 2:
	break;
	
case 3: 
	break;
case 4:
	break;
case 5:
	break;
}





	}


}


