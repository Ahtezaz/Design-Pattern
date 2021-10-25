public class MediumPen implements Pen{
    String color = null;
    BrushSize mediumSize = BrushSize.MEDIUM;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println(content + "Color -- " + color);
    }
}
