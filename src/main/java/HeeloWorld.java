public class HeeloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        SsyHello(5);
    }
    public static int SsyHello(int b){
        int a = b;
        while(a>-1){
            if(a==0){
                return 0;
            }
            System.out.println(100/a);
            a-=1;
        }
        System.out.println("Hello, there!");
        return a;
    }
}
