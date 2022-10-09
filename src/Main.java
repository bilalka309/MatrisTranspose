import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dizi Satır sayısını giriniz : ");
        int n = in.nextInt();
        System.out.println("Dizi Sütun sayısını giriniz : ");
        int v = in.nextInt();

        int[][] dizi = new int[n][v];
        int[][] diziTranspose=new int[v][n];
        for (int i = 0; i < dizi.length; i++) {
            for (int k=0;k<dizi[0].length;k++){
            System.out.println(i+".satır " +k+".sütunun "+ " eleman sayısını giriniz : ");
            dizi[i][k] = in.nextInt();
            }
        }
        for (int i = 0; i < diziTranspose.length; i++) {
            for (int j = 0; j < diziTranspose[0].length; j++) {
                diziTranspose[i][j]=dizi[j][i];
            }
        }
        System.out.println("Dizi : ");
        for (int[] k :
             dizi) {
            System.out.println(Arrays.toString(k));
        }
        System.out.println("------------------");
        System.out.println("Dizi Transpose : ");
        for (int[] m:
             diziTranspose) {
            System.out.println(Arrays.toString(m));
        }
    }
}