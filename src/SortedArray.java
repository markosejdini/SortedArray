import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {

    }

    public static int [] getIntegers (int size) {

        Scanner sc = new Scanner(System.in);
        int [] array = new int[size];
        System.out.println("Enter: "+size+ " numbers in array");
        for (int i=0; i<array.length; i++){
            array[i]=sc.nextInt();
            System.out.println("numb " + i+ "Added");
        }
        return array;
    }

    public static void printArray(int [] array) {
        for(int i=0; i<array.length; i++) {

        }
    }


}
