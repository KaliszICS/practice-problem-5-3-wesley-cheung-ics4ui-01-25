class Bird extends Animal {

    public Bird(String name, int age, String type, int position) {
        super(name, age, type, position);
    }

    public void move() {
        this.position += 50;
    }
    
    @Override
    public String animalSound() {
        return "Chirp";
    }
}