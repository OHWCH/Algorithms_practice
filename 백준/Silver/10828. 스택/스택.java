import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;

class LinkedListStack{
    private LinkedList<Integer> stack;


    public LinkedListStack(){
        stack = new LinkedList<>();
    }

    void push(int x){
        stack.addFirst(x);
    }

    void pop(){
        if(stack.isEmpty() == true) System.out.println(-1);
        else
        {
            System.out.println(stack.peek());
            stack.removeFirst();
        }
    }

    void size(){
        System.out.println(stack.size());
    }

    void empty(){
        if(stack.isEmpty() == true) System.out.println(1);
        else System.out.println(0);
    }

    void top(){
        if(stack.isEmpty() == true) System.out.println(-1);
        else System.out.println(stack.peek());
    }
}

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedListStack stack = new LinkedListStack();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String[] line = br.readLine().split(" ");

            switch(line[0]){
                case "push":
                    stack.push(Integer.parseInt(line[1]));
                    break;
                case "pop":
                    stack.pop();
                    break;
                case "size":
                    stack.size();
                    break;
                case "empty":
                    stack.empty();
                    break;
                case "top":
                    stack.top();
                    break;
            }
        }
    }
}
