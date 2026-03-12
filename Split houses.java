import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
 
        if (s.contains("HH")) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            System.out.println(s.replace('.', 'B'));
        }
    }
