import java.util.Scanner;
public class w1_3 {
    public static void main(String[] agvs) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        while (!s.equals("")) {
            String[] ss = s.split(" ");
            for (int i = 0; i < ss.length; i++) {
                String t = new StringBuilder(ss[i]).reverse().toString();
                ss[i] = t;
                System.out.print(ss[i] + " ");
            }
            System.out.println();
            s = in.nextLine();
        }
        in.close();
    }


}