
// import java.util.Scanner;

// public class ptrns{
//     public static void main(String [] args){
//          Scanner sc=new Scanner(System.in);
//          int n=sc.nextInt();
//          for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.err.print("*");
//             }
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//          }
//           for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.err.print("*");
//             }
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//          }
//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=i;j>=1;j--){
//                 System.out.print(j);
//             }
//             for(int j=2;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             for(int j=i-1;j>=1;j--){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();

//     for (int i = 1; i <= n; i++) {
//         for (int s = 1; s <= n - i; s++) System.out.print(" ");
//             System.out.print("*");
//             if (i > 1) {
//                 for (int sp = 1; sp <= 2*i - 3; sp++) System.out.print(" ");
//         System.out.print("*");
//     }
//     System.out.println();
// }

//     for (int i = n - 1; i >= 1; i--) {
//         for (int s = 1; s <= n - i; s++) System.out.print(" ");
//         System.out.print("*");
//         if (i > 1) {
//         for (int sp = 1; sp <= 2*i - 3; sp++) System.out.print(" ");
//         System.out.print("*");
//     }
//     System.out.println();
// }

//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++) System.out.print("*");
//             for(int s=1;s<=2*(n-i);s++) System.out.print(" ");
//             for(int j=1;j<=i;j++) System.out.print("*");
//             System.out.println();
//         }
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++) System.out.print("*");
//             for(int s=1;s<=2*(n-i);s++) System.out.print(" ");
//             for(int j=1;j<=i;j++) System.out.print("*");
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt(),num=1;

// for (int i = 1; i <= n; i++) {
//     for (int j = 1; j <= i; j++) {
//         System.out.print(num++ + " ");
//     }
//     System.out.println();
// }

//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int s=1;s<=n-i;s++){
//                 System.out.print(" ");
//             }
//             for(int s=1;s<=i;s++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=n;i>=1;i--){
//             for(int s=1;s<=n-i;s++){
//                 System.out.print(" ");
//             }
//             for(int s=1;s<=i;s++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int s=1;s<=n-i;s++){
//                 System.out.print(" ");
//             }
//             for(int s=1;s<=i;s++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt(),s=1;
//         for(int i=0;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(s+" ");
//                 s++;
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             if (i%2==0) {
//                 for(int j=1;j<=i;j++){
//                     System.out.print("*");
//                 }
//             }else{
//                 for(int s=1;s<=i;s++){
//                     System.out.print(i);
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             int a=2;
//             for(int j=1;j<=i;j++){
//                 System.out.print(a);
//                 a+=2;
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             if(i%2==1){
//                 for(int j=1;j<=i;j++){
//                     System.out.print("*");
//                 }
//             }else {
//                 for(int j=1;j<=i;j++){
//                     System.out.print(i);
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==1||i==n||j==1||j==n) System.out.print("*");
//                 else System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class ptrns {
//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = 1; i <= n; i++) {

//             for (int j = 1; j <= i; j++) {
//                 if (i == n || j == 1 || j == i)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }

//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             char ch='A';
//             for(int j=1;j<=i;j++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             char ch = (char)('A'+(n-i));
//             for(int j=1;j<=i;j++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=3;i++){
//             for(int j=1;j<=n;j++){
//                 if((i+j)%4==0 || i==2 && j%4==0){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             if(i%2==1){
//                 char ch='A';
//                 for(int j=1;j<=i;j++){
//                     System.out.print(ch);
//                     ch++;
//                 }
//             }else{
//                 for(int j=1;j<=i;j++){
//                     System.out.print(j);
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             char ch=(char)('A'+(i-1));
//             for(int j=1;j<=i;j++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class ptrns{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         char ch = 'A';
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }

import java.util.*;
public class ptrns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String ch="AB";
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}