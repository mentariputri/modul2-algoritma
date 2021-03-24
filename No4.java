package Matriks;
import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        int i, j , m, n;
        int matriks[][] = new int [10][10];
        int transpose[][] = new int[10][10];
        Scanner scan = new Scanner(System.in);
        System.out.print("masukkan jumlah baris matriks :");
        m = scan.nextInt();
        System.out.print("masukkan jumlah kolom matriks :");
        n = scan.nextInt();
        System.out.println("masukkan elemen matriks");
        for(i=0; i<m; i++) {
            for(j=0; j<n; j++) {
                matriks[i][j] = scan.nextInt();
            }
        }
        for(i = 0; i<m; i++) {
            for(j = 0; j<n; j++) {
                transpose[j][i] = matriks[i][j];
            }
        }
        System.out.println("hasil transpose matriks :");
        for(i = 0; i<m; i++) {
            for(j = 0; j<n; j++) {
                System.out.print(transpose[i][j]+"\t");
            }
            System.out.println();
            System.out.println("Mentari Putri Meyranita");
        }
    }
    
}
