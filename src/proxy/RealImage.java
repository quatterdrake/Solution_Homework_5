
package proxy;

public class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Загрузка полного изображения: " + filename);
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Показ превью: " + filename);
    }

    @Override
    public void displayFullImage() {
        System.out.println("Показ полного изображения: " + filename);
    }
}
