package DIP.correct;

class GasEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Gas engine started.");
    }
}