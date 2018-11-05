import java.util.List;

public class DeluxeBurger extends Hamburger  {

    private String chips;
    private String drinks;


    DeluxeBurger(String breadRollType, String meat, String name, double price,String chips,String drinks) {
        super(breadRollType, meat, name, price);
        this.chips=chips;
        this.drinks=drinks;

    }

    public String getChips() {
        return chips;
    }

    public void setChips(String chips) {
        this.chips = chips;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    @Override
    public void addAdditionsList(Ingredient toAdd) {
        System.out.println("we can not add other additions ");
    }

    @Override
    public double getFinalPrice(){
        return getBasePrice();

    }

    @Override
    public double getAdditionsPrice(){
        return super.price;
    }
}
