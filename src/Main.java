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
        System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);
        System.out.println(numWithComma[0] + ", " + numWithComma[1] + ", " + numWithComma[2]);
        System.out.println(charArray[0] + ", " + charArray[1] + ", " + charArray[2] + ", " + charArray[3] + ", " + charArray[4]);

        //task3
        System.out.println(arr[2] + ", " + arr[1] + ", " + arr[0]);
        System.out.println(numWithComma[2] + ", " + numWithComma[1] + ", " + numWithComma[0]);
        System.out.println(charArray[4] + ", " + charArray[3] + ", " + charArray[2] + ", " + charArray[1] + ", " + charArray[0]);

        //task4

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}