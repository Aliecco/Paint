import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alisher
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int count = scn.nextInt();
        int[] arr = new int [count];
        
        
        int a = 0;
        int b = 100;
        
        for(int x=0;x<count;x++){
            
            arr[x]=a + (int) (Math.random() * (b-a+1));
        }
        
        System.out.println(arr);
        int[] x = bubble(arr);
        System.out.println(x);
    }
    public static int[] bubble(int[] a){
        for(int i=0; i<a.length; i++ ){
            a[i]=0;
        }
        return a;
    }
    
}
