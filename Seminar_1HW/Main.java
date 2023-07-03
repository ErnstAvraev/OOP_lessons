package Seminar_1HW;

public class Main {
    public static void main(String[] args) {
        
        Human human1 = new Human("Алексей Иванов", "муж", 50);
        Human human2 = new Human("Лариса Иванова", "жен", 48);
        Human human3 = new Human("Никита Иванов","муж", 20);
        Human human4 = new Human("Виктория Иванова", "жен", 18);
        human1.addChildren(human3);
        human1.addChildren(human4);
        human2.addChildren(human3);
        human2.addChildren(human4);
        human3.addParents(human1);
        human3.addParents(human2);
        human4.addParents(human1);
        human4.addParents(human2);

        Tree ivanovi = new Tree();
        ivanovi.addHuman(human1);
        ivanovi.addHuman(human2);
        ivanovi.addHuman(human3);
        ivanovi.addHuman(human4);

        Human findHuman = ivanovi.findHuman("Алексей Иванов");
        System.out.println(findHuman);

        System.out.println(ivanovi.getHumansList());
        
    }
}
