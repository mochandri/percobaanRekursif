public class karakter {
    public static void CharCombination(String a, int n){
        if (n==0)
            System.out.println(a+" ");
        else 
            for (int i=97;i<99;i++)
                CharCombination(a+(char)i,n-1);
    }
    public static void main(String[] args) {
        CharCombination("",2);
   
}
}
