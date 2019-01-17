package entity;

public class Item {
    private Integer itemID;
    private String itemName;
    private Integer itemClassid;
    private Integer stock;
    private float price;
    private String info;
    private String imagePath;

    public Item(Integer itemID, String itemName, Integer itemClassid, Integer stock, float price, String info, String imagePath) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemClassid = itemClassid;
        this.stock = stock;
        this.price = price;
        this.info = info;
        this.imagePath = imagePath;
    }

    public Item(String itemName, Integer itemClassid, Integer stock, float price, String info, String imagePath) {
        this.itemName = itemName;
        this.itemClassid = itemClassid;
        this.stock = stock;
        this.price = price;
        this.info = info;
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemID=" + itemID +
                ", itemName='" + itemName + '\'' +
                ", itemClassid=" + itemClassid +
                ", stock=" + stock +
                ", price=" + price +
                ", info='" + info + '\'' +
                ", imagePath='" + imagePath + '\'' +
                '}';
    }

    public Integer getItemID() {
        return itemID;
    }

    public void setItemID(Integer itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemClassid() {
        return itemClassid;
    }

    public void setItemClassid(Integer itemClassid) {
        this.itemClassid = itemClassid;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
