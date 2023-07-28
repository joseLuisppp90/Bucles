public class series {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Serie de Fibonacci con " + n + " términos:");
        generateFibonacciSeries(n);
    }

    public static void generateFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;}
    
        
    }
}