public class Main {
    public static void main(String[] args) {
        Pen yellowPen = PenFactory.getThickPen("Yellow");
        yellowPen.draw("Drawing With Thick Pen ");
        Pen greenPen = PenFactory.getMediumPen("Green");
        greenPen.draw("Drawing With Medium Pen Color ");
        Pen pinkPen = PenFactory.getThickPen("Yellow");
        pinkPen.draw("Drawing With Thin Pen Color ");
    }
}
