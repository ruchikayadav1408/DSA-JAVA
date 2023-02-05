public class firstoccurance {
    //first occurance of an element in an array

    public static int firstocc(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        
        if(arr[i]==key){
            return i;

        }
         return firstocc(arr, key, i+1);
    }
     public static void main(String args[]) {
        int arr[]={3,4,6,7,5,9,5,1};
        System.out.println(firstocc(arr, 5, 0));


        
     }
    
}
