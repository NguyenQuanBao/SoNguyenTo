// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();
        optimizedPrimeFactorization.start();
        try {
            optimizedPrimeFactorization.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        lazyPrimeFactorization.start();

    }
}