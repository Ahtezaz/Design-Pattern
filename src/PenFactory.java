import java.util.HashMap;
import java.util.Map;

public class PenFactory {
    Pen pen;
    static HashMap<String, Pen> penMap = new HashMap<>();


    public static  Pen getThickPen(String color) {
        String key = color + "-thick";
        Pen pen = penMap.get(key);
        if (pen == null) {
            pen = new ThickPen();
            pen.setColor(color);

        }
        return pen;
    }

    public static Pen getMediumPen(String color) {
        String key = color + "-thin";
        Pen pen = penMap.get(key);
        if (pen == null) {
            pen = new MediumPen();
            pen.setColor(color);

        }
        return pen;
    }

    public static Pen getThinPen(String color) {
        String key = color + "-thick";
        Pen pen = penMap.get(key);
        if (pen == null) {
            pen = new ThinPen();
            pen.setColor(color);

        }
        return pen;
    }

}
