import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();
        int[] result = new int[26];
        int[] n = new int[s.length];

        for(int i = 0; i < result.length; i++){
            result[i] = 0;
        }

        for(int i = 0;i < s.length; i++){
            n[i] = (int) s[i] - 97;
        }

        for(int i = 0; i < s.length; i++){
            result[n[i]] += 1;
        }

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}