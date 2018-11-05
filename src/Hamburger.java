public abstract class Hamburger{


    protected String breadRollType;
    protected String meat;
    protected String name;
    protected double price;

    public Hamburger(String breadRollType, String meat, String name, double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.name = name;
        this.price = price;
    }

    public String getBreadRollType() {
        return breadRollType; }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getBasePrice() {
        return this. price;
    }

    public abstract void addAdditionsList(Ingredient addition);

    public abstract double getFinalPrice();

    public abstract double getAdditionsPrice();

}
