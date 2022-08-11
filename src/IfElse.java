import java.util.Scanner;

public class IfElse {
    public static void ifElseStatment(){
        int N;
        Scanner sc =  new Scanner(System.in);
        N = sc.nextInt();

        if(N%2!=0){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }
        
    }
}
