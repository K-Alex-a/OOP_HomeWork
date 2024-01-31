package lesson_06;

public class Program {
    /**
     * TODO: Переработать структуру приложения Order,
     *  приложение должно соответствовать
     *  принципу SRP
     */
    public static void main(String[] args) {

        Order order = new Order();

        InputFromConsole fromConsole = new InputFromConsole();
        fromConsole.inputFromConsole(order);

        SaveToFile jsonFile = new SaveToJson(order);
        SaveToFile mdFile = new SaveToMD(order);
        jsonFile.saveToFile();
        mdFile.saveToFile();


    }
}
