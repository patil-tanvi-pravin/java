import java.util.Scanner;
public class spAndcp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Selling price : ");
        float sp = sc.nextFloat();
        System.out.print("Enter Cost price : ");
        float cp = sc.nextFloat();
        if(sp>cp){
            float profit = sp - cp;
            System.out.println("The profit is : " + profit);

        }
        else{
            float loss = cp - sp;
            System.out.println("The loss is : " + loss);
        }
    }
}