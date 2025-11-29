import java.util.*;

public class SortStrings {

    public static void print(String[] a, int n){
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] a = new String[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextLine();
        }

        Arrays.sort(a);

        print(a, n);
    }
}
