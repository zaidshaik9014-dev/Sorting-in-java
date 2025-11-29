import java.util.*;
public class SortEvensOnly{
    public static void print(int a[],int n) {
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0) c++;
        }
        int[] even=new int[c];
        int k=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                even[k]=a[i];
                k++;
            }
        }
        for(int i=0;i<c-1;i++){
            for(int j=0;j<c-i-1;j++){
                if(even[j]>even[j+1]){
                    int t=even[j];
                    even[j]=even[j+1];
                    even[j+1]=t;
                }
            }
        }
        k=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                a[i]=even[k];
                k++;
            }
        }
        print(a, n);
    }
}