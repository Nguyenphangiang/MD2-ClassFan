public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = slow;
    private double radius = 5;
    private String color = "blue";
    private boolean running = false;
    public Fan(){

    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(int speed,double radius,String color,boolean running) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.running=running;
    }

    @Override
    public String toString() {
        if (running){
            return "Fan is running." +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'';
        }else {
            return "Fan is off." +
                    "radius=" +radius +
                    ", color='" + color + '\'';
        }
    }
}
