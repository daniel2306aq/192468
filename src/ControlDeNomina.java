import java.util.Scanner;

public class ControlDeNomina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double acumuladoSueldos = 0.0; 
        int contadorRango = 0;        

        System.out.println("Ingresa 10 sueldos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Sueldo #" + (i + 1) + ": ");
            double sueldo = scanner.nextDouble();

            if (sueldo > 0) {
                acumuladoSueldos += sueldo; 

                if (sueldo >= 100.0 && sueldo <= 300.0) {
                    contadorRango++;
                }
            } else {
                System.out.println("¡Sueldo no válido! Debe ser positivo. Intenta de nuevo.");
                i--; 
            }
        }

        System.out.printf("Total acumulado de sueldos: ", (float) acumuladoSueldos); 
        System.out.println("Cantidad de sueldos entre $100 y $300 (incluyendo extremos): " + contadorRango);

        scanner.close();
    }
}