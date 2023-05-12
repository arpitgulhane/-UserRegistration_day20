package day29;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CSVStateCensus {
    private String state;
    private int population;
    // Add more fields if necessary

    public CSVStateCensus(String state, int population) {
        this.state = state;
        this.population = population;
    }
    // Getters and setters for fields
    @Override
    public String toString() {
        return "State: " + state + ", Population: " + population;
    }
}

class StateCensusAnalyser {
    private List<CSVStateCensus> censusData;
    public StateCensusAnalyser() {
        censusData = new ArrayList<>();
    }

    public void loadCensusData(String csvFile) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String state = data[0];
                int population = Integer.parseInt(data[1]);

                CSVStateCensus census = new CSVStateCensus(state, population);
                censusData.add(census);
            }
        }
    }

    public void printCensusData() {
        for (CSVStateCensus census : censusData) {
            System.out.println(census);
        }
    }
}

public class LoadIndianCensusCSV {
    public static void main(String[] args) {
        StateCensusAnalyser analyser = new StateCensusAnalyser();
        try {
            analyser.loadCensusData("state_census.csv");
            analyser.printCensusData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
