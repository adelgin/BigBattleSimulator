import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

abstract class Person {
    protected String name;
    protected String surname;
    protected Character character;
    protected Gender gender;
    protected long age;
    protected LocalDate BirthDate;
    public Person(Gender Gender, String name, String surname, Character Character, long age, LocalDate BirthDate) {
        this.name = name;
        this.surname = surname;
        this.gender = Gender;
        this.character = Character;
        this.age = age;
        this.BirthDate = BirthDate;
    }

    public Person() {}

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        String formattedDate = BirthDate.format(formatter);
        if (gender == Gender.MALE)
            return (name + " " + surname + ". He is a man. His personality is " + character + ". He was born at " + formattedDate + ". His age is " + age + ".");
        else
            return (name + " " + surname + ". She is a woman. Her personality is " + character + ". She was born at " + formattedDate + ". Her age is " + age + ".");
    }
}
