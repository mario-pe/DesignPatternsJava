package proxy;

public class ProxyMain {
    public static void main(String[]args) {
        AccessProxy p = new AccessProxy();
//        Scanner reader = new Scanner(System.in);

        p.payout(100f);
        p.stan();
    }
}
