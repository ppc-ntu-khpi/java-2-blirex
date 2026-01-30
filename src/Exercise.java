//package domain;

public class Exercise {

    public static String Calculate(int R) {
        StringBuilder result = new StringBuilder();

        int n = R;

        for (int d = 2; d * d <= n; d++) {
            if (n % d == 0 && isPrime(d)) {
                if (result.length() > 0) {
                    result.append(",");
                }
                result.append(d);
                while (n % d == 0) {
                    n /= d;
                }
            }
        }
        if (n > 1 && isPrime(n)) {
            if (result.length() > 0) {
                result.append(",");
            }
            result.append(n);
        }

        return result.toString();
    }
    private static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}

