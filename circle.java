package experiment2_9_22;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        System.out.println("输入参加报数的人数： ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Tool3 t = new Tool3();
        t.lastone(num);
    }
}

class Tool3 {
    public void lastone(int n) {
        int num = n;
        int count = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = 1;
        }
        for (int i = 0; ; i++) {
            if (i == n) {
                i = 0;
            }
            if (a[i] == 1) {
                count += 1;
            } else {
                continue;
            }
            if (count % 3 == 0) {
                a[i] = 0;
                num -= 1;
            }
            if (num == 1) {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                System.out.println("最后留下来的是第 " + (i+1) + " 位");
            }
        }
    }
}