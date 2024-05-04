import item.Item;
import item.ItemShelf;
import item.ItemType;
import vendingmachine.*;

public class App {
    public static void main(String[] args) throws Exception {
        VendingMachine vendingMachine = new VendingMachine();
        System.out.println("| FILL THE INVENTORY |");
        fillInventory(vendingMachine);
        System.out.println("| DISPLAY THE INVENTORY |");
        displayInventory(vendingMachine);
    }




    private static void displayInventory(VendingMachine vendingMachine){
        ItemShelf[] itemShelfSlots = vendingMachine.getInventory().getInventory();
        for(ItemShelf shelf: itemShelfSlots){
            System.out.println("Item Code: "+shelf.getItemCode()+" Item: "+shelf.getItem().getType()+" Item price: "+shelf.getItem().getPrice()+" IsAvailable: "+ shelf.isSoldOut());
        }
    }

    private static void fillInventory(VendingMachine vendingmachine){
        ItemShelf[] itemShlef = vendingmachine.getInventory().getInventory();
        for(int i=0;i<itemShlef.length;i++){
            Item item = new Item();
            switch(i){
                case 0:
                    item.setItemType(ItemType.OREO);
                    item.setPrice(30);
                    break;
                case 1:
                    item.setItemType(ItemType.SNICKERS);
                    item.setPrice(25);
                    break;
                case 2:
                    item.setItemType(ItemType.SODA);
                    item.setPrice(20);
                    break;
                case 3:
                    item.setItemType(ItemType.CANDIES);
                    item.setPrice(10);
                    break;
                case 4:
                    item.setItemType(ItemType.COKE);
                    item.setPrice(40);
                    break;
                case 5:
                    item.setItemType(ItemType.MandMs);
                    item.setPrice(5);
                    break;
                case 6:
                    item.setItemType(ItemType.LAYS);
                    item.setPrice(20);
                    break;
                case 7:
                    item.setItemType(ItemType.CHEWINGGUM);
                    item.setPrice(5);
                    break;
                case 8:
                    item.setItemType(ItemType.FANTA);
                    item.setPrice(35);
                    break;
                default:
                    System.out.println("Nothing");
            }
        }
    }
}
// public enum ItemType {
//     OREO,
//     SNICKERS,
//     SODA,
//     CANDIES,
//     COKE,
//     MandMs,
//     LAYS,
//     CHEWINGGUM,
//     FANTA
// }