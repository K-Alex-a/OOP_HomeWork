package lesson_04;

public class TransferFruit<T extends Box<?>> {
    private T from;
    private T to;


    public void execute() {
        if (from.getClass().equals(to.getClass())) {


            System.out.printf("Фрукты из коробки #%d пересыпаны в коробку #%d", from.getIdBox(), to.getIdBox());
        } else {
            System.out.println("Разные фрукты нельзя пересыпать в одну коробку.");
        }

    }


    public TransferFruit(T from, T to) {
        this.from = from;
        this.to = to;
    }
}
