public class BubbleSort {
    public static void sorting (int []arr){
        for(int i =0;i< arr.length-1;i++){
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    // swaping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int add[];
        int arr[] = {7, 8, 1, 3, 2, 12, 14, 18};
        int arr2[] = {7, 8, 1, 3, 2, 12, 14, 100};
        BubbleSort obj = new BubbleSort();
        obj.sorting(arr);
        obj.sorting(arr2);
    }
}
