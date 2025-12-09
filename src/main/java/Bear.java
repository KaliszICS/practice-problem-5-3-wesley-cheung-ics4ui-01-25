class Bear extends Animal {

    public Bear(String name, int age, String type, int position) {
        super(name, age, type, position);
    }

    public void move() {
        this.position += 1;
    }
    
    @Override
    public String animalSound() {
        return "Roar";
    }
}