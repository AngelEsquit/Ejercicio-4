import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        int tipo;
        int paradas_e;
        int goles_r;
        int pases;
        int asistencias_e;

        while (true) {
            printMenu(); //Menú principal
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) { // Opción para agregar un nuevo jugador
                System.out.println("");
                System.out.println("Ingrese el nombre del jugador:");
                nombre = scanner.nextLine();

                System.out.println("");
                System.out.println("Ingrese el país del jugador:");
                pais = scanner.nextLine();

                System.out.println("");
                System.out.println("Ingrese la cantidad de faltas del jugador:");
                faltas = scanner.nextInt();
                scanner.nextLine();

                System.out.println("");
                System.out.println("Ingrese la cantidad de goles directos del jugador:");
                goles_d = scanner.nextInt();
                scanner.nextLine();

                System.out.println("");
                System.out.println("Ingrese la cantidad de total de lanzamientos del jugador:");
                total_lanzamientos = scanner.nextInt();
                scanner.nextLine();

                System.out.println("");
                System.out.println("Seleccione el tipo de jugador que desea agregar. \n 1: Portero \n 2: Extremo");
                tipo = scanner.nextInt();
                scanner.nextLine();

                if (tipo == 1) { // Opción para agregar un portero
                    System.out.println("");
                    System.out.println("Ingrese la cantidad de paradas efectivas del portero:");
                    paradas_e = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("");
                    System.out.println("Ingrese la cantidad de goles recibidos del portero:");
                    goles_r = scanner.nextInt();
                    scanner.nextLine();

                    porteros.add(new Portero(nombre, pais, faltas, goles_d, total_lanzamientos, paradas_e, goles_r));
                }

                else if (tipo == 2) { // Opción para agregar un extremo
                    System.out.println("");
                    System.out.println("Ingrese la cantidad de pases del extremo:");
                    pases = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("");
                    System.out.println("Ingrese la cantidad de asistencias efectivas del extremo:");
                    asistencias_e = scanner.nextInt();
                    scanner.nextLine();

                    extremos.add(new Extremo(nombre, pais, faltas, goles_d, total_lanzamientos, pases, asistencias_e));
                }
            }

            else if (opcion == 2) { // Opción para mostrar a los jugadores del campeonato
                System.out.println("");
                System.out.println("----------------");
                System.out.println("    Porteros");
                System.out.println("----------------");
                System.out.println("");

                if (porteros.size() == 0) { // Opción por si no sean agregado porteros
                    System.out.println("No hay porteros.");
                }

                else { // Opción para mostrar la lista de porteros
                    for (Portero portero : porteros) {
                        System.out.println("- " + portero.getNombre());
                    }
                }

                System.out.println("");
                System.out.println("----------------");
                System.out.println("    Extremos");
                System.out.println("----------------");
                System.out.println("");

                if (extremos.size() == 0) { // Opción por si no sean agregado extremos
                    System.out.println("No hay extremos.");
                }

                else { // Opción para mostrar la lista de extremos
                    for (Extremo extremo : extremos) {
                        System.out.println("- " + extremo.getNombre());
                    }
                }
                
            }

            else if (opcion == 3) { // Opción para mostrar los 3 mejores porteros según su efectividad
                Collections.sort(porteros, new Comparator<Portero>() {
                    @Override
                    public int compare(Portero portero1, Portero portero2) {
                        return -Float.compare(portero1.getEfectividad(), portero2.getEfectividad());
                    }
                });

                for (int i = 0; i < 3; i++) {
                    System.out.println("- " + porteros.get(i).getNombre() + ": " + porteros.get(i).getEfectividad());
                }
            }

            else if (opcion == 4) { // Opción para mostrar los extremos
                Collections.sort(extremos, new Comparator<Extremo>() {
                    @Override
                    public int compare(Extremo extremo1, Extremo extremo2) {
                        return -Float.compare(extremo1.getEfectividad(), extremo2.getEfectividad());
                    }
                });

                for (int i = 0; i < extremos.size(); i++) {
                    if (extremos.get(i).getEfectividad() >= 85) {
                        System.out.println("- " + extremos.get(i).getNombre() + ": " + extremos.get(i).getEfectividad());
                    }
                }
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

