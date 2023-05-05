package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean pickUpOrder);
    void setReturnOrder(boolean returnOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
    Actor getActor();
    boolean isReturnOrder();
}
