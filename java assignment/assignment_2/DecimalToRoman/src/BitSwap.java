public class BitSwap {
    public static void main(String[] args) {
        int a=9;
        int b=1;
        System.out.println("a="+a+"\nb="+b+"\n");
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("a="+a+"\nb="+b);
    }
}
