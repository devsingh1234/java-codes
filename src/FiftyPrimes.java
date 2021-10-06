import java.util.*;
import java.lang.*;
import java.io.*;

public class FiftyPrimes {
    public static boolean isPrime(long n) {
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextInt();
        sc.close();
        if (start < 2) {
            start = 2;
        }
        int numberOfPrimes = 0;
        long number = start;
        while (numberOfPrimes < 50) {
            if (isPrime(number)) {
                System.out.println(number);
                numberOfPrimes++;
            }
            number++;
        }
    }
}
