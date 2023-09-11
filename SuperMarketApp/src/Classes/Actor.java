package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    // public abstract class Actor implements iActorBehaviour {

    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    abstract public void setName(String name);

    abstract public String getName();

    @Override
    public void returnOrder() {
    }

}