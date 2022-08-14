package labs_examples.objects_classes_methods.labs.objects;

public class PersonController {
    public static void main(String[] args) {
        Person person = new Person("Fred", "M", 32);
        Cat cat = new Cat("Shadow", "Tabby", 5 );

        System.out.println(person + " owns a cat that is " + cat);

    }

}
class Person{
   private String name;
    private String sex;
    private int age;

    public Person(String name, String sex, int age){
       this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
class Cat{
    private String name;
    private String breed;
    private int age;

    public Cat(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
