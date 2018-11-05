public class Bmw extends Car {

    private String color;

    Bmw(int noOfCylindres, String name,String color) {
        super(noOfCylindres, name);
        this.color=color;
    }


    public String getColor() {
        System.out.println("The color of Bmw is: "+this.color);
        return color;
    }

    @Override
    public boolean isEngine(){
        System.out.println("This is the engine of the Bmw :"+super.isEngine());
        return super.isEngine();
    }
@Override
    public int getWheels(){
        System.out.println("These are my wheels for Bmw :"+super.getWheels());
         return super.getWheels();

    }

@Override
    public String getName(){
        System.out.println("The name of Bmw is: " +super.getName());
        return super.getName();}


}
