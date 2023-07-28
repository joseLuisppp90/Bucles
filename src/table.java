import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num;

        System.out.print("Agrega un numero: ");
        num = console.nextInt();

        System.out.println("La tabla de multiplicacion es: " + num);

        int multiplier = 1;
        while (multiplier <= 10) {
            int result = num * multiplier;
            System.out.println(num + " x " + multiplier + " = " + result);
            multiplier++;
        }
    }
}
