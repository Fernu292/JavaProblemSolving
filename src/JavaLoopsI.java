import java.util.Scanner;


public class JavaLoopsI {
    public void JavaLoop(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Tablas de multiplicar : ");

            int number = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (i * number));
            }
        }
    };
}
