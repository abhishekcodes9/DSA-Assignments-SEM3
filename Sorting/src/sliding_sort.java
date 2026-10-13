public class sliding_sort {
    public static void main(String[] args) {

        int arr[] = {5, 2, 67, 7, 2, 5};

        for (int i = 0; i < arr.length - 1; i++) {

            int min = Integer.MAX_VALUE;
            int index = i;

            for (int j = i; j < arr.length; j++) {

                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
