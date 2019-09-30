public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return this.altitude;
    }
    public void setAltitude(int altitude){
        this.altitude = altitude;
    }

    public boolean isFlying() {
        return this.flying;
    }
    public void setFlying(boolean flying){
        this.flying = flying;
    }
    @Override
    public void takeOff(){
        if (!this.flying && this.altitude == 0){
            this.flying = true;
            System.out.printf("%s takes off in the sky.%n", this.getName());
        }
    }
    @Override
    public int ascend (int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 325);
            System.out.printf("%s flies upward, altitude : %s.%n ", this.getName(), this.getAltitude());
        }
        return this.altitude;
    }
    @Override
    public int descend (int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.printf("%s flies downward, altitude : %s.%n ", this.getName(), this.getAltitude());
        }
        return this.altitude;
    }
    @Override
    public void land() {
        if (this.flying && this.altitude == 0) {
            System.out.printf("%s lands on the ground.%n", this.getName());
        }else {
            System.out.printf("%s cannot land.%n", this.getName());
           
        }
    }
    @Override
    public String sing() {
        return "Screech!";
    }
}
