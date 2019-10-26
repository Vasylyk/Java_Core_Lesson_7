package task;

public abstract class Plane {
    private int length;
    private int width;
    private int weight;

    public Plane(int length, int width, int weight) {
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    void startEngine(){
        int timeToStart=(int)(Math.random()*69+20);
        System.out.println("Plane will be ready to fly in "+timeToStart+" minutes");
        System.out.println("Engine is started");
    }
    void planeTakeoff(){
        double distance = (double)(Math.random()*1001);
        System.out.println("Plane takeoff");
        System.out.println("Plane will fly with full tank "+distance+" km");
    }
    void planeLanding(){
        System.out.println("Plane is landing");
    }
}
