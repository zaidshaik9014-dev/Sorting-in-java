// import java.util.*;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         StringBuilder sb=new StringBuilder("TONY");
//         System.out.println(sb);
//         System.out.println(sb.charAt(0));
//         sb.setCharAt(0,'P');
//         System.out.println(sb);
//         sb.insert(0,'S');
//         System.out.println(sb);
//         sb.insert(3,'N');
//         System.out.println(sb);
//         sb.setCharAt(0,'J');
//         sb.setCharAt(1, 'H');
//         System.out.println(sb);
//         sb.delete(3,5);
//         System.out.println(sb);
//         sb.append('h');
//         sb.append('e');
//         sb.append('l');
//         sb.append('o');
//         System.out.println(sb);
//     }
// }

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Hello");

        for(int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char fch = sb.charAt(front);
            char bch = sb.charAt(back);

            sb.setCharAt(front, bch);
            sb.setCharAt(back, fch);
        }

        System.out.println(sb);
    }
}
