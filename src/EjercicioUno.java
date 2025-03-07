import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int numEnt = scanner.nextInt();

        if (numEnt <= 0) {
            System.out.println("Te dije que un numero positivo socio... TOME YOGURT");
        } else {
            genP(numEnt);
        }
        scanner.close();
    }
    public static void genP(int numEnt) {
        for (int i = 1; i <= numEnt; i++) {
            for (int j = i; j <= numEnt; j++) {
                System.out.print(j + " ");
            }
            
        }
    }

}
