import java.util.Scanner;

public class Divisibility 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int dividend = input.nextInt();
        System.out.print("\nEnter the divisor: ");
        int divisor = input.nextInt();
 
        if(divisor == 0 || ((dividend/divisor) != (double)dividend / divisor)){
            System.out.println(dividend + " is not divisible by " + divisor + "!");
        }
        else{
            System.out.println(dividend + " is divisible by " + divisor + "!");
        }
    }
}
