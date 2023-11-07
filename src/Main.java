public class Main {
    public static void main(String[] args) {
        Spartansy spartansy = new Spartansy("Kuba ", 18, " 73kg ");
        System.out.println(spartansy);
        System.out.println("----------------------");
        Luchniki luchniki = new Luchniki("Musa", 18, "войска:125", "188cm", "89kg");
        System.out.println("имя : " + luchniki.getName() + "\n" + "восраст :" + luchniki.getAge() + "\n" + "рост :" + luchniki.getHeight() + "\n" + "вес :" + luchniki.getWeight() +
                "\n" + luchniki.getMassa());
        System.out.println("------------------------");
        Rytsyry rytsyry = new Rytsyry("Nurik", 20, "войска:300", "атчандар:500", "жоо700:");
        System.out.println(rytsyry.getName() + "\n" + rytsyry.getAge() + "\n" + rytsyry.getMassa() + "\n" + rytsyry.getHorsemen() + "\n" + rytsyry.getThoseWhoWalk());

        System.out.println("==========================");

        Vsadniki vsadniki = new Vsadniki("Ulan", 22, "войско:1200", "кылычтуулар:50", "опыт:5года");
        System.out.println(vsadniki.getName() + "\n" + vsadniki.getAge() + "\n" + vsadniki.getMassa() + "\n" + luchniki + "\n" + vsadniki.getFencers() + "\n" + vsadniki.getLevel());
    }
}