import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        System.out.println("Уникальная система создания персонажей");

        System.out.println("Введите имя первого персонажа: ");
        Scanner in1 = new Scanner(System.in);
        String name1 = in1.nextLine();
        System.out.println("Введите имя первого персонажа: ");
        Scanner in2 = new Scanner(System.in);
        String name2 = in2.nextLine();
        System.out.println("Введите имя первого персонажа: ");
        Scanner in3 = new Scanner(System.in);
        String name3 = in3.nextLine();
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