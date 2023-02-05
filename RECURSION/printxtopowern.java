public class printxtopowern {

  public static int pow(int x, int n) {
        if(n==0){
            return 1;
        }
        return x*pow(x, n-1);
    }
   
//optimized solution
public static int optimizedpow(int x, int n){
    if(n==0){
        return 1;

    }

    int halfpower=optimizedpow(x, n/2);
    int halfpowersq=halfpower * halfpower;
     //if n is odd
     if(n % 2 !=0){
       halfpowersq= x *halfpowersq;
     } 
     return halfpowersq;
}


public static void main(String args[]) {
    System.out.println(optimizedpow(2,5));   
}
}