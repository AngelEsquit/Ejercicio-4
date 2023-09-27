import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Portero> porteros = new ArrayList<Portero>();
        ArrayList<Extremo> extremos = new ArrayList<Extremo>();

        String nombre;
        String pais;
        int faltas;
        int goles_d;
        int total_lanzamientos;

        while (true) {
            printMenu(); //Menú principal
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) { // Opción para agregar un nuevo jugador
                System.out.println("Ingrese el nombre del jugador:");
                nombre = scanner.nextLine();

                System.out.println("Ingrese el país del jugador:");
                pais = scanner.nextLine();

                System.out.println("Ingrese la cantidad de faltas del jugador:");
                faltas = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese la cantidad de goles directos del jugador:");
                goles_d = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese la cantidad de total de lanzamientos del jugador:");
                total_lanzamientos = scanner.nextInt();
                scanner.nextLine();

                
            }

            else if (opcion == 2) {

            }

            else if (opcion == 3) {
                
            }

            else if (opcion == 4) {
                
            }

            else if (opcion == 5) { // Opción para terminar el programa
                break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("");
        System.out.println("**************************************");
        System.out.println("             Estadísticas");
        System.out.println("**************************************");
        System.out.println("Ingrese la opción que desee. \n 1: Agregar un nuevo jugador \n 2: Mostrar los jugadores del campeonato \n 3: Mejores porteros \n 4: Mejores extremos \n 5: Salir");
        System.out.println("");
    }
}

