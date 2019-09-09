import java.util.Scanner;

public class w1_2 {
    public static void main(String[] agvs) {
        Scanner in = new Scanner(System.in);
        int[][] a = new int[10][10];
        int[][] sum = new int[10][10];
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = in.nextInt();
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] + a[i][j] - sum[i - 1][j - 1];
            }
        }
        int x = 0, y = 0, max = 0, dx = 0, dy = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = i; k <= n; k++) {
                    for (int o = j; o <= n; o++) {
                        int all = (k - i + 1) * (o - j + 1);
                        if (sum[k][o] + sum[i - 1][j - 1] - sum[i - 1][o] - sum[k][j - 1] == all) {
                            if ((k - i + 1) * (o - j + 1) > max) {
                                x = i-1;
                                y = j-1;
                                dx = k - i + 1;
                                dy = o - j + 1;
                                max = (k - i + 1) * (o - j + 1);
                            }
                        }
                    }
                }
            }
        }
        String output = String.format("position: (%d,%d), order: %d*%d", x, y, dx, dy);
        System.out.println(output);
        in.close();
    }


}