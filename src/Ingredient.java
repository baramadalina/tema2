public enum Ingredient {
    CABBAGE("cabbage", 2.2), CUCUMBER("cucumber", 3.0),LETTUCE("lettuce",1.6),
    ONION("onion",2.0),TOMATO("tomato",2.5),SAUCES("sauces",2.3),
    PEPPER("pepper",2.5);

    public String name;
    public double price;

    Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

}


