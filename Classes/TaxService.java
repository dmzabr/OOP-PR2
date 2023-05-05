package Classes;

import Interfaces.iActorBehaviour;

public class TaxService implements iActorBehaviour{
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;
    private boolean isReturnOrder;

    /**
     * Конструктор налого, присваивает имя "Tax audit"
     */
    public TaxService() {
        this.name = "Tax audit";
    }

    /**
     * Метод возвращает имя
     * @return имя
     */
    public String getName() {
        return name;
    }

    /**
     * Метод воззвращает, делался ли закза
     * @return делался ли заказ
     */
    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    /**
     * Метод возвращает забрал ли клиент заказ
     * @return забрал ли заказ
     */
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    /**
     * Метод устанавливает делал ли заказ
     * @param makeOrder делал ли заказ
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
       isMakeOrder = makeOrder;
    }

    /**
     * Метод устанавливает забрал ли заказ
     * @param pickUpOrder Забрал ли заказ
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       isTakeOrder = pickUpOrder;
    }

    /**
     * Метод устанавливает возвращает ли заказ
     * @param returnOrder Возвращает ли заказ
     */
    @Override
    public void setReturnOrder(boolean returnOrder) {isReturnOrder = returnOrder;}

    /**
     * Метод возвращает обычного клиента с именем "Tax audit"
     * @return Обычный клиент
     */
    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }

    /**
     * Метод возвращает делал ли заказ
     * @return Делал ли заказ
     */
    @Override
    public boolean isReturnOrder() {
        return isReturnOrder;
    }

}
