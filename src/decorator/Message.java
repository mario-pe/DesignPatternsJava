package decorator;

public class Message implements MailBox {

    String content = "example message";

    @Override
    public void wyswietl() {
        System.out.println(this.content);
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
