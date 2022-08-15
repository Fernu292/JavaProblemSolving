import java.util.Scanner;

public class InputAnalysis {
    public static void Stdin(){
        try (Scanner scan = new Scanner(System.in)) {
            int i = scan.nextInt();
            double d = scan.nextDouble();

            //After a numeric value we get an "\n" so if we need to take a String
            //We have to add a scan.nextLine() to consume the \n

            scan.nextLine();
            String s = scan.nextLine();

            System.out.println("String: "+s);
            System.out.println("Double: "+d);
            System.out.println("Int: "+i);
        }

    }

}
