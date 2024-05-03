package inventory;

import java.util.*;

import item.*;

public class Inventory {
    private ItemShelf[] inventory;

    public Inventory(int n){
        inventory = new ItemShelf[n];
        intialEmptyInventory();
    }

    public ItemShelf[] getInventory(){
        return this.inventory;
    }

    public void setInventory(ItemShelf[] inventory){
        this.inventory = inventory;
    }

    //initializing the default state of inventory
    public void intialEmptyInventory(){
        int startcode = 101;
        for(int i = 0;i < inventory.length;i++){
            ItemShelf itemShelf = new ItemShelf();
            itemShelf.setItemCode(startcode);
            itemShelf.setSoldOut(true);
            itemShelf.setQuantity(0);
            inventory[i] = itemShelf;
            startcode++;
        }
    }

    //adding any item in the inventory
    public void addItem(Item item,int itemCode,int quantity){
        for(ItemShelf shelf: inventory){
            if(shelf.getItemCode() == itemCode){
                if(shelf.isSoldOut()){
                    shelf.setItem(item);
                    shelf.setSoldOut(false);
                    shelf.setQuantity(quantity);
                }
            }
        }
    }

    public Item getItem(int itemCode){
        for(ItemShelf shelf:inventory){
            if(shelf.getItemCode() == itemCode){
                if(shelf.isSoldOut()){
                    System.out.println("Item got soldOut");
                    return new Item();
                }else{
                    shelf.setQuantity(shelf.getQuantity()-1);
                    if(shelf.getQuantity() == 0) shelf.setSoldOut(true);

                    return shelf.getItem();
                }
            }
        }
        System.out.println("Itemcode doesn't exist");
        return new Item();
    }

    public void updateSoldOutItem(int itemCode){
        for(ItemShelf shelf:inventory){
            if(shelf.getItemCode() == itemCode){
                shelf.setSoldOut(true);
            }
        }
    }
}
