package lesson_04;

/**
 * Дает возможность перемещения элементов из одного массива в другой
 * @param <T> обобщение массива (коробки)
 */
public class TransferFruit<T extends Box<?>> {

    //region Публичный метод

    /**
     * Перемещение элементов из одного массива (коробки) в другой
     */
    public void execute() {
        if (from.getByIndex(0).getClass().equals(to.getByIndex(0).getClass())) {
            while (to.getSize() > 0) {
                from.add(to.getByIndex(to.getSize() - 1));
                to.delete();
            }
            System.out.printf("Фрукты из коробки #%d пересыпаны в коробку #%d", to.getIdBox(), from.getIdBox());
        } else {
            System.out.println("Разные фрукты нельзя пересыпать в одну коробку.");
        }
    }
    //endregion


    //region Конструктор

    /**
     * Конструктор
     * @param from откуда перемещать
     * @param to куда перемещать
     */
    public TransferFruit(T from, T to) {
        this.from = from;
        this.to = to;
    }
    //endregion


    //region Поля

    /**
     * Откуда перемешать
     */
    private T from;

    /**
     * Куда перемещать
     */
    private T to;
    //endregion
}
