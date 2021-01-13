public class Radix {
    public static int nth(int n, int col) {
        // if (col > length(n) - 1) {
        // throw new IllegalArgumentException("Column " + col + " is out of range");
        // }

        return (int) (n / Math.pow(10, col)) % 10;
    }

    public static int length(int n) {
        return (int) Math.log10(n) + 1;
    }

    public static void merge(MyLinkedList original, MyLinkedList[] buckets) {
        for (MyLinkedList i : buckets) {
            original.extend(i);
        }
    }

    public static void merge(SortableLinkedList original, SortableLinkedList[] buckets) {
        for (SortableLinkedList i : buckets) {
            original.extend(i);
        }
    }

    public static void radixSortSimple(SortableLinkedList data) {
        SortableLinkedList[] buckets = new SortableLinkedList[10];
        for (int i = 0; i < buckets.length; ++i) {
            buckets[i] = new SortableLinkedList();
        }

        int length = 1;
        for (int i = 0; i < length; i++) {
            int curr;
            while (data.size() > 0) {
                curr = data.remove(0);
                if (i == 0) {
                    length = Math.max(length, curr);
                }

                buckets[nth(curr, i)].add(curr);
            }
            merge(data, buckets);
        }
    }

    public static void radixSort(SortableLinkedList data) {

    }
}