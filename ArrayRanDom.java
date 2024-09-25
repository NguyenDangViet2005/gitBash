import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class ArrayRanDom {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n;
        System.out.println("nhap vao so luong phan tu cua mang: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            int ngaunhien;
            do {
                ngaunhien = rd.nextInt(100);
                if (i == 0 || ngaunhien != arr.get(i - 1)) {
                    arr.add(ngaunhien);
                    break;
                }
            } while (true);
        }
        System.out.println(arr);
    }
}


