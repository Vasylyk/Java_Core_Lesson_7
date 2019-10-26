package task;

public class Su27 extends Plane implements SpecialAbilities{
    private int maxSpeed;
    private String color;
    private PlaneControls pc;

    public Su27(int length, int width, int weight, int maxSpeed, String color, PlaneControls pc) {
        super(length, width, weight);
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.pc = pc;
    }

    @Override
    public void turboSpeed() {
        int turbo = (int)(Math.random()*300+this.maxSpeed+1);
        System.out.println("Su-27 use turbo speed and run away");
        System.out.println("Su-27 fly with turbo speed "+turbo+" km/h");
    }

    @Override
    public void stealth() {
        int stealthTime = (int)(Math.random()*1000);
        System.out.println("Stealth activated");
        System.out.println("Plane will be invisible during "+stealthTime+" minutes");
    }

    @Override
    public void nuclearStrike() {
        int numberOfBomb=(int)(Math.random()*11);
        System.out.println("Plane has "+numberOfBomb+" nuclear bombs");
        System.out.println("Plane use nuclear strike");
    }
}
