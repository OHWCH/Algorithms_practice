import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            switch (tokens[0]) {
                case "push":
                    stack.push(Integer.parseInt(tokens[1]));
                    break;
                case "pop":
                    if(stack.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(stack.pop());
                    }
                    break;
                case "size":
                    if(stack.isEmpty()){
                        System.out.println(0);
                    }else{
                        System.out.println(stack.size());
                    }
                    break;
                case "empty":
                    if(stack.isEmpty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;
                case "top":
                    if(stack.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(stack.peek());
                    }
                    break;
            }
        }
        br.close();
    }
}