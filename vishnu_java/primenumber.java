import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
    int i, flag = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("enter a prime number");
    int n = s.nextInt();
    for(i=2;i<=n/2;i++){
        if(n%i==0){
            flag = 1;
        }
    }
    if(flag == 0){
        System.out.println("It is a prime number");
    }
    else{
        System.out.println("It is not a prime number");
    }
    }
    
}
