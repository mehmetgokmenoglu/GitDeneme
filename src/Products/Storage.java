package Products;
import PrintPack.Print;

public class Storage extends Print{
        private String productCategory;
        private int productPriority = 0;
        private int stock;
        private final int storageArea = 1000;

    public Storage(String productCategory, int stock) {
        this.productCategory = productCategory;
        this.stock = stock;
    }

    public void productStockControl(){
        if(stock <= 0){
            System.out.println("Out of stock");
        }
        else{
            System.out.println("Stock available");
        }
    }

    public void productCategoryControl(){
        if(productCategory.equalsIgnoreCase("Foods")){
            productPriority = productPriority + 6;
        }
        else if(productCategory.equalsIgnoreCase("Textile")){
            productPriority = productPriority + 5;
        }
        else if(productCategory.equalsIgnoreCase("Furniture")){
            productPriority = productPriority + 4;
        }
        else if(productCategory.equalsIgnoreCase("Industrial")){
            productPriority = productPriority + 3;
        }
        else if(productCategory.equalsIgnoreCase("Electronics")){
            productPriority = productPriority + 2;
        }
        else if(productCategory.equalsIgnoreCase("Valuable")){
            productPriority = productPriority + 1;
        }
    }

    @Override
    public void printInfo() {
        productStockControl();
        productCategoryControl();
        System.out.println("Product Category: " + productCategory);
        System.out.println("Product Priority: " + productPriority);
        System.out.println("Stock: " + stock);
    }
}