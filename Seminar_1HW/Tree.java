package Seminar_1HW;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private Human human;
    private List<Human> humansList;
    
    
    public Tree() {
        humansList = new ArrayList<>();
    }

    public void addHuman(Human human) {
        humansList.add(human);
    }

    public Human findHuman(String name){
        for (Human human : humansList) {
            if(human.getName().equals(name)){
                return human;
            }
        }
        return null;
    }

    public String getHumansList() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Human human: humansList){
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
