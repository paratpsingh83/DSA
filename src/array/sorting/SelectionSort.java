package array.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {6, 5, 7, 2, 4, 8, 1, 9, 3};
        int size = array.length;
        int temp = 0;
        int minIndex = -1;

        System.out.println("Before Sorting");
        for (int num : array) {
            System.out.print(num + " ");
        }

        //Using small value

        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

            System.out.println();
            for (int num : array) {
                System.out.print(num + " ");
            }

        }

        System.out.println();
        System.out.println("After Sorting");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

