import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Node> myNodes;
        Reader myReader = new Reader();
        String path = "logistica.txt";

        try {
            myNodes = myReader.readFile(path);
        } catch (Exception e) {
            System.out.println("No se encontró el archivo \"logistica.txt\". Asegurese que el archivo se encuentra en el mismo directorio que el programa.");
            System.exit(0);
        }
        
        System.out.println("Bienvenido al sistema de navegación de ciudades.");

        while (true) {
            
            int opt = printMenu(in);

            switch (opt) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    in.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese un número válido.");
                    break;
            }

        }

    }

    public static int printMenu(Scanner in) {
        System.out.println("Ingrese la opción que desea realizar:");
        System.out.println("1. Viajar de ciudad A a ciudad B");
        System.out.println("2. Mostrar el nombre de la ciudad en el centro del grafo");
        System.out.println("3. Modificar el sistema");
        System.out.println("4. Salir del sistema");

        System.out.println("Ingrese su elección: ");

        int opt = Integer.parseInt(in.nextLine());
        return opt;
    }
}
