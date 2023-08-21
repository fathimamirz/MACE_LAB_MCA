import java.util.*;
class FibonacciGenerator implements Runnable {
    private int n;

    public FibonacciGenerator(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int prev = 0;
        int current = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.println("f-"+prev);
            int next = prev + current;
            prev = current;
            current = next;
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenNumberPrinter implements Runnable {
    private int start;
    private int end;

    public EvenNumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println("\nEven Numbers in the Range " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println("e-"+i);
            }
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class main {
    public static void main(String[] args) {
        int n; // Generate first 10 Fibonacci numbers
        int startRange;
        int endRange;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements in fib");
        n=sc.nextInt();
        System.out.println("enter the start and end range");
        startRange=sc.nextInt();
        endRange=sc.nextInt();

        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(n);
        EvenNumberPrinter evenNumberPrinter = new EvenNumberPrinter(startRange, endRange);

        Thread fibonacciThread = new Thread(fibonacciGenerator);
        Thread evenNumberThread = new Thread(evenNumberPrinter);

        fibonacciThread.start();
        evenNumberThread.start();

        try {
            fibonacciThread.join();
            evenNumberThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nBoth threads have finished.");
    }
}
