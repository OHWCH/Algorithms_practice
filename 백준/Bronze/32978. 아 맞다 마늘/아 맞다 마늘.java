import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ingredients = new String[n];
        String[] ingredients2 = new String[n];
        for (int i = 0; i < n; i++) {
            ingredients[i] = sc.next();
        }
        for (int i = 0; i < n-1; i++) {
            ingredients2[i] = sc.next();
        }

        int[] diff = new int[n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n-1; j++) {
                if(ingredients[i].equals(ingredients2[j])) {
                    diff[i]++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if(diff[i] == 0){
                System.out.println(ingredients[i]);
            }
        }
    }
}