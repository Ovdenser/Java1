package Lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Technician", "pepetr@mailbox.com", "892312583", 25000, 27);
        persArray[2] = new Person("Fedorov Fedor", "Driver", "fefedor@mailbox.com", "892312777", 37000, 42);
        persArray[3] = new Person("Alexeev Alexey", "Builder", "alalex@mailbox.com", "892312521", 22000, 36);
        persArray[4] = new Person("Bob Dylan", "Interpreter", "bobdy@mailbox.com", "892312659", 39000, 79);

        for(Person person : persArray) {
            if(person.Old40() > 40) person.Select();
        }
    }

    static class Person {
        String FIO;
        String position;
        String email;
        String phone;
        double salary;
        int age;

        public Person(String FIO, String position, String email, String phone, double salary, int age) {
            this.FIO = FIO;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        int Old40() {
            return age;
        }

        public void Select() {
            System.out.println(FIO + " " + position + " " + email + " " + phone + " " + salary + " " + age);
        }
    }
}