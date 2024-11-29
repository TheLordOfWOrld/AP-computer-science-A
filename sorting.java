public class sorting {
    public static void SelectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    
    }

    public static void BoublesSort(int[] arr){
        int temp = 0;
        for(int i = 0 ; i  < arr.length-1; i++){
            for(int j = 0; j < arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
    }

}
public static void insertionSort(int[] arr) {
    // 从第二个元素开始，因为第一个元素默认是有序的
    for (int i = 1; i < arr.length; i++) {
        // 待插入的元素
        int key = arr[i];
        // 初始化插入位置的索引
        int j = i - 1;
        
        // 将比key大的元素向后移动一位
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        
        // 将key插入到正确的位置
        arr[j + 1] = key;
    }
}
    public static void main(String[] args) {
        int[] arr = { 1,4,52,1,3,5,7,2,6};
        int[][] arrs = {{1,2,3},{45,2,45}};
        sorting.BoublesSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
