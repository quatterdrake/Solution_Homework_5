
package flyweight;

import java.util.HashMap;
import java.util.Map;

public class MarkerFactory {
    private static final Map<String, MarkerStyle> styleCache = new HashMap<>();
    private static int createdStyles = 0;

    public static MarkerStyle getStyle(String type) {
        if (!styleCache.containsKey(type)) {
            switch (type) {
                case "hospital" -> styleCache.put(type, new ConcreteMarkerStyle("🏥", "red"));
                case "restaurant" -> styleCache.put(type, new ConcreteMarkerStyle("🍽", "green"));
                case "gas" -> styleCache.put(type, new ConcreteMarkerStyle("⛽", "blue"));
                default -> throw new IllegalArgumentException("Unknown type: " + type);
            }
            createdStyles++;
        }
        return styleCache.get(type);
    }

    public static int getStyleCount() {
        return createdStyles;
    }
}
