import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter  number");
        int number=scanner.nextInt();
        if(number>0) {
        System.out.println("the number is positive");
        } else if(number<0) {
            System.out.println("the number is negative");
        } else {
         System.out.println("the number iszero");
        }
         scanner.close();
    }
}

