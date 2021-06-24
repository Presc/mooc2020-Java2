
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Country> countries = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(parts -> new Country(parts[2].replace("(%)", "").trim(), parts[3],
                            Integer.parseInt(parts[4]), Double.parseDouble(parts[5])))
                    .forEach(countries::add);
        } catch (Exception e) {
            e.printStackTrace();
        }

        countries.stream().sorted((p1, p2) -> {
            if (p1.getLiteracyPercent() > p2.getLiteracyPercent()) {
                return 1;
            }
            if (p1.getLiteracyPercent() < p2.getLiteracyPercent()) {
                return -1;
            }
            return 0;
        }).forEach(System.out::println);
    }
}

class Country {

    private String gender;
    private String country;
    private int year;
    private double literacyPercent;

    public Country(String gender, String country, int year, double literacyPercent) {
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    public double getLiteracyPercent() {
        return literacyPercent;
    }

    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.literacyPercent;
    }

}
