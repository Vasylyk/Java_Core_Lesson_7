package task;

public class Main {
    public static void main(String[] args) {
        PlaneControls pc = new PlaneControls();
        Su27 su=new Su27(15,25,20,500,"grey", pc);
        su.startEngine();
        su.planeTakeoff();
        pc.moveUp();
        pc.moveLeft();
        pc.moveDown();
        pc.moveRight();
        su.stealth();
        su.nuclearStrike();
        su.turboSpeed();
        su.planeLanding();

    }
}
