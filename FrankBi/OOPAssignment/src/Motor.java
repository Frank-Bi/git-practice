public class Motor{

    public int motorId;
    public double speed;

    public Motor(int id){
        motorId = id;
    }//end Motor

    public void setSpeed(double speed){
        this.speed = speed;
        System.out.println("motor " + motorId + " speed set to " + speed);
    }//end setSpeed
}//end Motor