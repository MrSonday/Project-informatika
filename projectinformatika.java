
abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    
    public abstract void sound();

    
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) this.age = age;
        else System.out.println("Umur tidak valid");
    }
}


class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    
    @Override
    public void sound() {
        System.out.println(name + " menggonggong: Woof woof!");
    }
}


class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    
    @Override
    public void sound() {
        System.out.println(name + " mengeong: Meow~");
    }
}


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.setAge(5);
        System.out.println("Umur " + dog.name + " adalah " + dog.getAge() + " tahun");
        dog.sound();

        Cat cat = new Cat("Mimi");
        cat.setAge(3);
        System.out.println("Umur " + cat.name + " adalah " + cat.getAge() + " tahun");
        cat.sound();
    }
}