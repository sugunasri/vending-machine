package vendingmachine;

import java.util.*;
import coin.*;
import inventory.Inventory;

public class VendingMachine {
    private VendingMachineState vendingMachineState;
    private Inventory inventory;
    private List<Coin> coins;

    public VendingMachine(){
        vendingMachineState = new VendingMachineState();
        inventory = new Inventory(10);
        coins = new ArrayList<>();
    }

    public VendingMachineState getState(){
        return this.vendingMachineState;
    }

    public void setState(VendingMachineState vendingMachineState){
        this.vendingMachineState = vendingMachineState;
    }

    public void setInventory(Inventory inventory){
        this.inventory = inventory;
    }

    public Inventory getInventory(){
        return this.inventory;
    }

    public void setCoins(ArrayList<Coin> coins){
        this.coins = coins;
    }

    public List<Coin> getCoins(){
        return this.coins;
    }
}
