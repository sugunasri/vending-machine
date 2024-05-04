package vendingmachine;

import coin.*;
import inventory.*;
import item.*;
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

    public void chooseProduct(VendingMachine vendingMachine,int itemCode){
        //Get item for itemcode
        //count the total amount paid by user
        //compare the product the price and amount paid by the user
        //dispenses the product

        Item item = vendingMachine.getInventory().getItem(itemCode);
        int paidByUser = 0;
        for(Coin coin:vendingMachine.getCoins()){
            paidByUser += coin.getValue();
        }
        if(item.getPrice() > paidByUser){
            refundFullMoney(vendingMachine);
            return;
        }else if(item.getPrice() == paidByUser){
            System.out.println("Amount sufficient");            
        }else {
            getChange(item.getPrice(), paidByUser);
            dispenseProduct(vendingMachine, itemCode);
            return;
        }
    }

    public List<Coin> refundFullMoney(VendingMachine vendingMachine){
        System.out.println("Refuding the full amount of money");
        vendingMachine.setState(new VendingMachineState());
        return vendingMachine.getCoins();
    }

    public void updateInventory(VendingMachine vendingMachine, Item item,int itemCode,int quantity){
        Inventory inventory = vendingMachine.getInventory();
        inventory.addItem(item, itemCode, quantity);
    }

    public void dispenseProduct(VendingMachine vendingMachine,int itemCode){
        System.out.println("Currently vending machine is in dispense state");
        System.out.println("Product has been dispensed");
        vendingMachine.getInventory().getItem(itemCode);
        vendingMachine.setState(new VendingMachineState());
    }

    public void getChange(int itemPrice, int paidByUser){
        System.out.println("Returned the change in the coin dispense tray: "+(paidByUser-itemPrice));
    }
}
