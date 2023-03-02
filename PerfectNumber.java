package Bridgelabz.com;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check weather it is perfect number or not :- ");
        int num = sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum =sum+i;
                System.out.println(i+ " ");
            }
        }
        if(num == sum)
        {
            System.out.println(num+"is it perfect number");
        }
        else {
            System.out.println("Not perfect number!!!");
        }
    }
}
