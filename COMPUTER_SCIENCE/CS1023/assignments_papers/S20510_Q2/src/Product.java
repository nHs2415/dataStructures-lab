import javax.swing.plaf.PanelUI;

class Product{
    String name;
    ProductType productType;
    public Product(String name,ProductType productType){
        this.name=name;
        this.productType=productType;
    }

    public void printProductDetails(){
        System.out.println("Product Type --> "+productType);
        productType.printDetails();
    }

}

enum ProductType{
    PIZZA("Low","Medium","High"),
    CAKE("High","Low","Medium"),
    SALAD("Low","Medium","Low");
    String sugar;
    String salt;
    String fat;
    private ProductType(String sugar,String salt,String fat){
        this.sugar=sugar;
        this.salt=salt;
        this.fat=fat;
    }

    public void printDetails(){
        System.out.println("Pizza :\t "+ "\tSugar --> "+PIZZA.sugar+"\tSalt --> "+PIZZA.salt+"\tFat --> "+PIZZA.fat);
        System.out.println("CAKE :\t "+ "\tSugar --> "+CAKE.sugar+"\tSalt --> "+CAKE.salt+"\tFat --> "+CAKE.fat);
        System.out.println("SALAD :\t "+ "\tSugar --> "+SALAD.sugar+"\tSalt --> "+SALAD.salt+"\tFat --> "+SALAD.fat);

    }

}

class Main{
    public static void main(String[] args) {
        Product product=new Product("Vegetable Pizza",ProductType.PIZZA);
        System.out.println("Product Name --> "+product.name);
        product.printProductDetails();

    }
}

/*
--------------------------------------s20510_Q2-------------------------------------------------------------------------
 */


