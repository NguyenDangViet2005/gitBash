import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Max2nd_Min2nd {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            lst.add(sc.nextInt());
        }
        Collections.sort(lst);
        for (int i = 0; i < lst.size(); i++) {
            if(i == 1){
                System.out.print("Min 2nd: ");
                System.out.println(lst.get(i));
            }
            if(i == lst.size()-2){
                System.out.print("Max 2nd: ");
                System.out.println(lst.get(i));
            }
        }
    }
}
