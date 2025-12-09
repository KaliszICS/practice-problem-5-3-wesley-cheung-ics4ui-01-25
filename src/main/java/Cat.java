class Cat extends Animal {

    public Cat(String name, int age, String type, int position) {
        super(name, age, type, position);
    }

    public void move() {
        this.position += 5;
    }

    @Override
    public String animalSound() {
        return "Meow";
    }
}