package Bridgelabz.com;
import java.sql.Time;
import java.util.Scanner;
import java.time.*;
public class StopWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int UserChoice;
        long StartTime=0;
        long StopTime;
        long TimeElapsed;
        while(true){
            System.out.println("Enter your choice \t 1) Start \t 2) stop \t 3) Exit");
            UserChoice=sc.nextInt();
            switch(UserChoice)
            {
                case 1-> {
                    StartTime=System.currentTimeMillis();
                    System.out.println("Started at :- " +StartTime + "ms");
                }
                case 2->{
                    StopTime=System.currentTimeMillis();
                    System.out.println("Stoped at :- "+StopTime + "ms");
                    TimeElapsed=StartTime-StopTime;
                    System.out.println(TimeElapsed);
                }
                case 3->{
                    System.exit(0);
                }
            }
        }
    }
}
