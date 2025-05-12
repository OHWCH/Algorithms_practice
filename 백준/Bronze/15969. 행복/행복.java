import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i < n; i++){
            int score = Integer.parseInt(s[i]);
            list.add(score);
        }
        int Max = Collections.max(list);
        int Min = Collections.min(list);
        int result = Max - Min;
        
        System.out.println(result);

    }
}