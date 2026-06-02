public class columnSum {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] columnSums = new int[3];

        for(int i = 0; i < 3; i++) {
            int sum = 0;
            for(int j = 0; j < 3; j++) {
                sum += arr[j][i];
            }
            columnSums[i] = sum;
        }

        for(int i = 0; i < 3; i++) {
            System.out.println("Sum of column " + i + ": " + columnSums[i]);
        }
    }
}