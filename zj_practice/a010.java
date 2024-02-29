package zj_practice;
import java.util.Scanner;
public class a010 {
    public static void main(String[] args) {
       Scanner cin = new Scanner(System.in);
       int n = cin.nextInt();
       int m=n;
       int k=n;
        int counter=0;
        int[][] arr = new int[n][2];
        for(int i=1;i<=n;i++){
            arr[i-1][0]=i;
        }

       for(int i=2;i<=n;i++){
        for(int j=1;j<=i;j++){
            if(i%j==0){
                counter++;
            }
        }
        if(counter==2){
            while(k%i==0){
                arr[i-1][1]++;
                k/=i;
            }
        }
        counter=0;
       }
       int dec=0;
       for(int i=m;i>0;i--){
        if(arr[i-1][1]!=0){
            dec=i;
            break;
        }
       }
       for(int i=1;i<dec;i++){
        if(arr[i-1][1]!=0){
            if(arr[i-1][1]==1){
                System.out.printf("%d* ",i);
            }
            else{
                System.out.printf("%d^%d * ",i,arr[i-1][1]);
        }
        }
       }
       if(arr[dec-1][1]==1){
        System.out.printf("%d",dec);
        }
    else{
        System.out.printf("%d^%d",dec,arr[dec-1][1]);
        }
        cin.close();
}
}