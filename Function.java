// import java.util.*;
// public class Function{
//     public static void pMyName(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();
//         pMyName(name);
//     }
// }

// import java.util.*;
// public class Function{
//     public static int calSum(int a,int b){
//         int sum=a+b;
//         return sum;
//     } 
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calSum(a, b);
//         System.out.println(sum);
//     }
// }

// import java.util.*;
// public class Function{
//     public static int calPro(int a,int b){
//         return a*b;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println(calPro(a,b));
//     }
// }

// import java.util.*;
// public class Function{
//     public static void fact(int n){
//         int fact = 1;
//         for(int i=n;i>=1;i--){
//             fact = fact*i;
//         }
//         System.out.println(fact);
//         return;
//     } 
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         fact(n);
//     }
// }

// import java.util.*;
// public class Function {
//     public static int max(int a, int b) {
//         return (a > b) ? a : b;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println(max(n, b));
//     }
// }

// import java.util.*;
// public class Function{
//     public static boolean isEven(int n){
//         return n%2==0;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(isEven(n) ? "Even" : "Odd");
//     }
// }

// import java.util.*;
// public class Function{
//     public static int sum(int n){
//         return n*(n+1)/2;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(sum(n));
//     }
// }

// import java.util.*;
// public class Function{
//     public static int reverse(int n){
//         int rev = 0;
//         while(n!=0){
//             rev=rev*10+n%10;
//             n/=10;
//         }
//         return rev;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(reverse(n));
//     }
// }

// import java.util.*;
// public class Function{
//     public static boolean prime(int n){
//         if(n<=1) return false;
//         for(int i=2;i*i<=n;i++){
//             if(n%i==0) return false;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(prime(n)?"Prime":"Not Prime");
//     }
// }

// import java.util.*;
// public class Function{
//     public static boolean pal(int n){
//         int o=n,rev=0;
//         while(n>0){
//             rev=rev*10+n%10;
//             n/=10;
//         }
//         return rev==o;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(pal(n)?"Palindrome":"Not palindrome");
//     }
// }

// import java.util.*;
// class Main {
//     static void printFibonacci(int n) {
//         int a = 0, b = 1;
//         System.out.print(a + " " + b + " ");
//         for (int i = 2; i < n; i++) {
//             int c = a + b;
//             System.out.print(c + " ");
//             a = b;
//             b = c;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         printFibonacci(n);
//     }
// }

// import java.util.*;
// public class Function{
//     public static int cd(int n){
//         int c=0;
//         while(n!=0){
//             n/=10;
//             c++;
//         }
//         return c;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(cd(n));
//     }
// }

// import java.util.*;
// public class Function{
//     public static int power(int b, int e){
//         int res=1;
//         for(int i=1;i<=e;i++){
//             res*=b;
//         }
//         return res;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int b = sc.nextInt(), e = sc.nextInt();
//         System.out.println(power(b, e));
//     }
// }

// import java.util.*;
// public class Function{
//     public static int sud(int n){
//         int s=0;
//         while(n>0){
//             s+=n%10;
//             n/=10;
//         }
//         return s;
//     }
//     public static void main(String[] agrs){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(sud(n));
//     }
// }

// import java.util.*;
// class Main {
//     static boolean isArmstrong(int n) {
//         int temp = n, sum = 0, digits = 0;
//         int t = n;
//         while (t != 0) {
//             digits++;
//             t /= 10;
//         }
//         while (n != 0) {
//             int r = n % 10;
//             sum += Math.pow(r, digits);
//             n /= 10;
//         }
//         return sum == temp;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(isArmstrong(n) ? "Armstrong" : "Not Armstrong");
//     }
// }

// import java.util.*;
// public class Function{
//     public static void swap(int a, int b){
//         a=a+b;
//         b=a-b;
//         a=a-b;
//         System.out.println("Swaped: a="+a+" "+"b="+b);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt(),b = sc.nextInt();
//         swap(a, b);   
//     }
// }

// import java.util.*;
// public class Function{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         float p = sc.nextFloat(),t = sc.nextFloat(),r = sc.nextFloat();
//         float si = (p*t*r)/100;
//         System.out.println(si);
//     }
// }

// import java.util.*;
// public class Function{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n>0) System.out.println("Positive");
//         else if(n<0) System.out.println("Negetive");
//         else System.out.println("Zero");   
//     }
// }

// import java.util.*;
// public class Function{
//     public static int pro(int n){
//         int pro = 1;
//         while(n>0){
//             pro*=n%10;
//             n/=10;
//         }
//         return pro;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(pro(n));
//     }
// }

