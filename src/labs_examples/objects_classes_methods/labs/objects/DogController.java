package labs_examples.objects_classes_methods.labs.objects;

public class DogController {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Sparkie", "lab", 10);
        System.out.println(dog1.toString());
        Dog dog2 = new Dog("Ralph", 7);
        System.out.println(dog2.toString());
        Dog dog3 = new Dog("Spot");
        System.out.println(dog3.toString());

    }
}
class Dog{
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Dog(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
