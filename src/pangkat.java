
import java.util.Scanner;

public class pangkat {
    public static int pangkatRekursif (int x, int y){
        if(y==0)
            return 1 ;
        else return x * pangkatRekursif(x,y-1);
    }
    public static void main(String[] args) {
        System.out.println("Bilangan x Pangkat Y :");
        Scanner input = new Scanner (System.in);
        System.out.println("Bilangan x : ");
        int x = input.nextInt();
        
        System.out.println("Bilangan y :");
        int y = input.nextInt();
        
        System.out.println(x + "Dipangkatkan" + y + "=" +pangkatRekursif(x,y));
}
}
