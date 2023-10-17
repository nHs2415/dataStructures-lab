public enum ProductType {
    PIZZA("Low","Medium","High"),
    CAKE("High","Low","Medium"),
    SALAD("Low","Medium","Low");
    String sugar;
    String salt;
    String fat;

    ProductType(String sugar, String salt, String fat) {
        this.sugar = sugar;
        this.salt = salt;
        this.fat = fat;
    }

    public void printTypeDetails(){
        System.out.println("PIZZA : \t sugar-->"+PIZZA.sugar+"\t salt-->"+PIZZA.salt+"\t fat-->"+PIZZA.fat);
        System.out.println("CAKE  : \t sugar-->"+CAKE.sugar+"\t salt-->"+CAKE.salt+"\t fat-->"+CAKE.fat);
        System.out.println("SALAD : \t sugar-->"+SALAD.sugar+"\t salt-->"+SALAD.salt+"\t fat-->"+SALAD.fat);

    }
}
