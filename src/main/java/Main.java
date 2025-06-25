import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args){
        int n = readInput(), result = 0;
        for (int i = 0; i <= n; i++) result = i % 2 == 0 ? result + i : result;
        System.out.println(result);
    }

    public static int readInput(){
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) n = parseInt(scanner.nextLine());
        scanner.close();
        return n;
    }
}
