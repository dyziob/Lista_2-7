package Lab4;

import java.util.Random;

public class Zad8 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] nr = new int[12][12];
        int[][] randomnr = new int[12][12];
        int[][] res = new int[12][12];

        for (int r = 0; r < nr.length; r++) {
            for (int cl = 0; cl < nr[0].length; cl++) {
                if (r == 0) {
                    nr[r][cl] = cl;
                } else if (cl == 0) {
                    nr[r][cl] = r;
                } else if (r == cl) {
                    nr[r][cl] = r;
                } else {
                    nr[r][cl] = random.nextInt(100);
                }
                randomnr[r][cl] = random.nextInt(100);
                res[r][cl] = nr[r][cl] + randomnr[r][cl];
            }
        }

        for (int r = 0; r < res.length; r++) {
            for (int cl = 0; cl < res[0].length; cl++) {
                System.out.print(res[r][cl] + "\t");
            }
            System.out.println();
        }
    }
}