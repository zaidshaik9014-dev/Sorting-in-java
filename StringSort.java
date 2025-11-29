import java.util.*;
public class StringSort{
    public static void print(String[] a, int n) {
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] a=new String[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLine();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j].compareTo(a[j+1])>0){
                    String t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        print(a, n);
    }
}