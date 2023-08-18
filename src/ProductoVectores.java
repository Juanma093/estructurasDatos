import java.util.Scanner;

public class ProductoVectores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] a = new int[10];
        int[] b = new int[10];
        
        System.out.println("Ingrese los valores del vector a:");
        for (int i = 0; i < 10; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }
        
        System.out.println("Ingrese los valores del vector b:");
        for (int i = 0; i < 10; i++) {
            System.out.print("b[" + i + "]: ");
            b[i] = scanner.nextInt();
        }
        
        int producto = 0;
        for (int i = 0; i < 10; i++) {
            producto += a[i] * b[i];
        }
        
        System.out.println("El producto a * b es: " + producto);
    }
 
}
        
    
    
