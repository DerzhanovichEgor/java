package by.derzhanovich.learn.auto;

public class Auto {
   private Wheel rightForwardWheel;
    private Wheel leftForwardWheel;
   private Wheel rightBackWheel;
    private Wheel leftBackWheel;
    private String model;
    private int count = 1;
    private Wheel spareWheel = new Wheel();
    Engine engine;


    public Wheel getRightForwardWheel() {
        return rightForwardWheel;
    }

    public void setRightForwardWheel(Wheel rightForwardWheel) {
        this.rightForwardWheel = rightForwardWheel;
    }

    public Wheel getLeftForwardWheel() {
        return leftForwardWheel;
    }

    public void setLeftForwardWheel(Wheel leftForwardWheel) {
        this.leftForwardWheel = leftForwardWheel;
    }

    public Wheel getRightBackWheel() {
        return rightBackWheel;
    }

    public void setRightBackWheel(Wheel rightBackWheel) {
        this.rightBackWheel = rightBackWheel;
    }

    public Wheel getLeftBackWheel() {
        return leftBackWheel;
    }

    public void setLeftBackWheel(Wheel leftBackWheel) {
        this.leftBackWheel = leftBackWheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Auto(Wheel rightForwardWheel, Wheel leftForwardWheel, Wheel rightBackWheel, Wheel leftBackWheel, String model, Engine engine) {
        this.rightForwardWheel = rightForwardWheel;
        this.leftForwardWheel = leftForwardWheel;
        this.rightBackWheel = rightBackWheel;
        this.leftBackWheel = leftBackWheel;
        this.model = model;
        this.engine = engine;
    }

    public Auto(String model) {
        this.model = model;
    }

    public String getModel() {
        return "Your car's model is - " + model;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                '}';
    }

    public void go(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public Wheel changeWheel(Wheel wheel){
      return wheel.changeWheel(wheel);

    }
    public void refuel(){
        System.out.println("Auto is refueled");
    }
}
