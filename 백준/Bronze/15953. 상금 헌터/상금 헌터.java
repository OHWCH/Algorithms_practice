import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int p1, p2, sum;
        for(int i = 0; i < n; i++){
            String[] number = br.readLine().split(" ");
            int k = Integer.parseInt(number[0]);
            int j = Integer.parseInt(number[1]);
            
            if(k == 0) p1 = 0;
            else if(k == 1) p1 = 5000000;
            else if(k <= 3) p1 = 3000000;
            else if(k <= 6) p1 = 2000000;
            else if(k <= 10) p1 = 500000;
            else if(k <= 15) p1 = 300000;
            else if(k <= 21) p1 = 100000;
            else p1 = 0;

            if(j == 0) p2 = 0;
            else if(j == 1) p2 = 5120000;
            else if(j <= 3) p2 = 2560000;
            else if(j <= 7) p2 = 1280000;
            else if(j <= 15) p2 = 640000;
            else if(j <= 31) p2 = 320000;
            else p2 = 0;

            sum = p1 + p2;
            System.out.println(sum);
        }
    }
}
