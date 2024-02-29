import java.util.Scanner;
public class ch2_2 {
 public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int counter=0;
        int m=n;
        do{
            m/=10;
            counter++;
        }while(m>0);
        for(int i=counter-1;i>0;i--){
            System.out.printf("%d   ",n/(int)Math.pow(10,i));
            n=n%(int)Math.pow(10,i);
        }
        System.out.printf("%d",n);
        cin.close();
    }
}
