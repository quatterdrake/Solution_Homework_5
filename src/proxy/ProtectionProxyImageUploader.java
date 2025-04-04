
package proxy;

public class ProtectionProxyImageUploader {
    public static void uploadImage(String filename) {
        if (!AgentSession.isLoggedIn()) {
            System.out.println("Доступ запрещён. Войдите как агент.");
            return;
        }
        System.out.println("Изображение загружено: " + filename);
    }
}
