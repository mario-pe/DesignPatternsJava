package builder;

public class BuilderMain {
    public static void main(String[]args) {
        User ub = new User.UserBuilder("a","b").age(10).sex(1).build();

    }
}
