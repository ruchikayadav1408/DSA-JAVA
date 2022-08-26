public class array{
  public static int search(int array[][] , int key){
    int n=array.length;
    int m=array[0].length;
     int count=0;
  for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        if (array[i][j]==key){
             count++;
        }
        else {
              System.out.println("NOT found");
       }
    }
  }
return count;
  }

    public static void main(String args[]) {

       int array[][] = { {4,6,8,5},{8,8,7,4} };
       int key=8;
       System.out.println(search(array, key));
        
    }
}