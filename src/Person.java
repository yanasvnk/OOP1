public class Person {
    public int yearOfBirth;
    public String name;
    public String town;
    public String jobTitle;

    public Person(int yearOfBirth, String name, String town, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;

        // Домашнее задание 3
        // Задача 1
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name==null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town==null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle==null) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
        }
    }

