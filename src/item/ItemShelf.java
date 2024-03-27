package item;

public class ItemShelf {
    private int itemcode;
    private Item item;
    private boolean soldOut;

    public Item getItem(){
        return this.item;
    }

    public void setItem(Item item){
        this.item = item;
    }

    public int getItemCode(){
        return this.itemcode;
    }

    public void setItemCode(int itemcode){
        this.itemcode = itemcode;
    }

    public void setSoldOut(boolean soldOut){
        this.soldOut = soldOut;
    }
    public boolean getSoldOut(){
        return this.soldOut;
    }
}
