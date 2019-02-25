package agendahibernate;

import java.util.ArrayList;
import java.util.Scanner;

public class EntradaSalida {
static Scanner sc=new Scanner(System.in);
	
	public static int mostrarMenu() {
		System.out.println("ELIJA UNA OPCIÓN:");
        System.out.println("1.Insertar contacto");
        System.out.println("2.Listar contactos");
        System.out.println("3.Buscar contactos");
        System.out.println("4.SALIR");
        int opcion=sc.nextInt();
        return opcion;
	}
	public static Contacto pedirContacto() {
		System.out.println("Introduzca el nombre:");
        String nombre=sc.nextLine();
        System.out.println("Introduzca el email:");
        String email=sc.nextLine();
        System.out.println("Introduzca el telefono:");
        String telefono=sc.nextLine();
        Contacto c=new Contacto(nombre,email,telefono);
        return c;
	}
	public static void mostrarContactos(ArrayList<Contacto> lista_contactos) 
    {
       for(int i=0;i<lista_contactos.size();i++) 
       {
           Contacto c=lista_contactos.get(i);
           System.out.println("Nombre: "+c.getNombre()+"/n "+"Email: "+c.getEmail()+"/n "+"Telefono: "+c.getTelefono());
       }
    }
	public static String contactoBuscado() {
		System.out.println("Introduzca nombre del contacto buscado:");
		String nombre=sc.nextLine();
		return nombre;
	}
}
