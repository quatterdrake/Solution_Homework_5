
package flyweight;

import java.util.*;

public class FlyweightDemo {
    public static void main(String[] args) {
        List<Marker> markers = new ArrayList<>();
        String[] types = {"hospital", "restaurant", "gas"};
        Random rand = new Random();

        for (int i = 0; i < 1000; i++) {
            String type = types[rand.nextInt(types.length)];
            int x = rand.nextInt(1000);
            int y = rand.nextInt(1000);
            MarkerStyle style = MarkerFactory.getStyle(type);
            markers.add(new Marker(x, y, style));
        }

        System.out.println("\nПервые 5 маркеров:");
        for (int i = 0; i < 5; i++) {
            markers.get(i).draw();
        }

        System.out.println("\nВсего маркеров: " + markers.size());
        System.out.println("Уникальных стилей: " + MarkerFactory.getStyleCount());
    }
}
