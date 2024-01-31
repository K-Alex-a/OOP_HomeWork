package lesson_06;

public class SaveToMD extends SaveToFile{

    public SaveToMD(Order order) {
        super(order);
        setFileName("order.md");
    }
}
