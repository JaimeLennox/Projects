package productinventory;

public class Product {
  
  private int price;
  private int id;
  private int quantity;
  
  public Product(int price, int id, int quantity) {
    this.id = id;
    
    setPrice(price);
    setQuantity(quantity);
  }
  
  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getId() {
    return id;
  }

  public int getQuantity() {
    return quantity;
  }
  
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Product) {
      return id == ((Product) obj).id;
    }
    return false;
  }
  
  @Override
  public int hashCode() {
    return id * 31 * 19;
  }

}
