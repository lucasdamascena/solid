package LSP.correct;

class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly();

        Penguin penguin = new Penguin();
        penguin.swim();  // Penguins swim, no fly method here
    }
}