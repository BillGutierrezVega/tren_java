import java.util.Random;
import java.util.Scanner;

public class while5 {
    static final int FILAS = 5;
    static final int COLUMNAS = 4;
    static char[][] asientos = new char[FILAS][COLUMNAS];

    public static void main(String[] args) {
        inicializarAsientos();
        ocuparAsientosAleatoriamente(8); // Ocupa 8 asientos aleatoriamente

        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            mostrarAsientos();
            System.out.print("Selecciona un asiento (Ej: A3): ");
            String seleccion = scanner.nextLine().toUpperCase();
            reservarAsiento(seleccion);
            System.out.print("Deseas reservar otro asiento? (s/n): ");
            continuar = scanner.nextLine().toLowerCase();
        } while (continuar.equals("s"));

        System.out.println("\nEstado final de los asientos:");
        mostrarAsientos();
    }

    // Inicializa todos los asientos como libres ('L')
    public static void inicializarAsientos() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                asientos[i][j] = 'L';
            }
        }
    }

    // Ocupa una cantidad de asientos aleatoriamente
    public static void ocuparAsientosAleatoriamente(int cantidad) {
        Random random = new Random();
        int ocupados = 0;

        while (ocupados < cantidad) {
            int fila = random.nextInt(FILAS);
            int columna = random.nextInt(COLUMNAS);

            if (asientos[fila][columna] == 'L') {
                asientos[fila][columna] = 'X';
                ocupados++;
            }
        }
    }

    // Muestra los asientos
    public static void mostrarAsientos() {
        System.out.print("    ");
        for (int j = 1; j <= COLUMNAS; j++) {
            System.out.print(j + " ");
            if(j==2){
                System.out.print("  ");   
            }
        }
        System.out.println();
        System.out.println("  |-----------|");
        
        for (int i = 0; i < FILAS; i++) {
            char letraFila = (char) ('A' + i);
            System.out.print(letraFila + " | ");
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(asientos[i][j] + " ");
                if(j==1){
                    System.out.print("  ");
                }
            }
            System.out.println("|");
        }
        System.out.println("  |-----------|");

        System.out.println("L = Libre, X = Ocupado");
    }

    // Intenta reservar un asiento
    public static void reservarAsiento(String seleccion) {
        if (seleccion.length() < 2) {
            System.out.println("Entrada inválida.");
            return;
        }

        char letraFila = seleccion.charAt(0);
        int fila = letraFila - 'A';

        int columna;
        try {
            columna = Integer.parseInt(seleccion.substring(1)) - 1;
        } catch (NumberFormatException e) {
            System.out.println("Número de columna inválido.");
            return;
        }

        if (fila >= 0 && fila < FILAS && columna >= 0 && columna < COLUMNAS) {
            if (asientos[fila][columna] == 'L') {
                asientos[fila][columna] = 'X';
                System.out.println("Asiento " + seleccion + " reservado exitosamente.");
            } else {
                System.out.println("El asiento " + seleccion + " ya está ocupado.");
            }
        } else {
            System.out.println("Asiento fuera de rango.");
        }
    }
}
