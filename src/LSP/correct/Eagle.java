package LSP.correct;

class Eagle extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("The eagle is flying.");
    }
}