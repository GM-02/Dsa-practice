package patterns;

import java.util.Scanner;

public class Patterns {
    public static void retangle(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n + 1; j++) {
                System.out.print(" " + "*");
            }
        }
    }

    public static void hollowretangle(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n + 1; j++) {
                if (j == 0 || j == n || i == 0 || i == n - 1) {
                    System.out.print(" " + "*");
                } else {
                    System.out.print(" " + " ");
                }
            }

        }
    }

    public static void Halfpyramide(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
    }

    public static void invertedhalfpyramide(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
    }

    public static void OppositHalfpyramide(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void numberHalfpyramide(int n){
        for(int i=1;i<=n;i++){
            System.out.println();
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
        }
    }
    public static void invertednumberHalfpyramide(int n){
        for (int i = n; i >= 1; i--) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
        }

    }
    //Floyed's triangle
    public static void Floyedtriangle(int n){
        int number=1;
        for(int i=1;i<=n;i++){
            for(int j=1 ;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
    public static void binarypattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number rows: ");
        int n = scanner.nextInt();
        //  retangle(n);
        // hollowretangle(n);
        // invertedhalfpyramide(n);
        // Halfpyramide(n);
        // OppositHalfpyramide(n);
        //numberHalfpyramide(n);
        //  invertednumberHalfpyramide(n);
        //  Floyedtriangle(n);
        binarypattern(n);
        scanner.close();
    }
}
