package Multithreding;
/*
Multithreding : Is a process to execute multiple thread at the same time without *dependency* of other thread is called multithrading

Thread : Is a pre-define class which is available in lang package
        Thread is basic or smallest unit of CPU and it is well known for independent Execution

        There are 2 ways to create thread in java
        1) Extending Thread class
        2) Implimenting Runable Interface
1: Process based multithreding
  -Multiple CPU
  -Multiple application
  -Multiple function in single applicaiton
2: tread based multithreding
   -Multiple application
   -Multiple function in single applicaiton
   -Multiple users in single function


   ***********************   Syncronize ******************************

  - Syncronization in a tech through which we can control multiple threads or among the number of thread
  - Only one thread will enter in syncronized area
  - The main perpose of syncronization is to overcome the problem of multithreding
  - When multiple threas are trying to access same resources at the same time on that situation it may provide wrong reult or corrupted data
  - Syncronization is brodly classifiead in 2 categories 1)method level 2)block leval(beat approach)

  Multihreding is very good when ever we want to complete our task as soon as possible but in some situation it may provide some wrong result
  this type of situation occur when same resoure is accesible by multiple thred at the same time


 */
import java.util.Scanner;

class Bus{
    Scanner sc=new Scanner(System.in);
    int seat;
    String name;
    int avialble=5;
    int x=1;

    void booking()
    {
       do{
           System.out.println("Enter your name : ");
           name=sc.nextLine();
           System.out.println("Enter Number  of seats : ");
           seat=sc.nextInt();
           sc.nextLine();

           if(avialble>=seat)
           {
               System.out.println("Hello "+name+", your seats are booked...");
               avialble-=seat;
           }
           else{
               System.out.println("Sorry..No Seats available");
               x=-1;

           }

       }
       while(avialble>0);
    }
}









public class Friends {

    public static void main(String[] args) {
        Bus b= new Bus();
        b.booking();

    }


}
