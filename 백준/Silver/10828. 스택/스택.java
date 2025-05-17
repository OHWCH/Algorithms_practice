import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;

class LinkedListQueue{
    LinkedList<Integer> Queue;

    public LinkedListQueue(){
        Queue = new LinkedList<>();
    }

    public void push(int x){
        Queue.addLast(x);
    }

    public void pop(){
        if(Queue.isEmpty()) System.out.println(-1);
        else {
            System.out.println(Queue.peek());
            Queue.removeFirst();
             }
    }

    public void size(){
        System.out.println(Queue.size());
    }

    public void empty(){
        if (Queue.isEmpty()) System.out.println(1);
        else System.out.println(0);
    }

    public void front(){
        if(Queue.isEmpty()) System.out.println(-1);
        else System.out.println(Queue.peek());
    }

    public void back(){
        if(Queue.isEmpty()) System.out.println(-1);
        else System.out.println(Queue.peekLast());
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        LinkedListQueue queue = new LinkedListQueue();

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            
            switch (s[0]) {
                case "push":
                    queue.push(Integer.parseInt(s[1]));
                    break;
                case "pop":
                    queue.pop();
                    break;
                case "size":
                    queue.size();
                    break;
                case "empty":
                    queue.empty();
                    break;
                case "front":
                    queue.front();
                    break;
                case "back":
                    queue.back();
                    break;
            }
        }
    }
}
