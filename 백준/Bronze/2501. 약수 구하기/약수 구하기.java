import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int j = n % i;
            if(j == 0){
                list.add(i);
            }
        }

        if(list.size() < k) System.out.println(0);
        else System.out.println(list.get(k-1));

    }
}