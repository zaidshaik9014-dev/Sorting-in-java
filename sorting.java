//Bubble sort
 import java.util.*;
 public class sorting{
     public static void prntA(int a[]){
         for(int i=0;i<a.length;i++){
             System.out.print(a[i]+" ");
         }
         System.out.println();
     } 
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         int[] a=new int[n];
         for(int i=0;i<n;i++){
             a[i]=sc.nextInt();
         }
           /*bubble sort*/ 
         for(int i=0;i<a.length-1;i++){
             for(int j=0;j<a.length-i-1;j++){
                 if(a[j]>a[j+1]){
                    /*swap*/
                     int t=a[j];
                     a[j]=a[j+1];
                   a[j+1]=t;
                }
            }
        }
        prntA(a);
    }
}

//selection sorting
// import java.util.*;
// public class sorting{
//     public static void prntA(int a[]){
//         for(int i=0;i<a.length;i++){
//             System.out.print(a[i]+" ");
//         }
//         System.out.println();
//     } 

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] a=new int[n];
//         for(int i=0;i<n;i++){
//             a[i]=sc.nextInt();
//         }
//         for(int i=0;i<a.length-1;i++){
//             int smallest=i;
//             for(int j=i+1;j<a.length;j++){
//                 if(a[smallest]>a[j]){
//                     smallest=j;
//                 }
//             }
//             int t=a[smallest];
//             a[smallest]=a[i];
//             a[i]=t;
//         }
//         prntA(a);
//     } 
// }

//insertion sorting