package array.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {-3, -1, 1, 3, 5, 6, 7, 9, 10};
        // int[] array = new int[1000];
        int target = 9;
        // int index = binarySearch(array, target);
        int index = binarySearchUsingRecur(array, target, 0, array.length - 1);
        if (index != -1)
            System.out.println("Element found at index : " + index);
        else
            System.out.println("Element not found");
    }

//    public static int binarySearch(int[] array, int target) {
//        int steps = 0;
//        int left = 0;
//        int right = array.length - 1;
//        while (left <= right) {
//            steps++;
//            int mid = (left + right) / 2;
//
//            if (array[mid] == target) {
//                System.out.println("Steps taken by Binary :" + steps);
//                return mid;
//            } else if (array[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        System.out.println("Steps taken by liner :" + steps);
//        return -1;
//    }

    public static int binarySearchUsingRecur(int[] array, int target, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target)
                return mid;
            else if (array[mid] < target)
                return binarySearchUsingRecur(array, target, mid + 1, right);
            else
                return binarySearchUsingRecur(array, target, mid, right - 1);
        }
        return -1;
    }
}
