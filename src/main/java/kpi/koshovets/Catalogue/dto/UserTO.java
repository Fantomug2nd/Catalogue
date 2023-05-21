package kpi.koshovets.Catalogue.dto;

public class UserTO {
    private String login;

    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserTO() {
    }

    public UserTO(String login, String password) {
        this.login = login;
        this.password = password;
    }
}

