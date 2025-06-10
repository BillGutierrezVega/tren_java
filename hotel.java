import java.util.Scanner;

public class hotel {
    public static void main(String[] args) {
        boolean[][] hotel = new boolean[3][5]; // 3 pisos, 5 habitaciones por piso
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n🏨 BIENVENIDO AL SISTEMA DEL HOTEL");
            System.out.println("1. Registrarse en una habitación");
            System.out.println("2. Ver el estado del hotel");
            System.out.println("3. Salir del sistema");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese número de piso (0 a 2): ");
                    int piso = sc.nextInt();
                    System.out.print("Ingrese número de habitación (0 a 4): ");
                    int habitacion = sc.nextInt();

                    if (piso < 0 || piso >= 3 || habitacion < 0 || habitacion >= 5) {
                        System.out.println("❌ Piso o habitación fuera de rango.");
                    } else if (hotel[piso][habitacion]) {
                        System.out.println("❌ La habitación ya está ocupada.");
                    } else {
                        hotel[piso][habitacion] = true;
                        System.out.println("✅ ¡Registro exitoso! Habitación reservada.");
                    }
                    break;

                case 2:
                    System.out.println("\n📋 Estado actual del hotel:");
                    for (int i = 0; i < hotel.length; i++) {
                        System.out.print("Piso " + i + ": ");
                        for (int j = 0; j < hotel[i].length; j++) {
                            System.out.print(hotel[i][j] ? "[X] " : "[ ] ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("👋 ¡Gracias por usar el sistema!");
                    break;

                default:
                    System.out.println("⚠️ Opción inválida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 3);

        sc.close();
    }
}
