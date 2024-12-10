import java.time.LocalDate;

public abstract class  Educationcenter {
    String name;
    String locatedcountry;
    LocalDate foundationyear;

    public Educationcenter(String name, String locatedcountry, LocalDate foundationyear) {
        this.name = name;
        this.locatedcountry = locatedcountry;
        this.foundationyear = foundationyear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocatedcountry() {
        return locatedcountry;
    }

    public void setLocatedcountry(String locatedcountry) {
        this.locatedcountry = locatedcountry;
    }

    public LocalDate getFoundationyear() {
        return foundationyear;
    }

    public void setFoundationyear(LocalDate foundationyear) {
        this.foundationyear = foundationyear;
    }
}
