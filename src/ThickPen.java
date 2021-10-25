public class ThickPen implements Pen {
    String color = null;
    BrushSize thickSize = BrushSize.THICK;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println(content + "Color -- " + color);
    }
}
