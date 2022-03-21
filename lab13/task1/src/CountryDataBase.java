

public class CountryDataBase {
    private String nameCity;
    private String nameCountry;
    private int population;
    private int id;

    public CountryDataBase(String nameCity, String nameCountry, int population, int id) {
        this.nameCity = nameCity;
        this.nameCountry = nameCountry;
        this.population = population;
        this.id = id;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void display()
    {
        System.out.println("-----------------");
        System.out.println("name of city : " + nameCity);
        System.out.println("name of country : " + nameCountry);
        System.out.println("Population : " + population);
        System.out.println("ID : " + id);
    }

}
