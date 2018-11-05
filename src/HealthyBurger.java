import java.util.ArrayList;
import java.util.List;

public class HealthyBurger extends Hamburger  {


   private List<Ingredient> additions=new ArrayList<>();

    HealthyBurger(String breadRollType, String meat, String name, double price) {
        super("Brown rye bread roll", meat, name, price);

    }


    public List<Ingredient> getAdditions() {
        return additions;
    }

    public void setAdditions(List<Ingredient> additions) {
        this.additions = additions;
    }

    @Override
    public void addAdditionsList(Ingredient addition) {
        if(additions.size()>2){
            System.out.println("You can add just 4 additional additions");
            return;
        }
        additions.add(addition);
        }

        @Override
        public double getFinalPrice(){
            double finalPrice=super.price;
            for(int i=0;i<additions.size();i++){
                Ingredient ingredient=additions.get(i);
                switch (ingredient){
                    case LETTUCE:
                        finalPrice+=ingredient.getPrice();
                        break;
                    case ONION:
                        finalPrice+=ingredient.getPrice();
                        break;
                    case TOMATO:
                        finalPrice+=ingredient.getPrice();
                        break;
                    case SAUCES:
                        finalPrice+=ingredient.getPrice();
                        break;
                    case PEPPER:
                        finalPrice+=ingredient.getPrice();
                        break;
                    case CABBAGE:
                        finalPrice+=ingredient.getPrice();
                        break;
                    case CUCUMBER:
                        finalPrice+=ingredient.getPrice();
                        break;
                        default:
                            break;

                }
            }
                            return finalPrice;
        }

        @Override
        public double getAdditionsPrice(){
            return getBasePrice();
        }



        }




