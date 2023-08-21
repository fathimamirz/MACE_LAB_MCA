import java.util.*;
class MultiplicationTableThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PrimeNumberThread extends Thread {
    private int n;

    public PrimeNumberThread(int n) {
        this.n = n;
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
       
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                System.out.println(num + " ");
                count++;
            }
            num++;
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
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of prime numbers");
        int numPrimes=sc.nextInt();
       
        MultiplicationTableThread tableThread = new MultiplicationTableThread();
        PrimeNumberThread primeThread = new PrimeNumberThread(numPrimes);
       
        tableThread.start();
        primeThread.start();
       
        try {
            tableThread.join();
            primeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       
        System.out.println("\nBoth threads have finished.");
    }
}

