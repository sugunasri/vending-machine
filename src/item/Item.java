package item;

public class Item {
    private ItemType itemType;
    private int price;

    public ItemType getItemType() {
        return this.itemType;
    }
    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }
    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}
