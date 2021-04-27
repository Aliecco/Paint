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
        
        for(int i=0;i<count;i++){
            
            arr[i]=a + (int) (Math.random() * (b-a+1));
        }
        for(int i=0;i<count;i++){
            
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        
        System.out.println("Вид сортировки:"+"/n"+"1-bubble"+"/n"+"2-insertion");
        
        int choice = scn.nextInt();
        if(choice==1){
            bubblesort(arr);
        }
        else if(choice==2){
            insertionsort(arr);
        }
        
        for(int i=0;i<count;i++){
            
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] bubblesort(int[] a){
        
        int b;
        boolean t=true;
        while(t){
            t=false;
            for(int i=0; i<a.length-1; i++ ){
                if(a[i]>a[i+1]){
                    b=a[i];
                    a[i]=a[i+1];
                    a[i+1]=b;
                    t=true;
                }
            }
        }
        return a;
    }
    public static int[] insertionsort(int[] a){
        int b;
        for(int i=1;i<a.length;i++){
            for(int j=i-1;j>=0;j--){
                if(a[j]>a[j+1]){
                    b=a[j];
                    a[j]=a[j+1];
                    a[j+1]=b;
                }
            }
        }
        return a;
    }
    
}
