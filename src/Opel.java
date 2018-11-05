public class Opel extends Car{

    int price;

    Opel(int noOfCylindres, String name,int price) {
        super(noOfCylindres, name);
        this.price=price;


    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean isEngine(){
        System.out.println("This is the engine of the Opel "+super.isEngine());
        return super.isEngine();
    }


    @Override
    public int getWheels(){
        System.out.println("These are the wheels for Opel "+super.getWheels());
        return super.getWheels();
    }
    @Override
    public String getName(){
        System.out.println("The  name is: "+super.getName());
        return super.getName();}

}
