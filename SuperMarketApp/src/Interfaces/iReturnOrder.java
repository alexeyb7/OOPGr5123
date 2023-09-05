package Interfaces;

/*
 * Интерфейс описывающий возможность возврата товара
 */
public interface iReturnOrder {
    /*
     * Метод возврата заказа
     */
    void returnOrder();

    /**
     * Метод проверки возможности возврата заказа
     * 
     * @return true при возможности вернуть заказ, иначе false
     */
    boolean isReturnOrder();
}
