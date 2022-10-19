package experiment2_9_22;

public class collate_arry {
    public static void main(String[] args) {
        int[] arry =  {2, 4, 5, 1, 3};
        Tool2 t =new Tool2();
        t.collate(arry);
    }
}

class Tool2 {
    public void collate(int[] arry) {
        int min;
        for (int i = 0; i < arry.length; i++) {
            min = i;
            for (int j = i + 1; j < arry.length; j++) {
                if (arry[j] < arry[min]) {
                    min = j;
                }
            }
            int t = arry[i];
            arry[i] = arry[min];
            arry[min] = t;
        }
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + " ");
        }
    }
}
