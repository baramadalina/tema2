public class Room {


    private Bed b;//obiect aflat in cameera
    private Tv t;//obiect aflat in camera

    Room(){
        this.b=new Bed();
        this.t=new Tv();
        b.setColor("Brown");
        b.setDimension(2);
        t.setNrOfChannels(40);
    }

    public String getColor(){
       return b.getColor();
    }

    public int getDimension(){
       return b.getDimension();
    }

    public int getNrOfChannels(){
        return t.getNrOfChannels();
    }



}
