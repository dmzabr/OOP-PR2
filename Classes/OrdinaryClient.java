package Classes;

public class OrdinaryClient extends Actor {

    public OrdinaryClient(String name)
    {
        super(name);
    }

    /**
     * Метод возарщает имя клиента
     * @return Имя клиента
     */
    @Override
    public String getName() {        
        return super.name;
    }

    /**
     * Метод показывает сделал ли клиент заказ
     * @return Делал ли клиент заказ
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Метод показывает забрал ли клиент свой заказ
     * @return Забрал ли клиент свой заказ
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Метод возвращает, хочет ли клиент вернутьсвой заказ
     * @return
     */
    @Override
    public boolean isReturnOrder() {
        return isReturnOrder;
    }

    /**
     * Метод устанавливает, сделал ли клиент свой заказ
     * @param makeOrder сделал ли клиент свой заказ
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }

    /**
     * Метод устанвливает забрал ли киент свой заказ
     * @param pickUpOrder Забрал л клиент свой заказ
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;   
    }

    /**
     * Метод устанавливает хочет ли клиент вернуть свой заказ
     * @param returnOrder хочет ли клиент вернутьсвой заказ
     */
    @Override
    public void setReturnOrder(boolean returnOrder) {
        super.isReturnOrder = returnOrder;
    }

    /**
     * Метод возвращает объекта клиент
     * @return Клиент
     */
    @Override
    public Actor getActor() {
        return this;
    }
}
