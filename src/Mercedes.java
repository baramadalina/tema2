public class Mercedes extends Car {

    private double speed;


    Mercedes(double speed){
        super(7,"sgsgs");
        this.speed=speed;
    }


   @Override
    public boolean isEngine(){
        System.out.println("The engine for mercedes:" +super.isEngine());
        return super.isEngine();
   }


}
