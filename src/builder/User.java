package builder;

public class User {
    private String name; //requierd
    private String lastName; //requierd
    private int age;    // optional
    private int sex;    // optional

    private User(UserBuilder builder){  // construktor prywatny
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.sex = builder.sex;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
//    public User getUser() {
//        return new User.UserBuilder("Jhon", "Doe")
//                .age(30)
//                .sex(1);
//    }

    public static class UserBuilder{ // Static class

        private final String name;
        private final String lastName;
        private int age;
        private int sex;

        public UserBuilder(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder sex(int sex){
            this.sex = sex;
            return this;
        }

        public User build(){

            return new User(this);
        }

    }

}
