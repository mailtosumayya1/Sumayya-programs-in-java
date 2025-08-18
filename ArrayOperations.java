
import java.util.Scanner;
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the element to insert: ");
        int elementToInsert = sc.nextInt();
        System.out.print("Enter the position to insert (0 to " + size + "): ");
        int insertPos = sc.nextInt();
        if (insertPos < 0 || insertPos > size) {
            System.out.println("Invalid insertion position!");
        } else {
            int[] newArray = new int[size + 1];
            for (int i = 0, j = 0; i < newArray.length; i++) {
                if (i == insertPos) {
                    newArray[i] = elementToInsert;
                } else {
                    newArray[i] = array[j++];
                }
            }
            array = newArray;
            size++;
            System.out.print("Array after insertion: ");
            for (int val : array) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.print("Enter the position to delete (0 to " + (size - 1) + "): ");
        int deletePos = sc.nextInt();
        if (deletePos < 0 || deletePos >= size) {
            System.out.println("Invalid deletion position!");
        } else {
            int[] newArray = new int[size - 1];
            for (int i = 0, j = 0; i < size; i++) {
                if (i != deletePos) {
                    newArray[j++] = array[i];
                }
            }
            array = newArray;
            size--;
            System.out.print("Array after deletion: ");
            for (int val : array) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}


