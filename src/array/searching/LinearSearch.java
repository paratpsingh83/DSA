package array.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {-3, -1, 1, 3, 5, 6, 7, 9, 10};
        // int[] array = new int[1000];
        int target = 9;
        //int index = linearSearch(array, target);
        int index = linearSearchUsingRecur(array, target, 0, array.length - 1);
        if (index != -1)
            System.out.println("Element found at index : " + index);
        else
            System.out.println("Element not found");
    }

//    public static int linearSearch(int[] array, int target) {
//        int steps = 0;
//        for (int i = 0; i < array.length; i++) {
//            steps++;
//            if (array[i] == target) {
//                System.out.println("Steps taken by liner :" + steps);
//                return i;
//            }
//        }
//        return -1;
//    }


    public static int linearSearchUsingRecur(int[] array, int target, int left, int right) {
        if (left > right)
            return -1;

        if (array[left] == target) {
            return left;
        }
        return linearSearchUsingRecur(array, target, left + 1, right);
    }
}
