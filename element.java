public class element {
    static int getLast(int[] array){
        return array[array.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        System.err.println(getLast(arr));
        
    }
}
