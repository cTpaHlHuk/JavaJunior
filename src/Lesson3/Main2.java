package Lesson3;

public class Main2 {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = {4,5,6,7};

        int [] c = new int[a.length + b.length];
        int count = 0;

        //j,]tlbybnm d 1

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for (int j = 0; j < b.length; j++) {
            c[count++] = b[j];
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        //////////////////////////////

        for (int i = 0; i < c.length; i++) {
            if (i<a.length){
                c[i] = a[i];
            } else {
                c[i] = b[i-a.length];
            }
        }
    }
}
