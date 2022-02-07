
// Author  :  Siddhesh Patil (siddhesh1770)
// Time Complexity : 
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. STRING n
     * 2. INTEGER k
     */
    public static int superDigit2(StringBuilder num, int k) {
        if (num.length() == 1)
            return Integer.parseInt(num.toString());
        int ans = 0;
        for (int i = 0; i < num.length(); i++) {
            String temp = Character.toString(num.charAt(i));
            ans += Integer.parseInt(temp);
        }
        num.delete(0, num.length());
        num.append(ans);
        return superDigit2(num, k);
    }

    public static int superDigit(String n, int k) {
        // Write your code here
        StringBuilder hll = new StringBuilder();
        for (int i = 0; i < k; i++)
            hll.append(n);
        return superDigit2(hll, k);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

// Email : hello@siddheshpatil.in
// Websit : https://www.siddheshpatil.in
// GitHub : https://www.github.com/siddhesh1770
// LinkedIn : https://www.linkedin.com/in/siddhesh1770
