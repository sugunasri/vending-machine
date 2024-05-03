package vendingmachine;

import coin.*;
import java.util.*;

public class VendingMachineState {
    public VendingMachineState(){
        System.out.println("Vending Machine is in Idle state");
    }
    
    public void selectionState(){
        System.out.println("Vendhing Machine has Money it");
    }
    public void insertCoin(Coin coin){
        System.out.println("Accepted the coin");

    }

    public void chooseProduct(){

    }

    public List<Coin> refundFullMoney(){

        return new ArrayList<>();
    }

    public void updateInventory(){

    }

    public void dispenseProduct(){

    }

    public int getChange(){
        return 0;
    }
}
