import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        int last = 0;

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            switch (tokens[0]) {
                case "push":
                    last = Integer.parseInt(tokens[1]);
                    q.add(last);
                    break;
                case "pop":
                    if (q.isEmpty()) {
                        System.out.println(-1);
                    }else{
                        System.out.println(q.poll());
                    }
                    break;
                case "size":
                    if (q.isEmpty()) {
                        System.out.println(0);
                    }else{
                        System.out.println(q.size());
                    }
                    break;
                case "empty":
                    if (q.isEmpty()) {
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if (q.isEmpty()) {
                        System.out.println(-1);
                    }else{
                        System.out.println(q.peek());
                    }
                    break;
                case "back":
                    if (q.isEmpty()) {
                        System.out.println(-1);
                    }else{
                        System.out.println(last);
                    }
                    break;
            }
        }
    }
}