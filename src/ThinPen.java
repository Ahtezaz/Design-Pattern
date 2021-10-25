public class ThinPen implements Pen {
    String color = null;
    BrushSize thinSize = BrushSize.THIN;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println(content + "Color -- " + color);
    }
}
