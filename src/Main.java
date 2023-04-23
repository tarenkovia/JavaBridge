import java.util.Scanner;

public class Main {

    public static boolean IncorrectName(String name){
        try {
            if(name.equals("")){
                throw new IllegalArgumentException("Нельзя ввести пустое имя!");
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return true;
        }
        return false;
    }

    public static String EnterName(){
        String name;
        do {
            Scanner in = new Scanner(System.in);
            name = in.nextLine();
        }while(IncorrectName(name));
        return name;
    }

    public static void main (String [] args) {
        System.out.println("Уникальная система создания персонажей");

        System.out.println("Введите имя первого персонажа: ");
        String name1 = EnterName();
        System.out.println("Введите имя второго персонажа: ");
        String name2 = EnterName();
        System.out.println("Введите имя второго персонажа: ");
        String name3 = EnterName();
        System.out.println();

        BodyType body1 = new Ectomorph(new MaleGender(), new YellowSkinColor(), name1);
        BodyType body2 = new Endomorph(new FemaleGender(), new RedSkinColor(), name2);
        BodyType body3 = new Mesomorph(new MaleGender(), new GreenSkinColor(), name3);
        body1.printHuman();
        System.out.println();
        body2.printHuman();
        System.out.println();
        body3.printHuman();
    }
}