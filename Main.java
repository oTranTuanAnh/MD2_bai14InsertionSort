public class Main {
    public static void main(String[] args) {
        int[] arr = {28, 1, 8, 18, 24, 72, 80, 73, 14, 55};
        System.out.println("mag ban dau:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        InsertionSort.insertionSort(arr);
        System.out.println();
        System.out.println("mag da sap xep:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
