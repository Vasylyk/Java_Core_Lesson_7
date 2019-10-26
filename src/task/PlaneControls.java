package task;

public class PlaneControls{
    void moveUp(){
        int distance = (int)(Math.random()*10000);
        System.out.println("Plane fly up "+distance+" meters");
    }
    void moveDown(){
        int distance = (int)(Math.random()*10000);
        System.out.println("Plane fly down "+distance+" meters");
    }
    void moveRight(){
        int distance = (int)(Math.random()*10000);
        System.out.println("Plane fly right "+distance+" meters");
    }
    void moveLeft(){
        int distance = (int)(Math.random()*10000);
        System.out.println("Plane fly left "+distance+" meters");
    }

}
