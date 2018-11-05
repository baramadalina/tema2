public class BurgerShop {

    public static void main(String[]args){


        HealthyBurger h1 = new HealthyBurger("BlackRoll","pork","Healthy",10);
        h1.addAdditionsList(Ingredient.CABBAGE);
        h1.addAdditionsList(Ingredient.TOMATO);
        h1.addAdditionsList(Ingredient.LETTUCE);
        h1.addAdditionsList(Ingredient.SAUCES);
        System.out.println(h1.getAdditionsPrice());
        System.out.println(h1.getFinalPrice());

        DeluxeBurger h2=new DeluxeBurger("WHITE  ROLL","chicken","healthy",12,"fires","cola");
        h2.addAdditionsList(Ingredient.TOMATO);
         System.out.println(h2.getAdditionsPrice());
        System.out.println(h2.getFinalPrice());




    }
}
