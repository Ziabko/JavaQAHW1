public class Person implements Printable {
    private String name;
    private int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public void print() {
        System.out.println(name + ": " + yearOfBirth);
    }
}