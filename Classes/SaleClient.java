package Classes;

public class SaleClient extends Actor{
    static private int genId = 0;
    private int id;
    private String nameOfSale;

    /**
     * Конструктор класса Акционный клиент. Помимо параметров присваивает id для нового коиент +1, начинается с 0
     * @param name Имя клиента
     * @param nameOfSale Название акции на которую пришел клиент
     */
    public SaleClient(String name, String nameOfSale) {
        super(name);
        this.nameOfSale = nameOfSale;
        this.id = genId++;
    }

    /**
     * Метод возвращает id актцонного клиента
     * @return id акционного клиента
     */
    public int getId() {
        return id;
    }

    /**
     * Метод возвращает название акции в которой участвует акционный клиент
     * @return Название акции
     */
    public String getNameOfSale() {
        return nameOfSale;
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
