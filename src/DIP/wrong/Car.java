package DIP.wrong;

class Car {
    private GasEngine engine;

    public Car() {
        engine = new GasEngine();
    }

    public void startCar() {
        engine.start();
        System.out.println("Car is running.");
    }
}