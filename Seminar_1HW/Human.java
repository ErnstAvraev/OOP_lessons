package Seminar_1HW;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private String sex;
    private int age;
    private List<String> parents;
    private List<String> children; 



    public Human(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        parents = new ArrayList<>();
        children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void addParents(Human human) {
        
        if (parents.size() <= 2){
            parents.add(human.getName());
        }
    }


    public void addChildren(Human human) {
        children.add(human.getName());
    }



    @Override
    public String toString() {
        StringBuilder print = new StringBuilder();
        print.append("\nИмя: " + name);
        print.append(", пол: " + sex);
        print.append(", возраст: " + age);
        print.append("\nРодители: ");
        print.append(parents);
        print.append("\nДети: ");
        print.append(children);

        return print.toString();
    }
    
    
}
