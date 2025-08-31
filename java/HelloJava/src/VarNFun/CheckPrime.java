import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        int n; 
        Scanner banPhim = new Scanner(System.in); 
        System.out.print("Input your number: ");
        n = banPhim.nextInt(); 
    
        System.out.println("There is the list of prime numbers in [1, " + n +"]");
        printPrimeList(n);

        System.out.println();
        System.out.println("There is the " + n + " first primes");
        printNFirstPrimes(n);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeList(int n) {
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }

    public static void printNFirstPrimes(int n) {
        int i = 1; 
        while (n > 0) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                n--;
            }
            i++;
        }
    }
}
