import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        System.out.println("Следующее четное за "+x+" число:"+(x/2+1)*2);
    }
}