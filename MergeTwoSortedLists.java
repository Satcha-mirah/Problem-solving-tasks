package ProblemSolvingTask;
import java.util.*;
public class MergeTwoSortedLists {
        public static void main(String[] args) {
            int[] arr1 = {1, 3, 4, 5};
            int[] arr2 = {2, 6, 7, 8};

            int[] mergedArr = mergeSortedArrays(arr1, arr2);
            System.out.println(Arrays.toString(mergedArr));
        }

        public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
            int n1 = arr1.length;
            int n2 = arr2.length;
            int[] mergedArr = new int[n1 + n2];

            int i = 0, j = 0, k = 0;
            while (i < n1 && j < n2) {
                if (arr1[i] < arr2[j]) {
                    mergedArr[k] = arr1[i];
                    i++;
                } else {
                    mergedArr[k] = arr2[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                mergedArr[k] = arr1[i];
                i++;
                k++;
            }

            while (j < n2) {
                mergedArr[k] = arr2[j];
                j++;
                k++;
            }

            return mergedArr;
        }
    }


