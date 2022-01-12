package Test;

public class Test {

    public static void main(String[] args) {
        int a[] = new int[]{10, 20, 30, 40, 50};
        int b[] = new int[a.length - 1];
        int pos = 2;

        for (int i = 0; i < b.length; i++) {
            //b[i]=a[i]
            if (i >= pos - 1) {
                b[i] = a[i + 1];
            } else {
                b[i] = a[i];
            }
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
