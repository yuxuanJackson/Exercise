package experiment3_10_13;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        reffer re = new reffer();
        Scanner scanner = new Scanner(System.in);
        String coursename = scanner.next();
        re.setCo(new course(coursename));
        teaching_material book[] = new teaching_material[1000];
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            String str = scanner.next();
            book[i] = new teaching_material(str);
        }
        re.setBook(book);
        System.out.println(re.toString());
    }
}
