
import java.util.Scanner;

public class faktorialDemo {
    public static int faktorial (int x ){
        if(x==1)
            return x;  
        else 
            return x * faktorial (x-1);
}
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("N = ");
        int n = input.nextInt();
        System.out.println("Hasil = "+faktorial(n));
}
    
}
