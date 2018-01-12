package decorator;

import java.util.Date;

public class MessageSandData extends Decorator {

    public MessageSandData(MailBox message) {
        super(message);
    }

    @Override
    public void wyswietl() {
        Date date = new Date();
        System.out.println("sand message date  " + date.toString() + " content: " + super.getContent());
    }
}
