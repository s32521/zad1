import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<0){
            System.out.println("The number is negative");
            return;
        }else if(n>0){
            System.out.println("The number is positive");
            return;
        }else{
            System.out.println("The number is zero");
            return;
        }
        
    }
}
