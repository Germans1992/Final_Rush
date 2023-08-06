package deTelranTitovsGermans.Homework2;

public abstract class Animal {

    public String name;
    public String color;

    public Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void voice() {
        System.out.println("Животные говорят");
    }

    public void eat(String food){
        if (food.equalsIgnoreCase("meat")) {
            System.out.println("Травоядное: Я такое не ем");
        } else {
            System.out.println("Травоядное: Я ем " + food);
        }
    }
        public static void main(String[] args) {
            Animal animal1 = new Herbivore();
            Animal animal2 = new Predator();

            animal1.eat("grass"); // Output: Травоядное: Я ем grass
            animal2.eat("meat");  // Output: Плотоядное: Я ем meat
            animal1.eat("meat");  // Output: Травоядное: Я такое не ем
        }

        public void jump( int numberOfJumps){
            for (int i = 0; i < numberOfJumps; i++) {
                System.out.println("Прыжок #" + (i + 1));
            }
        }
    public void jump(double distance){
        System.out.println("прыжок на расстояние " + distance + " метров.");
    }
    public void jump(int numberOfJumps, double distance){
        System.out.println("выполнено " + numberOfJumps + "прыжков на расстоние " + distance + " метров каждый");
    }
    public String toString(String name, String color){
        return "Animal: {name: " + name + ", color: " + color + " }";
    }
    }


