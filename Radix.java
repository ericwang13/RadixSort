public class Radix {
    public static int nth(int n, int col) {
        if (col > length(n) - 1) {
            throw new IllegalArgumentException("Column " + col + " is out of range");
        }

        return (int) (n / Math.pow(10, col)) % 10;
    }

    public static int length(int n) {
        return (int) Math.log10(n) + 1;
    }

    public static void merge(MyLinkedList original, MyLinkedList[] buckets) {

    }
}