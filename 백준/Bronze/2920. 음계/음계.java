import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] scale = new int[8];
        for(int i = 0; i < 8; i++){
            scale[i] = Integer.parseInt(s[i]);
        }
        
        int count = 8;

        for(int i = 0; i < scale.length; i++){
            if(scale[i] == (i+1)){
                count++;
            }
            else if(scale[i] == (8-i)){
                count--;
            }
        }
        
        if(count == 16) System.out.println("ascending");
        else if(count == 0) System.out.println("descending");
        else System.out.println("mixed");
    }
}