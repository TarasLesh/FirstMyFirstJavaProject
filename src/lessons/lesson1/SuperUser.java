package lessons.lesson1;

public class SuperUser extends User {
private String login;

    public SuperUser() {
        super();
    }

    public SuperUser(int id, String name, String login) {
        super(id, name);
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "login='" + login + '\'' +
                "} " + super.toString();
    }

    @Override
    public void greeting() {
        System.out.println("hey yo!");
    }
}