// import java.util.*;
// class Function {
//     static boolean isPerfect(int n) {
//         int sum = 0;
//         for(int i=1; i<=n/2; i++)
//             if(n%i==0) sum+=i;
//         return sum==n;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(isPerfect(n) ? "Perfect" : "Not Perfect");
//     }
// }

// import java.util.*;
// public class Function{
//     public static boolean isPer(int n){
//         int s=0;
//         for(int i=1;i<=n/2;i++){
//             if(n%i==0) s+=i;
//         }
//         return s==n;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter number to number range: ");
//         int start = sc.nextInt();
//         int end = sc.nextInt();
//         for(int i = start; i <= end; i++){
//             if(isPer(i)) System.out.print(i + " ");
//         }
//     }
// }

// import java.util.*;
// public class Function{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int m = sc.nextInt();
//         System.out.println(m/60+" hours"+" "+m%60+" min");
//     }
// }

// import java.util.*;
// public class Function{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double r = sc.nextDouble();
//         System.out.println(3.14*r*r);
//     }
// }

// import java.util.*;
// public class Function{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(n%10==5?"yes":"no");   
//     }
// }

// import java.util.*;
// public class Function{
//     public static boolean check(int n){
//         int s=0;
//         while(n>0){s+=n%10;n/=10;}
//         return s%2==0;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println(check(sc.nextInt())?"Even sum":"Odd sum");
//     }
// }

// import java.util.*;
// public class Function{
//     public static int rev(int n){
//         int r=0;
//         while(n>0){r=r*10+n%10; n/=10; }
//         return r;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println(rev(sc.nextInt()));
//     }
// }

// import java.util.*;
// public class Function{
//     public static int coEven(int n){
//         int c=0;
//         while(n>0){
//             if((n%10)%2==0) c++;
//             n/=10;
//         }
//         return c;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println(coEven(sc.nextInt()));
//     }
// }

// import java.util.*;
// public class Function{
//     public static boolean isAutomorphic(int n){
//         int sq=n*n;
//         int t=n;
//         while(t>0){
//             if(sq%10 != t%10) return false;
//             sq/=10;
//             t/=10;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println(isAutomorphic(sc.nextInt())?"Autoporphic":"Not Automorphic");
//     }
// }

// import java.util.*;
// public class Function{
//     public static int sqSum(int n){
//         int s=0;
//         while(n>0){
//             int d=n%10;
//             s+=d*d;
//             n/=10;
//         }
//         return s;
//     }
//     public static boolean isHappy(int n){
//         while(n!=1 && n!=4){
//             n=sqSum(n);
//         }
//         return n==1;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println(isHappy(sc.nextInt())?"HAPPY":"NOT HAPPY");
//     }
// }

// import java.util.*;
// public class Function{
//     public static boolean isPrime(int n){
//         if(n<2) return false;
//         for(int i=2;i*i<=n;i++){
//             if(n%i==0) return false;
//         }
//         return true;
//     }
//     public static boolean isPal(int n){
//         int rev=0,t=n;
//         while(t>0){
//             rev=rev*10+t%10;
//             t/=10;
//         }
//         return rev==n;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt(), b=sc.nextInt();
//         for(int i=a;i<=b;i++){
//             if(isPrime(i)&&isPal(i)) System.out.println(i+" ");
//         }
//     }
// }

// import java.util.*;
// public class Function{
//     public static boolean check(int n){
//         int s=0,p=1,t=n;
//         while(t>0){
//             int d=t%10;
//             s+=d;
//             p*=d;
//             t/=10;
//         }
//         return s==p;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt(),b=sc.nextInt();
//         for(int i=a;i<=b;i++){
//             if(check(i)) System.out.println(i+ " ");
//         }
//     }
// }

// import java.util.*;
// public class Function{
//     public static int dSm(int n){
//         int s=0;
//         while(n>0){s+=n%10; n/=10;}
//         return s;
//     }
//     public static boolean isHarshad(int n){
//         return n%dSm(n) == 0;
//     }
//     public static int rev(int n){
//         int r=0;
//         while(n>0){r+=n%10; n/=10; }
//         return r;
//     }
//     public static boolean isPri(int n){
//         if(n>2) return false;
//         for(int i=2;i*i<=n;i++){
//             if(n%i==0) return false;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt(), b=sc.nextInt();
//         for(int i=a;i<=b;i++){
//             if(isHarshad(i) && isPri(rev(i)))
//                 System.out.println(i+" ");
//         }
//     }
// }

import java.util.*;
public class Function{
    public static boolean valid(int n){
        int t=n;
        while(t>0){
            int d=t%10;
            if(d==0 || n%d!=0) return false;
            t/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        for(int i=a;i<=b;i++){
            if(valid(i)) System.out.println(i+" ");
        }
    }
}