package Multithreding;


class Table extends Thread {
     synchronized void print(int n,int i)
    {
        System.out.println(n+ "+"+ i+" "+n*i);
    }
    void printTable(int n) {
        for (int i = 1; i <=10; i++) {
            print(n,i);
        }
    }

    public void run() {
        int n = 5;
        printTable(n);
    }
}
    public class depo {
        public static void main(String[] args) {
            Table t = new Table();
            Thread thread1 = new Thread(() -> t.printTable(5));
            Thread thread2 = new Thread(() -> t.printTable(7));

            thread1.start();
            thread2.start();
        }
    }

