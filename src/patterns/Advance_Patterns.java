package patterns;
import java.util.Scanner;
public class Advance_Patterns {
    public static void butterflyPattern(int n){
        for(int i=0;i<=n;i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");}

            int space=2*(n-i);
                for (int k = 1; k <=space; k++) {
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            System.out.println();
        }
        for(int i=n;i>=0;i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");}

            int space=2*(n-i);
            for (int k = 1; k <=space; k++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
public static void Pattern(int n){
        for(int  i=1;i<=n;i++){
        for (int j=1;j<=n-i;j++){
        System.out.print(" ");}
        for(int k=1;k<=n;k++){
            System.out.print("*");
        }
        System.out.println();
}}
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter rows no : ");
        int n=input.nextInt();
        //butterflyPattern(n);
        Pattern(n);
    }
}
