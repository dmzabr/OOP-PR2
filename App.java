import Classes.*;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
       Market market = new Market();
       iActorBehaviour item1 = new OrdinaryClient("Boris");
       iActorBehaviour item2 = new SpecialClient("Fedor", 1101);
       iActorBehaviour item3 = new SaleClient("Dmitriy", "Summary sale");
       iActorBehaviour item4 = new OrdinaryClient("Kirill");
       iActorBehaviour item5 = new SaleClient("Aleksey", "Pupsik sale");
       item4.setReturnOrder(true);
       item2.setReturnOrder(true);

       market.acceptToMarket(item1);
       market.acceptToMarket(item2);
       market.acceptToMarket(item3);
       market.acceptToMarket(item4);
       market.acceptToMarket(item5);

       market.update();
    }
}
