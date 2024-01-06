package lesson_02;

import java.util.ArrayList;
import java.util.List;

public class TimeEat {
    private List<Cat> cats;


    public TimeEat() {
        cats = new ArrayList<>();
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    public void addAnimal(Cat cat) {
        cats.add(cat);
    }


    public String eatingProcess(Plate food) {
        StringBuilder res = new StringBuilder();
        for (Cat cat : cats) {
            if (cat.getFullness()) {
                res.append(cat.getName())
                        .append(" уже наелся! \n");
            } else if (cat.getAppetite() <= food.getFood()) {
                food.eatFood(cat);
                res.append(cat.getName())
                        .append(" скушает: ")
                        .append(cat.getAppetite())
                        .append('\n')
                        .append("Осталось в тарелке: ")
                        .append(food.getFood())
                        .append('\n');
                cat.setFullness(true);
            } else {
                res.append(cat.getName())
                        .append(" eды не хватает!")
                        .append('\n');
            }
        }
        return String.valueOf(res);
    }


    private String getInfo(List<Cat> cats) {
        StringBuilder info = new StringBuilder();
        int count = 0;
        info.append("All cats info: \n");
        for (Cat cat : cats) {
            count++;
            info.append("Cat_")
                    .append(count)
                    .append(": ")
                    .append(cat.getCatInfo());
        }
        return String.valueOf(info);
    }

    public String getFullnessInfo() {
        StringBuilder info = new StringBuilder();
        int count = 0;
        for (Cat cat : cats) {
            count++;
            info.append("Cat_")
                    .append(count)
                    .append(": ")
                    .append(cat.getName());
            if (cat.getFullness()) {
                info.append(" -> cыт(а) \n");
            } else {
                info.append(" -> голоден(а) \n");
            }
        }
        return String.valueOf(info);
    }


    @Override
    public String toString() {
        return getInfo(cats);
    }
}
