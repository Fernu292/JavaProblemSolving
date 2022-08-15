import java.util.Scanner;

public class IfElse {
    public static void ifElseStatment(){
        try(Scanner sc = new Scanner(System.in)){
            int N;
            N = sc.nextInt();

            if(N%2==0){
                if(N>=6 && N<=20){
                    System.out.println("Weird");
                }else{
                    System.out.println("Not Weird");
                }
            }else{
                System.out.println("Weird");
            }

        }
        

    }
}
