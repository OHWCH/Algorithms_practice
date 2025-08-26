import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int nums = 0;
        
        for(int i = 0; i < n; i++){
            nums += s.charAt(i) - '0';
        }
        
        System.out.println(nums);
    }
}