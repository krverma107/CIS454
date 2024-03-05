public class User {
    public String name;
    public String password;
    public String username;
    public String email;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
