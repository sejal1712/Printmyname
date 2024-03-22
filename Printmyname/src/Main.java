import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
        }
        insertion_sort(arr,n);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertion_sort(int[] arr, int n){
        for(int i = 0; i <= n-1; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }
    }
        public static void bubble_sort(int[] arr, int n){
        for(int i = n-1; i >=0; i--){
            for(int j = 0 ; j <= i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        }
}