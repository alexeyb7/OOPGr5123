package Classes;

import Interfaces.iActorBehaviour;

/**
 * Класс ActionClient определяет акционного клиента
 */
public class ActionClient extends Actor {
    /*
     * поле action Имя акции
     * поле maxActionCount max количество клиентов по акции
     */

    private static String action;
    private static int maxActionCount;
    private static int actionCount;
    private int id;

    static {
        maxActionCount = 0;
        actionCount = 0;
    }

    /**
     * определение
     * 
     * @param action название акции
     */
    public static void setAction(String action) {
        ActionClient.action = action;
    }

    /**
     * 
     * @return возвращает название акции
     */
    public static String getAction() {
        return ActionClient.action;
    }

    /**
     * 
     * @param newMaxActionCount установка максимального количества покупателей по
     *                          акции
     */
    public static void setMaxActionCount(int newMaxActionCount) {
        ActionClient.maxActionCount = newMaxActionCount;
    }

    /**
     * 
     * @return кол-во покупателей, получивших товар по акции
     */
    public static int getActionCount() {
        return actionCount;
    }

    /**
     * Конструктор клиента по акции
     * 
     * @param name имя клиента
     */
    public ActionClient(String name) {
        super(name);
        this.id = ++maxActionCount;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Проверка получения заказа
     * 
     * @return Если заказ получен - true
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Проверка сделан ли заказ
     * 
     * @return true при сделанном заказе
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean setTakeOrder(boolean take) {
        ActionClient.actionCount++;
        super.isTakeOrder = take;
        return true;
    }

    @Override
    public void setMakeOrder(boolean make) {
        super.isMakeOrder = make;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public void returnOrder() {
        super.returnOrder();
        maxActionCount--;
    }
}
