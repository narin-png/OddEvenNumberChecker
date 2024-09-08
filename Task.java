package oddevenchecker;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("add number:");
        int e = sc.nextInt();
        String check = e % 2 == 0 ? "even" : "odd";
        System.out.println(check);
    }
}
