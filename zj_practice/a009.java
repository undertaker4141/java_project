package zj_practice;//k=-7
import java.util.Scanner;
public class a009 {
    public static void main(String[] args) {
       Scanner cin = new Scanner(System.in);
       String str = cin.nextLine();
       int counter = str.length();
        for(int i=0;i<counter;i++){
            System.out.printf("%c",(char)((int)str.charAt(i)-7));
        }

       cin.close();
    }
}
