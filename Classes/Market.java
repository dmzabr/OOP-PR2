package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

public class Market implements iMarketBehaviour,iQueueBehaviour{
    private List<iActorBehaviour> queue;

    /**
     * Конструктор без параметров. Выделяет память для очереди
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /**
     * Метод запускает клиента в магазин
     * @param actor Клиент
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /**
     * Метод добавляет клиента в очередь
     * @param actor Клиент
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
    }


    /**
     * Метод выпускает клиентов из магазина
     * @param actors список из клиентов
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    /**
     * Метод проводит все доступные манимуляции со всеми клиентами в очереди(Сделать заказ, получить заказ, возврат заказа(если true) и выход из очереди)
     */
    @Override
    public void update() {
       takeOrder();
       giveOrder();
       returnOrder();
       releaseFromQueue();
    }

    /**
     * Метод эмулирует выдачу заказа клиенту
     */
    @Override
    public void giveOrder() {
        for(iActorBehaviour actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
    }

    /**
     * Метод убирает клиента из очереди, если он забрал свой заказ
     */
    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>();
       for(iActorBehaviour actor:queue)
       {
            if(actor.isTakeOrder())
            {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
            }
       }
    releaseFromMarket(releaseActors);
    }

    /**
     * Метод позволяет клиенту делать заказ
     */
    @Override
    public void takeOrder() {
        for(iActorBehaviour actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");
            }
        }
    }

    /**
     * Метод позволяет клиентам возвращает заказ
     */
    @Override
    public void returnOrder() {
        for(iActorBehaviour actor: queue)
        {
            if(actor.isReturnOrder())
            {
                System.out.println(actor.getActor().getName()+" вернул заказ(");
            }
        }
    }
}
