
package flyweight;

public class ConcreteMarkerStyle implements MarkerStyle {
    private final String icon;
    private final String color;

    public ConcreteMarkerStyle(String icon, String color) {
        this.icon = icon;
        this.color = color;
    }

    @Override
    public void render(int x, int y) {
        System.out.println("Отображение [" + icon + "] с цветом " + color + " на (" + x + "," + y + ")");
    }
}
