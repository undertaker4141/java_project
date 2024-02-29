package zj_practice;
import java.util.Scanner;
public class a005 {
    public static void main(String[] args) {
       Scanner cin = new Scanner(System.in);
       int n = cin.nextInt();
       for(int i=0;i<n;i++){
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        int d = cin.nextInt();
        int e = 0;
        int dec=0;
        if(b-a==c-b&&c-b==d-c){
            dec=1;
        }
        if(dec==1){
            e = d+(b-a);
        }
        else{
            e = d*(b/a);
        }
        System.out.printf("%d %d %d %d %d%n",a,b,c,d,e);
       }
       cin.close();
    }
}
