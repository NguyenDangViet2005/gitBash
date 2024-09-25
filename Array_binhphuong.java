import java.util.ArrayList;
import java.util.Scanner;

public class Array_binhphuong {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        for(int i=0; i<list.size(); i++){
            list.set(i, list.get(i)* list.get(i));
            //đối với arraylist thì phải set lại như này chứ k
            //gán bình thường như array được
        }
        System.out.println(list);
        int count = 0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)> 50){
                count++;
            }
        }
        System.out.println(count);
    }
}
