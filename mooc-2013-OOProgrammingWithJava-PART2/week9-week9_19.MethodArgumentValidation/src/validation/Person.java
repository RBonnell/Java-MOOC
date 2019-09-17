package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        if (name == null || name.isEmpty() || name.length() > 40){
            throw new IllegalArgumentException("Name must be 1-40 characters in length");
        }
        if (age > 120 || age < 0){
            throw new IllegalArgumentException("Age must be between 0-120 years");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
