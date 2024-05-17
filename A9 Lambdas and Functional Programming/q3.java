import java.util.function.Supplier;
import java.util.stream.Stream;

interface LazySeq<T> extends Supplier<T> {
    default LazySeq<T> tail() {
        return (LazySeq<T>) get();
    }

    default boolean isEmpty() {
        return false;
    }
}

public class q3 {
    public static void main(String[] args) {
        LazySeq<Integer> primes = primes(); 
        System.out.println("First 10 prime numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print(primes.get() + " ");
            primes = primes.tail();
        }
    }
    private static LazySeq<Integer> primes() {
        return new LazySeq<Integer>() {
            @Override
            public Integer get() {
                return Stream.iterate(2, n -> n + 1)
                        .filter(q3::isPrime)
                        .findFirst()
                        .orElseThrow();
            }

            @Override
            public LazySeq<Integer> tail() {
                return primes(get() + 1);
            }
        };
    }

    private static LazySeq<Integer> primes(int start) {
        return new LazySeq<Integer>() {
            @Override
            public Integer get() {
                return Stream.iterate(start, n -> n + 1)
                        .filter(q3::isPrime)
                        .findFirst()
                        .orElseThrow();
            }

            @Override
            public LazySeq<Integer> tail() {
                return primes(get() + 1);
            }
        };
    }
    
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}
