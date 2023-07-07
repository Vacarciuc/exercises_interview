/**change a column*/
public class Main4 {
    public static void main(String[] args) {
        int numb1=1;
        int numb2=2;

        int[][] a={
                {1,2,3,4},
                {11,12,13,14},
                {111,112,113,114}
        };
        int[][]a1=new int[a.length][a.length];

        for (int i=0;i<a.length;i++){
            for (int j=0;j<=a.length;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println(a[0][numb1]+"<>"+a[0][numb2]);
            for (int i=0;i<a.length;i++) {
                a1[i][numb1]=a[i][numb1];
                a[i][numb1]=a[i][numb2];
                a[i][numb2]=a1[i][numb1];
            }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<=a.length;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
