import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

class Result {

    /*
     * Complete the 'isFibo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static String isFibo(long n) {
        int fibo0 = 0;
        int fibo1 = 1;
        int count = 0;

        long fibobe = fibo0+fibo1; //1
        long fiboaf = fibobe+fibo1;
        long tmp;

        while(true){
            if(n == fibobe){
                return "IsFibo";
            }else if(n < fibobe){
                return "IsNotFibo";
            }
            tmp = fibobe;
            fibobe = fiboaf;
            fiboaf += tmp;
        }
    }

}

public class JavaIsFibo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            long n = Long.parseLong(bufferedReader.readLine().trim());

            String result = Result.isFibo(n);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
