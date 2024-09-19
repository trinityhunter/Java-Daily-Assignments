import java.util.Scanner;

public class Ass12_Q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");

        int a = sc.nextInt();

        System.out.println("Enter second number: ");

        int b = sc.nextInt();

        System.out.println("Enter the sign of operation: ");

        char sign = sc.next().charAt(0);

        if(sign == '+'){
            System.out.println("The addition of " + a + " and " + b + " is: " + (a+b));
        }
        else if(sign == '-'){
            System.out.println("The subtraction of " + a + " and " + b + " is: " + (a>b ? a-b : b-a));
        }
        else if(sign == '*'){
            System.out.println("The multiplication of " + a + " and " + b + " is: " + (a*b));
        }
        else if(sign == '/'){
            System.out.println("The division of " + a + " and " + b + " is: " + (a>b ? a/b : b/a));
        }
        else{
            System.out.println("Please enter a valid Sign of Operation like +, -, *, /");
        }

    }

}
