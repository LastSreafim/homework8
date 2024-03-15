import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     //task1
        int[] arr = new int [] {1, 2, 3}; // позже доглядел условия, что заполнять сразу не нужно, но сделал 3-й массив специально, чтоб видно было, что я понял
        double[] numWithComma = new double[] {1.57, 7.654, 9.986};
        char[] charArray = new char[5];
        charArray[0] = 'g';
        charArray[1] = 'e';
        charArray[2] = 'a';
        charArray[3] = 'r';
        charArray[4] = '1';

        //task2
        for (int index = 0; index < arr.length; index++) {
            if (index == arr.length - 1) {
                System.out.println(arr[index]);
                break;
            }
            System.out.print(arr[index] + ", ");
        }
        System.out.println(" ");

        for (int d = 0; d < numWithComma.length; d++) {
            if (d == numWithComma.length - 1) {
                System.out.println(numWithComma[d]);
                break;
            }
            System.out.print(numWithComma[d] + ", ");
        }

        System.out.println(" ");

        for (int c = 0; c < charArray.length; c++) {
            if (c == charArray.length - 1) {
                System.out.println(charArray[c]);
                break;
            }
            System.out.print(charArray[c] + ", ");
        }




        //task3
        for (int index1 = 2; index1 >= 0; index1--) {
            if (index1 == 0) {
                System.out.println(arr[index1]);
                break;
            }
            System.out.print(arr[index1] + ", ");
        }
        System.out.println(" ");

        //task3
        for (int index1 = 2; index1 >= 0; index1--) {
            if (index1 == 0) {
                System.out.println(numWithComma[index1]);
                break;
            }
            System.out.print(numWithComma[index1] + ", ");
        }
        System.out.println(" ");

        for (int index1 = 4; index1 >= 0; index1--) {
            if (index1 == 0) {
                System.out.println(charArray[index1]);
                break;
            }
            System.out.print(charArray[index1] + ", ");
        }
        System.out.println(" ");

        //task4

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}