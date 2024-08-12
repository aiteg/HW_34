public class Main {
    public static void main(String[] args) {

        User user = new User();

        try {
            user.registerUser("ы ва", "123456");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}