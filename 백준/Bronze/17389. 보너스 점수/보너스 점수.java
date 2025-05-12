import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        char[] arr = s.toCharArray();
        int score = 0;
        int bonus = 0;
        int sum = 0;

        if(arr.length == 1){
            if(arr[0] == 'O') System.out.println(1);
            else System.out.println(0);
        }
        else {
            for (int i = 0; i < n; i++) {
                if (arr[i] == 'O') {
                    bonus++;
                    score += (i + 1) + bonus - 1;
                    sum = score;
                } else {
                    bonus = 0;
                }
            }
            System.out.println(sum);
        }
    }
}