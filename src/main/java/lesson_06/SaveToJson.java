package lesson_06;

public class SaveToJson extends SaveToFile {

    public SaveToJson(Order order) {
        super(order);
        setFileName("order.json");
    }
}
