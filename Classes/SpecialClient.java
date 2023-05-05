package Classes;

public class SpecialClient extends Actor{
    private int idVIP;

    public SpecialClient(String name, int idVIP){
        super(name);
        this.idVIP = idVIP;
    }

    /**
     * Метод возвращает id специального клиента
     * @return id специального клиента
     */
    public int getIdVIP() {
        return idVIP;
    }

    /**
     * Метод устанавливает, делал ли клиент заказ
     * @param makeOrder Делал ли клиент заказ
     */
    @Override
    public void setMakeOrder(boolean makeOrder) { super.isMakeOrder = makeOrder; }

    /**
     * Метод устанвливает забрал ли киент свой заказ
     * @param pickUpOrder Забрал л клиент свой заказ
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder) { super.isTakeOrder = pickUpOrder; }

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
    public boolean isTakeOrder() { return super.isTakeOrder; }

    /**
     * Метод возвращает объекта клиент
     * @return Клиент
     */
    @Override
    public Actor getActor() {
        return this;
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
     * Метод возарщает имя клиента
     * @return Имя клиента
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Метод устанавливает хочет ли клиент вернуть свой заказ
     * @param returnOrder хочет ли клиент вернутьсвой заказ
     */
    @Override
    public void setReturnOrder(boolean returnOrder) {
        super.isReturnOrder = returnOrder;
    }
}