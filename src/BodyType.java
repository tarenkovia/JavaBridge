public abstract class BodyType {
    protected Gender gender;
    protected SkinColor skinColor;
    protected String name;

    protected BodyType(Gender gender, SkinColor skinColor, String name){
        this.name = name;
        this.gender = gender;
        this.skinColor = skinColor;
    }

    public abstract void printHuman();
}
