package proxy;

public class AccessProxy implements Payment {

    private Payment account;

    @Override
    public void payout(float payment) {
        int pin = 123;

        if(pin == 123){
            account = new Account();
            account.payout(payment);
        }else {
            System.out.println("zly pin");
        }


    }

    @Override
    public float stan() {
        return account.stan();
    }
}
