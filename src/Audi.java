public class Audi extends Car {

    private String fuel;

    Audi(int noOfCylindres, String name,String fuel) {
        super(noOfCylindres, name);
        this.fuel=fuel;
    }


    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean isEngine(){
        System.out.println("This is the engine of the Audi "+super.isEngine());
        return super.isEngine();
    }

    @Override
    public int getWheels(){
        System.out.println("These are the wheels for Audi"+super.getWheels());
        return super.getWheels();
    }

    @Override
    public String getName(){
        System.out.println("The  name is: "+super.getName());
        return super.getName();}

    @Override
    public int  getNoOfCylindres(){
        System.out.println("The nr of cylinders for Audi are: "+super.getNoOfCylindres());
        return super.getNoOfCylindres();
    }


}
