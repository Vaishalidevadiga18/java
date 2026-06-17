public class swap {
    public static void swa(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Swapped results" + a +" "+b);
    }
    public static void main(String[] args){
        swa(2,1);
        
    }
}
