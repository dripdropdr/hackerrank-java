import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

class Resultt{
//    ????????????????????????? Solve later
    /*
     * Complete the 'powerSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER X
     *  2. INTEGER N
     */

    public static int powerSum(int X, int N) {
        return find(X, N, 1, 0);
    }

    static int find(int x, int n, int start, int sum) {
        if (sum == x) {
            return 1;
        }
        int res = 0;
        int upTo = (int) Math.pow(x, 1.0 / n) + 1;
        if (sum < x) {
            for (int i = start; (int) Math.pow(i, n) + sum <= x && i <= upTo; i++) {
                res += find(x, n, i + 1, (int) Math.pow(i, n) + sum);
            }
        }
        return res;
    }

}

public class JavaThePowerSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int X = Integer.parseInt(bufferedReader.readLine().trim());

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Resultt.powerSum(X, N);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}