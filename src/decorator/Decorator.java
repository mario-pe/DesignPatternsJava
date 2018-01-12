package decorator;

public abstract class Decorator implements MailBox {

    MailBox message;

    public Decorator(MailBox message){
        this.message = message;
    }

    @Override
    public void wyswietl() {
        System.out.println("wyswietl z Decoratora" + message);
    }

    @Override
    public void setContent(String content) {
        System.out.println("set content z Decoratora");
        message.setContent(content);
    }

    @Override
    public String getContent() {
        return message.getContent();
    }
}
