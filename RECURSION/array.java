import javax.swing.text.html.HTMLDocument.RunElement;

public class array {
    //array is sorted or not using recursion

    public static boolean isSorted(int arr[], int i){
        if(i==arr.length -1){
            return true;

        }
        if (arr[i]>arr[i+1]){
            return false;

        }
         return isSorted(arr, i+1);

    }
  
public static void main(String args[]) {
        int arr[]={2,5,6,8};
        System.out.println(isSorted(arr, 0));

    }
}
