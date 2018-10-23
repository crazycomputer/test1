import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = 1, x;
        int max = 0;
        int[] a = new int[200];
        int[] b = new int[200];
        int[] sum = new int[200];
        while (n != 0) {
            n = in.nextInt();
            x = in.nextInt();
            if (n > max) {
                max = n;
            }
            a[n] = x;
        }
        n = 1;
        while (n != 0) {
            n = in.nextInt();
            x = in.nextInt();
            if (n > max) {
                max = n;
            }
            b[n] = x;
        }

        for (int i = max; i >= 0; i--) {
            sum[i] = a[i] + b[i];
        }

        boolean isMax = false;
        boolean hasOut = false;
        for (int i = max; i > 0; i--) {
            if (sum[i] != 0) {
                hasOut = true;
                if (!isMax) {
                    if (i != 1) {
                        System.out.print(((sum[i] == 1) ? "" : sum[i]) + "x" + i);
                    } else {
                        System.out.print(((sum[i] == 1) ? "" : sum[i]) + "x");
                    }
                    isMax = true;
                } else {
                    if (i != 1) {
                        System.out.print(((sum[i] < 0) ? "" : "+") + ((sum[i] == 1) ? "" : sum[i]) + "x" + i);
                    } else {
                        System.out.print(((sum[i] < 0) ? "" : "+") + ((sum[i] == 1) ? "" : sum[i]) + "x");
                    }
                }

            }
        }
        if ((sum[0] != 0) || ((sum[0] == 0) && !hasOut)) {
            if (isMax) {
                System.out.print(((sum[0] < 0) ? "" : "+") + sum[0]);
            } else {
                System.out.print(sum[0]);
            }
        }
    }
}