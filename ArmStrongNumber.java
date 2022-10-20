import java.util.Scanner;
public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number!");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
       while(num!=0){
           int mod = num % 10;
           num = num / 10;
           sum = sum + mod * mod * mod;
       }
        if(sum == temp)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}