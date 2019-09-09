import java.util.Scanner;

public class w1_1 {
    public static void main(String[] args) {
        int m, n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        in.nextLine();
        String[] pro = { "A", "C", "D", "E", "G" };
        while (n != 0 && m != 0) {
            String[] s = new String[n];
            int count[] = { 0, 0, 0, 0, 0 };
            for (int i = 0; i < 5; i++) {
                count[i] = 0;
            }
            for (int i = 0; i < n; i++) {
                s[i] = in.nextLine();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m ; j++) {
                    char t = s[i].charAt(j);
                    if (t == 'A')
                        count[0]++;
                    if (t == 'C')
                        count[1]++;
                    if (t == 'D')
                        count[2]++;
                    if (t == 'E')
                        count[3]++;
                    if (t == 'G')
                        count[4]++;
                }
            }
            for (int i = 0; i < 5; i++) {
                int max = -1;
                int max_index = -1;
                for (int j = 0; j < 5; j++) {
                    if (count[j] > max) {
                        max_index = j;
                        max = count[j];
                    }
                }
                if (max == 0)
                    break;
                System.out.print(pro[max_index] + " ");
                System.out.print(max);
                System.out.print(" ");
                count[max_index] = -1;
            }
            System.out.println();
            n = in.nextInt();
            m = in.nextInt();
            in.nextLine();
        }
        in.close();
    }
}