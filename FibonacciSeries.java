// 0 1 1 2 3 5 8 13
//0 + 1 =1
//        1 + 1
package Bridgelabz.com;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b =1;
        int sum;
        System.out.println(a);
        System.out.println(b);
        for (int i=2;i<10;i++ )
        {
            sum=a+b;
            System.out.print(sum+ " \t");
            a=b;
            b=sum;
        }
    }
}
