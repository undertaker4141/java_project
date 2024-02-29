package zj_practice;
import java.util.Scanner;
public class a003 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int M = cin.nextInt();
        int D = cin.nextInt();
        int S = (M*2+D)%3;

        if(S==2){
            System.out.printf("大吉");
        }
        else if(S==1){
            System.out.printf("吉");
        }
        else{
            System.out.printf("普通");
        }
    cin.close();
    }
}
