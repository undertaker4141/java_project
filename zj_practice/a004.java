package zj_practice;
import java.util.Scanner;
public class a004 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            int n = cin.nextInt();
            if((n%4==0&&n%100!=0)||n%400==0){
                System.out.println("閏年");
            }
            else{
                System.out.println("平年");
            }
        }
        cin.close();
    }
}
