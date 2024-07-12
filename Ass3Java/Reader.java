import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Reader {

    // Method to read the CSV file and return a LinkedHashMap of patient records
    public Map<Integer, Patient> readFile() {

        Map<Integer, Patient> dataMap = new LinkedHashMap<>();

        String File = "./data.csv";
        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader(File));
            //Skipping the header line of the file
            br.readLine();

            while ((line = br.readLine()) != null) {

            // Use comma as separator
            String[] values = line.split(",");

            // Parsing the data values
            int id = Integer.parseInt(values[0]);
            char diagnosis = values[1].charAt(0);
            double radius_mean = Double.parseDouble(values[2]);
            double texture_mean = Double.parseDouble(values[3]);
            double perimeter_mean = Double.parseDouble(values[4]);
            double area_mean = Double.parseDouble(values[5]);
            double smoothness_mean = Double.parseDouble(values[6]);
            double compactness_mean = Double.parseDouble(values[7]);
            double concavity_mean = Double.parseDouble(values[8]);
            double concave_points_mean = Double.parseDouble(values[9]);
            double symmetry_mean = Double.parseDouble(values[10]);
            double fractal_dimension_mean = Double.parseDouble(values[11]);

            // Creating a Patient object and adding it to the map
            Patient patient = new Patient(id, diagnosis, radius_mean, texture_mean,
                    perimeter_mean, area_mean, smoothness_mean, compactness_mean,
                    concavity_mean, concave_points_mean, symmetry_mean, fractal_dimension_mean);

            dataMap.put(id,patient);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataMap;
    }
}