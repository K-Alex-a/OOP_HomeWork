package lesson_02;

public class Plate {
    private int food;

    public Plate() {
    }

    public Plate(int food) {
        this.food = food;
    }


    public int getFood() {
        return this.food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }


    public int eatFood(Cat cat) {
        if (cat.getAppetite() <= this.food) {
            this.food = food - cat.getAppetite();
        }
        return this.food;
    }


    /**
     * Метод добавление еды в тарелку
     *
     * @param food количество еды для добавления
     * @return общее количество еды с учетом добавки
     */
    public int addFood(int food) {
        return this.food += food;
    }

}
