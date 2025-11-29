// import java.util.*;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r=sc.nextInt(), c=sc.nextInt();
//         int [][] numbers = new int [r][c];
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 numbers[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 System.out.print(numbers[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r=sc.nextInt(), c=sc.nextInt();
//         int [][] num=new int[r][c];

//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 num[i][j]=sc.nextInt();
//             }
//         }
//         int x=sc.nextInt();
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 if(num[i][j]==x){
//                     System.out.println("X found at position("+i+", "+j+")");
//                 }
//             }
//         }
//     }
// }

// import java.util.*;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter rows: ");
//         int r=sc.nextInt();
//         System.out.println("Enter coloumns ");
//         int c=sc.nextInt();
//         int [][] arr=new int[r][c];
//         System.out.println("Enter Matrix elements: ");
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         int max=arr[0][0];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if (arr[i][j] > max) {
//                     max = arr[i][j];
//                 }
//             }
//         }

//         System.out.println("Maximum element = " + max);
//     }
// }

// import java.util.*;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter rows: ");
//         int r = sc.nextInt();

//         System.out.print("Enter cols: ");
//         int c = sc.nextInt();

//         int[][] arr = new int[r][c];

//         System.out.println("Enter matrix elements:");
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         int e=0,o=0;
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 if(arr[i][j]%2==0){
//                     e++;
//                 }else {
//                     o++;
//                 }
//             }
//         }
//         System.out.println("Even count = " + e);
//         System.out.println("Odd count = " + o);
//     }
// }

// import java.util.*;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter rows: ");
//         int r = sc.nextInt();

//         System.out.println("Enter cols: ");
//         int c = sc.nextInt();

//         int[][] arr = new int[r][c];

//         System.out.println("Enter matrix elements:");
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Matrix column wise: ");
//         for (int col = 0; col < c; col++) {
//             for (int row = 0; row < r; row++) {
//                 System.out.print(arr[row][col] + " ");
//             }
//             System.out.println();
//         }

//     }
// }

// import java.util.*;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size (n for n x n matrix): ");
//         int n = sc.nextInt();
//         int [][] a=new int[n][n];
//         System.out.println("Enter matrix elements: ");
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 a[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println("Primary Diagonal: ");
//         for(int i=0;i<n;i++){
//             System.out.print(a[i][i]+ " ");
//         }
//     }
// }

// import java.util.*;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size (n for n x n matrix): ");
//         int n = sc.nextInt();
//         int[][] a = new int[n][n];
//         System.out.println("Enter matrix elements: ");
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 a[i][j]=sc.nextInt();
//             }
//         }
        
//         System.out.print("Secondary Diagonal: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(a[i][n - 1 - i] + " ");
//         }
//     }
// }

// import java.util.*;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter rows: ");
//         int r = sc.nextInt();

//         System.out.print("Enter cols: ");
//         int c = sc.nextInt();

//         int[][] a = new int[r][c];

//         System.out.println("Enter matrix elements:");
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 a[i][j] = sc.nextInt();
//             }
//         }
//         int maxSum=Integer.MIN_VALUE;
//         int maxRowIndex=-1;
//         for(int i=0;i<r;i++){
//             int s=0;
//             for(int j=0;j<c;j++){
//                 s+=a[i][j];
//             }
//             if(s>maxSum){
//                 maxSum=s;
//                 maxRowIndex=i;
//             }
//         }
//         System.out.println("Row with maximum sum = " + maxRowIndex);
//         System.out.println("Maximum sum = " + maxSum);
//     }
// }

// import java.util.*;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter rows: ");
//         int r=sc.nextInt();
//         System.out.println("Enter col: ");
//         int c=sc.nextInt();
//         int [][] a=new int[r][c];
//         System.out.println("Enter matrix elements: ");
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 a[i][j]=sc.nextInt();
//             }
//         }
//         int[][] t=new int[c][r];
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 t[j][i]=a[i][j];
//             }
//         }
//          System.out.println("Transpose:");
//         for (int i = 0; i < c; i++) {
//             for (int j = 0; j < r; j++) {
//                 System.out.print(t[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter rows: ");
//         int r = sc.nextInt();

//         System.out.print("Enter cols: ");
//         int c = sc.nextInt();

//         int[][] a = new int[r][c];

//         System.out.println("Enter matrix elements:");
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 a[i][j] = sc.nextInt();
//             }
//         }
//          int top = 0;
//         int bottom = r - 1;
//         int left = 0;
//         int right = c - 1;

//         System.out.print("Spiral Order: ");

//         while (top <= bottom && left <= right) {
//             for (int i = left; i <= right; i++) {
//                 System.out.print(a[top][i] + " ");
//             }
//             top++;
//             for (int i = top; i <= bottom; i++) {
//                 System.out.print(a[i][right] + " ");
//             }
//             right--;
//             if (top <= bottom) {
//                 for (int i = right; i >= left; i--) {
//                     System.out.print(a[bottom][i] + " ");
//                 }
//                 bottom--;
//             }
//             if (left <= right) {
//                 for (int i = bottom; i >= top; i--) {
//                     System.out.print(a[i][left] + " ");
//                 }
//                 left++;
//             }
//         }
        
//     }
// }

// import java.util.*;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of matrix(n X n): ");
//         int n=sc.nextInt();
//         int[][] a=new int [n][n];
//         System.out.println("Enter matrix elements: ");
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 a[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 int t=a[i][j];
//                 a[i][j]=a[j][i];
//                 a[j][i]=t;
//             }
//         }
//         for(int i=0;i<n;i++){
//             int l=0,r=n-1;
//             while(l<r){
//                 int t=a[i][l];
//                 a[i][l]=a[i][r];
//                 a[i][r]=t;
//                 l++;
//                 r--;
//             }
//         }
//         System.out.println("Rotated Matrix (90° Clockwise):");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(a[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter order of matrix(n X n)");
//         int n=sc.nextInt();
//         int[][] a=new int[n][n];
//         System.out.println("Enter metrix elements: ");
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 a[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 int t=a[i][j];
//                 a[i][j]=a[j][i];
//                 a[j][i]=t;
//             }
//         }
//         for(int j=0;j<n;j++){
//             int top=0,b=n-1;
//             while(top<b){
//                 int t=a[top][j];
//                 a[top][j]=a[b][j];
//                 a[b][j]=t;
//                 top++;
//                 b--;
//             }
//         }
//         System.out.println("Rotated Matrix (90° Counterclockwise):");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(a[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter order of matrix(n X n): ");
//         int n=sc.nextInt();
//         int[][] a=new int[n][n];
//         System.out.println("Enter the matrix elements: ");
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 a[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 int t=a[i][j];
//                 a[i][j]=a[j][i];
//                 a[j][i]=t;
//             }
//         }
//         for(int i=0;i<n;i++){
//             int top=0,b=n-1;
//             while(top<b){
//                 int t=a[top][i];
//                 a[top][i]=a[b][i];
//                 a[b][i]=t;
//                 top++;
//                 b--;
//             }
//         }
//         System.out.println("Rotated Matrix (90° Counterclockwise):");
//                 for (int i = 0; i < n; i++) {
//                     for (int j = 0; j < n; j++) {
//                         System.out.print(a[i][j] + " ");
//                     }
//                     System.out.println();
//                 }
//     }
// }

// import java.util.*;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the order of matrix: ");
//         int n=sc.nextInt();
//         int[][] a=new int[n][n];
//         System.out.println("Enter elements of matrix: ");
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 a[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<n;i++){
//             int l=0,r=n-1;
//             while(l<r){
//                 int t=a[i][l];
//                 a[i][l]=a[i][r];
//                 a[i][r]=t;
//                 l++;
//                 r--;
//             }
//         }
//          for (int i = 0; i < n; i++) {
//                  for (int j = 0; j < n; j++){
//                     System.out.print(a[i][j] + " ");
//                 }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class arrays{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter size of matrix: ");
//         int n=sc.nextInt();
//         int[][] a=new int[n][n];
//         int[][] b=new int[n][n];
//         int[][] c=new int[n][n];
//         System.out.println("Enter the matrix A: ");
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 a[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println("Enter the matrix B: ");
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 b[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 int s=0;
//                 for(int k=0;k<n;k++){
//                     s+=a[i][k]*b[k][j];
//                 }
//                 c[i][j]=s;
//             }
//         }
//         System.out.println("Result Matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++)
//                 System.out.print(c[i][j] + " ");
//             System.out.println();
//         }
//     }
// }

