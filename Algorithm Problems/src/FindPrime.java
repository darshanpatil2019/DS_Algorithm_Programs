public class FindPrime {
    public static void primeNumber() {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            int prime = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    prime = prime + 1;
                }
            }
            if (prime == 2) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        primeNumber();
    }
}
