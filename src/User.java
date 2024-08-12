public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private boolean spaceFind(String username) {
        char[] usernamesArray = username.toCharArray();

        for(char word : usernamesArray) {
            if (word == ' ') return false;
        }

        return true;
    }

    public void registerUser(String username, String password) throws IllegalArgumentException{
        if (username == null || username == "") {
            throw new IllegalArgumentException("Имя пользователся не должно быть пустым");
        } else if (!spaceFind(username)) {
            throw new IllegalArgumentException("В данном username содержаться пробелы");
        } else if (password.length() < 8) {
            throw new IllegalArgumentException("Пароль должен содержать не менее 8и символов");
        } else {
            System.out.println("Registration successful!");
        }
    }



}
