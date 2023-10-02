public class Car {
    //Attributes
    private int id;
    private String brand;
    private double speed = 0.0;
    private int milage = 0;
    private String owner;
    private int value;

    //Constructor
    public Car(int id, String brand, String owner, int value){
        this.id=id;
        this.brand=brand;
        this.owner=owner;
        this.value=value;
    }

    //Methods
    public void speedUp(double increase){
        if(this.speed+increase < 220){
            this.speed=this.speed+increase;
        }else{
            System.out.println("Speed is too high");
        }
    }

    public void slowDown(double decrease){
        if(this.speed-decrease > 0){
            this.speed=this.speed-decrease;
        }else{
            System.out.println("Speed cant go below 0 km/h");
        }
    }

    public void stop(){
        this.speed=0;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public double getSpeed() {
        return speed;
    }

    public int getMilage() {
        return milage;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner){
        this.owner=owner;
    }

    public int getValue() {
        return value;
    }
}
