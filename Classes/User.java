public class User {
    private String name;
    private String password;
    private String username;
    private String email;

    public User(String name, String password, String username, String email) {
        this.name = name;
        this.password = password;
        this.username = username;
        this.email = email;
    }

    //Name methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Password methods
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Username methods
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //Email methods
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
