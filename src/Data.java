/**
 * Represents one row from your dataset.
 *
 * TODO:
 *  - Rename the class to match your dataset (e.g., Pokemon, StateData, CountryStat)
 *  - Add at least 3 private attributes based on your CSV columns
 *  - Write a constructor that initializes all attributes
 *  - Add getter methods for the attributes you need in your analysis
 *  - Override toString() to display the object's data
 *  - Add Javadoc comments for the class and all methods
 */
public class Data {

    // TODO: Add at least 3 private attributes
    // Example:
    private String state;
    private int population;
    private int drugDeaths;


    // TODO: Create a constructor that takes all attributes as parameters

    public Data(String state, int population, int drugDeaths) {
        this.state = state;
        this.population = population;
        this.drugDeaths = drugDeaths;
    }

    // TODO: Add getters for attributes you need
    public String getState() {
        return state;
    }

    public int getPopulation() {
        return population;
    }

    public int getDrugDeaths() {
        return drugDeaths;
    }

    // TODO: Add other data analysis methods

    // TODO: Override toString() to return a readable representation of your object
    @Override
    public String toString() {
        return "Data{" +
                "state='" + state + '\'' +
                ", population=" + population +
                ", drugDeaths=" + drugDeaths +
                '}';
    }

}