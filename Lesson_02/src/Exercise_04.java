public class Exercise_04 {
    public static void main(String[] args) {
        //Given an array of N elements, print top k largest elements in the array
        int arr[] = {9,7,10,9,2,8,9,10,5};
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    arr[i] = arr[j];
                }
            }
            System.out.println(arr[i]);
        }
    }
}