import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        School school = new School("Task1.School", "USA", LocalDate.of(2022, 02, 01));
        University university = new University("Task1.University", "Kyrgyzstan", LocalDate.of(2022, 10, 10));
        College college = new College("college", "Canada", LocalDate.of(2022, 9, 04));

        Student student1 = new Student("Rinat", "Kunduzov", "female", "America",LocalDate.of(2011,12,5), LocalDate.of(2023, 9, 01));
        Student student2 = new Student("Marsel", "Altynaev", "male","Africa",LocalDate.of(2001,5,3), LocalDate.of(2023, 9, 01));
        Student student3 = new Student("Altynai", "Bekieva", "female","London",LocalDate.of(2011,5,2),LocalDate.of(2023, 9, 01));
        Student student4 = new Student("Beka", "Nurislamov", "male","Australia",LocalDate.of(2011,5,2), LocalDate.of(2023, 9, 01));
        Student student5 = new Student("Nurislam", "Elzarov", "male","Europa",LocalDate.of(2011,5,2), LocalDate.of(2023, 9, 01));
        Student student6 = new Student("Elzar", "Ibrohimov", "male", "Africa",LocalDate.of(2011,5,2), LocalDate.of(2023, 9, 01));
        Student student7 = new Student("Ibrohim", "Ainazikov", "male","Zimbabve",LocalDate.of(2011,5,5), LocalDate.of(2023, 9, 01));
        Student student8 = new Student("Nuris", "Rinatova", "male","London",LocalDate.of(2011,5,2), LocalDate.of(2023, 9, 01));
        Student student9 = new Student("Rinatbek", "Kunduzov", "male","Kyrgyzstan",LocalDate.of(2100,5,5), LocalDate.of(2023, 9, 01));
        Student student10 = new Student("Kunduz", "Rinatbekov", "female","America",LocalDate.of(2000,5,5), LocalDate.of(2023, 9, 01));

        Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};
        mainMethod(students);

    }
    public static void mainMethod (Student[] students) {
        for (Student student : students) {
            System.out.println(student.getName());
            System.out.println(student.getSurname());
            System.out.println(student.getGender());
            System.out.println();
            System.out.println(student.getDateofstart());
            System.out.println(student.getFoundationyear().getEra().name());
            System.out.println("____________________");
        }
    }

    }





