import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");

        int[] number = new int[n];
        for(int i = 0; i < n; i++){
            number[i] = Integer.parseInt(s[i]);
        }

        int[] numbers = new int[n];
        int[] numberp = new int[n];
        int[] result = new int[n];
        result[0] = number[0];
        numbers[0] = number[0];

        for(int i = 0; i < n; i++){
            numberp[i] = number[i] * (i+1);
        }


        for(int i = 1; i < n; i++){
            result[i] = numberp[i] - numbers[i-1];
            numbers[i] = result[i] + numbers[i-1];
        }

        for(int i = 0; i < n; i++){
            System.out.print(result[i] + " ");
        }
    }
}