import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        int[] arr = {10, 28, 89, 57};
        Scanner sc = new Scanner(System.in);

        int oldVal = sc.nextInt();
        int newVal = sc.nextInt();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == oldVal) {
                arr[i] = newVal;
            }
        }

        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}