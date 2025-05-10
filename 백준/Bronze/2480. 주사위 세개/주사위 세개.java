import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] number = br.readLine().split(" ");
        int d1 = Integer.parseInt(number[0]);
        int d2 = Integer.parseInt(number[1]);
        int d3 = Integer.parseInt(number[2]);
        int result = 0;

        if(d1==d2 && d1==d3){
            result = 10000 + d1 * 1000;
        }
        else if(d1==d2){
            result = 1000 + d1 * 100;
        }
        else if(d2==d3){
            result = 1000 + d2 * 100;
        }
        else if(d1==d3){
            result = 1000 + d1 * 100;
        }
        else{
            if(d1 > d2){
                if(d1 > d3) result = d1 * 100;
                else result = d3 * 100;
            }
            else if(d2 > d3){
                if(d2 > d1) result = d2 * 100;
                else result = d1 * 100;
            }
            else if(d3 > d1){
                if(d3 > d2) result = d3 * 100;
                else result = d2 * 100;
            }
        }
        System.out.println(result);
    }
}