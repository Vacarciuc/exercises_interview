import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main5 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {11, 12, 13, 14},
                {111, 112, 113, 114}
        };
//        for (int i = 0; i <= a.length; i++) {
//            for (int j = a.length;j>=0; j--) {
//                System.out.print(a[i][j] + "\t");
//            }
//            System.out.println();
//        }
        int[] b = {4, 7, 4, 876, 24, 87, 234, 1, 9};
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println();
        for (int k= b.length;k>0;k--) {
            System.out.print(b[k-1]+" ");
        }
        System.out.println();
        Arrays.sort(b);
        for (int j=0; j<b.length; j++){
            System.out.print(b[j]+" ");
        }
        System.out.println();
        for (int k= b.length;k>0;k--) {
            System.out.print(b[k-1]+" ");
        }
    }
}
