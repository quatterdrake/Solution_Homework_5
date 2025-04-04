
package proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Image img1 = new ImageProxy("house1.jpg");
        img1.displayThumbnail();
        img1.displayFullImage();

        ProtectionProxyImageUploader.uploadImage("villa.jpg");
        AgentSession.login("agent", "1234");
        ProtectionProxyImageUploader.uploadImage("villa.jpg");
    }
}
