package Zad12Sklep;

public class Admin extends User{

    private String login;
    private String password;

    private String AdminStatus;

    public Admin(String login, String password) {
        super(login, password);
    }

    //public User(String adminStatus, String login, String password) {
    //    this.AdminStatus = adminStatus;
    //    this.login = login;
    //    this.password = password;
    //}

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdminStatus() {
        return AdminStatus;
    }

    public void setAdminStatus(String adminStatus) {
        AdminStatus = adminStatus;
    }
}


