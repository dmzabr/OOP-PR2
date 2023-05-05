package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isReturnOrder;

    /**
     * КОнутктор класса Actor
     * @param name Имя персонажа
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Метод возвращает имя персонажа
     * @return Имя персонажа
     */
    public abstract String getName();
}
