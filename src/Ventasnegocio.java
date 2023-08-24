import java.util.Scanner;

public class Ventasnegocio {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el número de ventas: ");
            int numeroventas = scanner.nextInt();
            
            double[] ventas = new double[numeroventas];
            
            for (int i = 0; i < numeroventas; i++) {
                System.out.print("Ingrese la venta #" + (i + 1) + ": ");
                ventas[i] = scanner.nextDouble();
            }
            
            for (int i = 0; i < numeroventas - 1; i++) {
                for (int j = 0; j < numeroventas - i - 1; j++) {
                    if (ventas[j] > ventas[j + 1]) {
                        double temp = ventas[j];
                        ventas[j] = ventas[j + 1];
                        ventas[j + 1] = temp;
                    }
                }
            }
            
            System.out.println("Reporte de Ventas (Ascendente):");
            for (double venta : ventas) {
                System.out.println(venta);
            }
        }
    }
}
 
        
    
    

