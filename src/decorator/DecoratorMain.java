package decorator;

public class DecoratorMain {

    public static void main(String[]args){
        MailBox mb = new Message();
        mb.setContent("main content");
        mb.wyswietl();
        MailBox sandM = new MessageSandData(mb);
        sandM.wyswietl();
    }

}
