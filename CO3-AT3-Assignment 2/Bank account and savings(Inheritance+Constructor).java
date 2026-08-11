import java.util.Scanner;

public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();

        String facultyId = sc.nextLine();
        String department = sc.nextLine();
        String specialization = sc.nextLine();
        int experience = sc.nextInt();

        Professor professor = new Professor(
            name, age, facultyId, department,
            specialization, experience
        );

        professor.displayDetails();

        sc.close();
    }
}

class Faculty extends Person {
    String facultyId;
    String department;

    Faculty(String name, int age, String facultyId, String department) {
        super(name, age);
        this.facultyId = facultyId;
        this.department = department;
    }
}

class Professor extends Faculty {
    String specialization;
    int experience;

    Professor(String name, int age, String facultyId, String department,
              String specialization, int experience) {

        super(name, age, facultyId, department);
        this.specialization = specialization;
        this.experience = experience;
    }

    void displayDetails() {
        System.out.println("Professor Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Department: " + department);
        System.out.println("Specialization: " + specialization);
        System.out.println("Years of Experience: " + experience);
    }
}