package experiment2_9_22;

import java.util.Scanner;

public class mostnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个大于零的整数: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Tool t = new Tool();
        t.collate(a,b);
    }
}

class Tool {
    public void collate(int a, int b) {
        if (a > b) {
            int t = b;
            b = a;
            a = t;
        } else {
            while (a % b > 0) {
                int c = a % b;
                a = b;
                b = c;
            }
            System.out.println("最大公因数是： " + b);
        }
    }
}
