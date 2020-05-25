package sda._200523.BinarySearch;

import sda._200523.BubbleSort.BubbleSort;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {4,2,5,1,7};
        System.out.println(search(array, 7));
    }

    public static int search(int[] array, int number) {
        BubbleSort.bubbleSort(array);
        int left = 0;
        int right = array.length - 1;
        int middle;
        while (true) {
            middle = (left + right) / 2;
            if (left > right)
                return -1;
            if (array[middle] == number)
                return middle;
            if (array[middle] > number)
                right = middle - 1;
            if (array[middle] < number)
                left = middle + 1;
        }
    }
}
