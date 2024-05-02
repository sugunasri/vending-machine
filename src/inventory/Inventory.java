package inventory;

import item.Item;
import item.ItemShelf;

public class Inventory {
    private ItemShelf[] inventory;

    public Inventory(int n){
        inventory = new ItemShelf[n];
        intializeInventory();
    }

    public ItemShelf[] getInventory(){
        return this.inventory;
    }

    public void setInventory(ItemShelf[] inventory){
        this.inventory = inventory;
    }
    private void intializeInventory(){
        int startcode = 101;
        for(int i=0;i<inventory.length;i++){
            ItemShelf itemShelf = new ItemShelf();
            itemShelf.setItemCode(startcode++);
            itemShelf.setSoldOut(true);
            inventory[i] = itemShelf;
        }
    }
    public void addItem(Item item,int itemCode){
        for(ItemShelf shelf: inventory){
            if(shelf.getItemCode() == itemCode){
                shelf.setItem(item);
                shelf.setSoldOut(false);
            }
        }
    }

    public Item getItem(int itemCode){
        for(ItemShelf shelf: inventory){
            if(shelf.getItemCode() == itemCode){
                if(shelf.isSoldOut()){
                    System.out.println("Item got sold out! SORRY");
                    return new Item();
                }else{
                    updateSoldOutItem(itemCode);
                    return shelf.getItem();
                }
            }
        }
        System.out.println("Entered an invalid code");
        return new Item();
    }

    public void updateSoldOutItem(int itemCodenum){
        for(ItemShelf shelf:inventory){
            if(shelf.getItemCode() == itemCodenum){
                shelf.setSoldOut(true);
            }
        }
    }
}
