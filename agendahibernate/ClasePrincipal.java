package agendahibernate;

import java.util.ArrayList;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			AccesoBD.setUp();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int opcion;
		opcion=EntradaSalida.mostrarMenu();
		Contacto c=null;
		while(opcion!=4) 
		{
			switch(opcion) 
			{
			case 1://Insertar contacto
				c=EntradaSalida.pedirContacto();
				AccesoBD.insertarContacto(c);
				break;
			case 2://Listar contacto
				ArrayList<Contacto> lista_contactos=AccesoBD.listarContactos();
				//EntradaSalida.mostrarContactos(lista_contactos);
				break;
			case 3://Buscar contacto
				String contacto_buscado=EntradaSalida.contactoBuscado();
				ArrayList<Contacto> lista=AccesoBD.buscarPorNombre(contacto_buscado);
				//EntradaSalida.mostrarContactosPorNombre(lista);
				break;
			}
			opcion=EntradaSalida.mostrarMenu();
		}
	}
}