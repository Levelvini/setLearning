package aplication;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("quantos estudantes tem no curso a? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        System.out.println("a = " + a.size());
        System.out.print("quantos estudantes tem no curso b? ");
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }  System.out.println("b = " + b.size());
        System.out.print("quantos estudantes tem no curso c? ");
        int o = sc.nextInt();
        for (int i = 0; i < o; i++) {
            c.add(sc.nextInt());
        }  System.out.println("c = " + c.size());
        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("total "+ total.size());

        sc.close();
    }
}
