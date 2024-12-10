import java.time.LocalDate;

public class Student extends Educationcenter{
    private String name;
    private String surname;
    private String gender;
    private LocalDate dateofstart;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateofstart() {
        return dateofstart;
    }

    public void setDateofstart(LocalDate dateofstart) {
        this.dateofstart = dateofstart;
    }

    public Student(String name, String surname, String gender, String locatedcountry, LocalDate foundationyear, LocalDate dateofstart) {
       super(name,locatedcountry, foundationyear       );
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateofstart = dateofstart;

    }
}
