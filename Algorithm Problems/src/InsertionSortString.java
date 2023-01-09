import java.util.Scanner;

public class InsertionSortString {
    public static void insertionSortString(String[] str) {
        String temp = "";
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].compareToIgnoreCase(str[j]) > 0) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        System.out.println("Sorted array is::");
        for (String s : str) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        String[] arr = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        insertionSortString(arr);
    }
}
