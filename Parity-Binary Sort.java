import java.util.*;
 
public class Main {
 
    static int setBits(int n){
        int count = 0;
        while(n > 0){
            count += n % 2;
            n /= 2;
        }
        return count;
    }
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
 
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
 
            ArrayList<Integer> even = new ArrayList<>();
            ArrayList<Integer> odd = new ArrayList<>();
 
            for(int x : arr){
                if(setBits(x) % 2 == 0)
                    even.add(x);
                else
                    odd.add(x);
            }
 
            Collections.sort(even);
            Collections.sort(odd);
 
            for(int x : even) System.out.print(x + " ");
            for(int x : odd) System.out.print(x + " ");
            System.out.println();
        }
    }
}