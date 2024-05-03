package item;

public class ItemShelf {
    private int itemcode;
    private Item item;
    private boolean SoldOut;
    private int quantity;

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public int getQuantity(){
        return this.quantity;
    }

    public Item getItem(){
        return this.item;
    }

    public void setItem(Item item){
        this.item = item;
    }

    public int getItemCode(){
        return this.itemcode;
    }
    public void setItemCode(int code){
        this.itemcode = code;
    }
    public boolean isSoldOut(){
        return this.SoldOut;
    }
    public void setSoldOut(boolean soldout){
        this.SoldOut = soldout;
        if(soldout == true){
            this.quantity = 0;
        }
    }
}
