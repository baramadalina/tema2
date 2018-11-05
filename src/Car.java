public class Car {

    private boolean engine;
    private int wheels;
    private int noOfCylindres;
    private String name;


    Car(int noOfCylindres,String name ){
        this.noOfCylindres=noOfCylindres;
        this.name=name;
        this.wheels=4;
        this.engine=true;
    }

    public boolean isEngine(){
        System.out.println("Here we return the engine in the base class :" +this.engine);
        return this.engine;}

    public int getWheels(){
        System.out.println("Here i return the wheels in the base class: " +this.wheels);
        return wheels;
    }
    public int getNoOfCylindres() {
        System.out.println("Here i return the no of cylinders in the base class :"+this.noOfCylindres);
        return noOfCylindres;
    }

    public String getName(){
        System.out.println("Here i return the name in the base class: "+this.name);
        return name;}


}
