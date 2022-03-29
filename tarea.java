import java.util.Scanner;
public class tarea {
    public static void main(final String[] args) {
        String usu;
        final Scanner sca = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        usu=sca.nextLine();
        String nombre;
        String telefono;
        String gmail;

        Agenda agendita= new Agenda(256);

        while(opi!=3){
            System.out.println("Agenda de "+ usu);
            System.out.println("1- Ingresar un nuevo contacto");
            System.out.println("2- Consultar un contacto existente");
            System.out.println("3- Salir");
            
            System.out.println("Ingrese una opcion");
            int opi= sca.netxInt();
            
            switch(opi){
                case 1:
                    break;
                case 2:
                    agendita.bucarContacto(nombre);
                    System.out.print("Ingrese el nombre de la persona");
                    nombre=sca.nextLine();
                    
                    break;
                case 3:
                    System.out.println("¡ADIOS :)!");
                    break;
                default: System.out.println("La opción ingresada no existe, intente de nuevo");
            }
        }
    }
}