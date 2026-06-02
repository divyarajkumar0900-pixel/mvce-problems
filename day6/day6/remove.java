public class remove {
    public static void main(String[] args) {
        int[] arr = {10, 28, 89, 57};
        int remove = 28;

        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != remove) {
                count++;
            }
        }

        int[] newArr = new int[count];
        int j = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != remove) {
                newArr[j++] = arr[i];
            }
        }

        for(int x : newArr) {
            System.out.print(x + " ");
        }
    }
}