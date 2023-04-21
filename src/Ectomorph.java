public class Ectomorph extends BodyType{

    private String typeOfBody = "Эктоморф";

    public Ectomorph(Gender gender, SkinColor skinColor, String name){
        super(gender, skinColor, name);
        this.name = name;
        this.gender = gender;
        this.skinColor = skinColor;
    }

    @Override
    public void printHuman(){
        System.out.println("Имя персонажа: " + name + "\n Вид телосложения - " + typeOfBody + "\n Пол - " + gender.getGender() + "\n Цвет кожи - " + skinColor.getSkinColor());
    }
}
