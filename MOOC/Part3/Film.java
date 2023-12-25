public class Film {
    private String name;
    private int ageRating;
    public Film(String initialName, int initialAgeRating) {
        this.name = initialName;
        this.ageRating = initialAgeRating;
    }
    public String getName() {
        return name;
    }
    public int getAgeRating() {
        return ageRating;
    }
}
