package productinventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
  
  private List<Product> products = new ArrayList<Product>();
  
  public void addProduct(Product product) {
    products.add(product);
  }
  
  public void removeProduct(Product product) {
    products.remove(product);
  }
  
  public int inventoryValue() {
    int result = 0;
    for (Product product : products) {
      result += product.getPrice() * product.getQuantity();
    }
    return result;
  }
  
}
