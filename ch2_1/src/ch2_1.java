import java.util.Scanner;
public class ch2_1 {
 public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double r = cin.nextDouble();
        System.out.printf("diameter = %f%n",2*r);
        System.out.printf("circumference = %f%n",2*r*Math.PI);
        System.out.printf("area = %f",r*r*Math.PI);
        cin.close();
    }
}
