
package proxy;

public class AgentSession {
    private static boolean loggedIn = false;

    public static void login(String user, String pass) {
        if ("agent".equals(user) && "1234".equals(pass)) {
            loggedIn = true;
            System.out.println("Агент вошёл в систему.");
        } else {
            System.out.println("Ошибка входа.");
        }
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }
}
