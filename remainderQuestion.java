import java.util.Scanner;
public class remainderQuestion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number a : ");
        int a = sc.nextInt();
        System.out.print("Enter second number b : ");
        int b = sc.nextInt();
        int q = a / b;
        int r = a - b * q;
        System.out.println("The remainder when a is divided by b is : " + r);
    }
}
