package inventory;

import item.ItemShelf;

public class Inventory {
    private ItemShelf[] inventory;

    public Inventory(int n){
        this.inventory = new ItemShelf[n];
        intialiseInventory();
    }

    public ItemShelf[] getInventory(){
        return this.inventory;
    }
    public void setInventory(ItemShelf[] inventory){
        this.inventory = inventory;
    }

    private void intialiseInventory(){
        int startcode = 101;
        for(int i=0;i<inventory.length;i++){
            ItemShelf itemShelf = new ItemShelf();
            itemShelf.setItemCode(startcode);
            itemShelf.setSoldOut(true);
            inventory[i] = itemShelf;
            startcode++;
        }
    }
}
