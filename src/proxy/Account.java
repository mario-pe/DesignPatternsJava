package proxy;

public class Account implements Payment {

    private float balance = 1000;

    @Override
    public void payout(float payment) {
        balance -= payment;
    }

    @Override
    public float stan() {
        System.out.println(balance);
        return 0;
    }
}
