import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Day 4 four ( Homework):

        /* 1.Write a Java program to test if the first and the last element of an array of integers is same.
         The length of the array must be greater than or equal to 2
         */

        int[] numbers = {50, -20, 0, 30, 40, 60, 10};
        {
            if (numbers.length >= 2 && numbers[0] == numbers[numbers.length - 1]) {
                System.out.println("The first and last element of the array are the same.");
            } else {
                System.out.println("The first and last element of the array are not the same.");
            }
        }

        //2.Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.

        int[] numbers2 = {1, 4, 17, 7, 25, 3, 100};
        int k = 4;
        int[] largest = new int[k];

        Arrays.sort(numbers2);
        int j = 0;
        for (int i = numbers2.length - 1; i >= numbers2.length - k; i--) {
            largest[j] = numbers2[i];
            j++;

        }
        System.out.println("The " + k + " largest elements in the array are:");
        for (int element : largest) {
            System.out.println(element);
        }

        //3.Write a Java program to find the numbers greater than the average of the numbers of a given array.

        int[] numbers3 = {1, 4, 17, 7, 25, 3, 100};
        int sum = 0;
        int max = numbers3[0];

        for (int i = 0; i < numbers3.length; i++) {
            sum = sum + numbers3[i];
        }
        int average = sum / numbers3.length;
        System.out.println("Average value of the array elements is : " + average);


//        4- Write a Java program to get the larger value between first and last element of an array of integers.
        int[] arr4 = {40, 30, 40};
        int n = arr4.length;
        int largerValue;

        if (arr4[0] > arr4[n - 1]) {
            largerValue = arr4[0];
        } else {
            largerValue = arr4[n - 1];
        }

        System.out.println("The larger value between the first and last element is: " + largerValue);

//         5- Write a Java program to swap the first and last elements of an array and create a new array.

        int[] array1 = {20, 30, 40};
        int x = array1.length;
        int[] newArray1 = new int[x];

        newArray1[0] = array1[x - 1];
        newArray1[x - 1] = array1[0];
        for (int i = 1; i < x - 1; i++) {
            newArray1[i] = array1[i];
        }
        System.out.println("Original array: " + Arrays.toString(array1));
        System.out.println("New array with swapped first and last elements: " + Arrays.toString(newArray1));

//        6- Write a Java program to find all the longest word in a given dictionary.

        String[] dictionary = {"cat", "dog", "red", "is", "am"};
        int maxLength = 0;

        List<String> longestWords = new ArrayList<>();
        for (String word : dictionary) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWords.clear();
                longestWords.add(word);
            } else if (word.length() == maxLength) {
                longestWords.add(word);
            }
        }

        System.out.println("The longest words in the dictionary are: " + longestWords.toString());

//        7.Write a menu-driven Java program with following option:

//        8. Write a program that's displays the number of occurrences of an element in the array.
        int[] arr8 = {1, 1, 1, 3, 3, 5,};
        int element = 1;
        int count = 0;

        for (int i = 0; i < arr8.length; i++) {
            if (arr8[i] == element) {
                count++;
            }
        }
        System.out.println("The number of occurrences of " + element + " in the array is: " + count);

        //9. Write a program that places the odd elements of an array before the even elements.
        int[] arr9 = {2, 3, 40, 1, 5, 9, 4, 10, 7};
        int Y = arr9.length;
        int[] newArr = new int[Y];
        int oddIndex = 0;
        int evenIndex = Y - 1;

        for (int i = 0; i < Y; i++) {
            if (arr9[i] % 2 == 1) {
                newArr[oddIndex++] = arr9[i];
            } else {
                newArr[evenIndex--] = arr9[i];
            }
        }

        System.out.println("Original array: " + Arrays.toString(arr9));
        System.out.println("New array with odd elements before even elements: " + Arrays.toString(newArr));

        //10. Write a program that test the equality of two arrays.
        int[] arr10 = {2, 3, 6, 6, 4};
        int[] arr11 = {2, 3, 6, 6, 4};
        boolean isEqual;

        if (arr10.length != arr11.length) {
            isEqual = false;
            System.out.println("The two arrays are equal.");
        } else {
            isEqual = Arrays.equals(arr10, arr11);
        }
        if (isEqual) {
            System.out.println("The two arrays are equal.");
        } else {
            System.out.println("The two arrays are not equal.");
        }
    }
}
