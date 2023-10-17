public class Product {
    String name;
    ProductType productType;

    public Product(String name, ProductType productType) {
        this.name = name;
        this.productType = productType;
    }

    public void printProductDetails(){
        System.out.println("Product Name -->"+productType);
        productType.printTypeDetails();
    }

    public static void main(String[] args) {
        Product product=new Product("Vegetable",ProductType.PIZZA);
        product.printProductDetails();
    }
}


