package lesson_02;

public class Cat extends Plate{
    private String name;
    private int appetite;
    private boolean fullness;


    public Cat(String name,
               int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean getFullness() {
        return fullness;
    }

    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }

    protected String getFullnessInfo() {
        if (fullness) {
            return "сыт(а)";
        } else {
            return "голоден(а)";
        }
    }


    public String getCatInfo() {
        StringBuilder infoCat = new StringBuilder();
        infoCat.append(name)
                .append(" -> Готов скушать: ")
                .append(appetite)
                .append(", Состояние ")
                .append(name)
                .append(": ")
                .append(getFullnessInfo())
                .append('\n');
        return String.valueOf(infoCat);
    }


    public void eat() {
        System.out.printf("%s скушал: %d \n", name, appetite);
    }


}
