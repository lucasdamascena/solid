package LSP.wrong;

class Main {
    public static void main(String[] args) {
        Bird eagle = new Bird();
        eagle.fly();

        Bird penguin = new Penguin();  // LSP violation
        penguin.fly();  // Throws an exception
    }
}