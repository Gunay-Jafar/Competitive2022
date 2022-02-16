package LeetCode.Math;

public class Task1266 {
    public static void main(String[] args) {
        int[][] points = {{3, 2}, {-2, 2}};

        int seconds = 0;

        for (int i = 0; i < points.length - 1; i++) { //i=0
            int arrFist[] = points[i];
            int arrLast[] = points[i + 1];
            int sec1 = Math.abs(arrLast[0] - arrFist[0]);
            int sec2 = Math.abs(arrLast[1] - arrFist[1]);
            if (sec1 > sec2)
                seconds += sec1;
            else
                seconds += sec2;
        }
        System.out.println(seconds);
    }
}
