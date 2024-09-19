import java.util.Scanner;

public class Ass12_Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");

        int a = sc.nextInt();

        System.out.println("Enter second number: ");

        int b = sc.nextInt();

        System.out.println("The addition of cubes of " + a + " and " + b + " is: " + ((a*a*a)+(b*b*b)));

        System.out.println("The subtraction of squares of " + a + " and " + b + " is: " + ((a*a)-(b*b)));

    }

}
