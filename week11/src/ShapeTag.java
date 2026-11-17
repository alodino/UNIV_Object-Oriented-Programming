public class ShapeTag {
    private String tag;
    public ShapeTag(String tag)
    {
        this.tag = tag;
    }
    public String getShapeTag()
    {
        return this.tag;
    }
    public String toString()
    {
        return "#" + this.tag;
    }
}

class RectangleTag extends ShapeTag{
    private String rectTag;

    public RectangleTag(String tag, String rectTag)
    {
        super(tag);
        this.rectTag = rectTag;
    }

    public String getRectTag()
    {
        return this.rectTag;
    }

    @Override
    public String toString()
    {
        return "#" + rectTag + " " + super.toString();
    }
}
