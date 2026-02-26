package arrays1;

import java.util.Scanner;

public class Arrays1 {
    public int[] data;
    public int n;

    public Arrays1(int n) {
        this.n = n;
        this.data = new int[n];
    }
    public String get(String name) {
        String result = name + " = [ ";
        for (int i = 0; i < n; i++) {
            result += data[i];
            if (i < n - 1) {
                result += ", ";
            }
        }
        result += " ]";
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamano n : ");
        int n = sc.nextInt();
        
        Arrays1 v = new Arrays1(n);

        for (int i = 0; i < n; i++) {
            System.out.print(" v [ " + i + " ]: ");
            v.data[i] = sc.nextInt();
        }
        String representacion = v.get("v");
        System.out.println(representacion);
    }
}