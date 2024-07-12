public class Patient {

    // Attributes for the Patient Class
    private int id;
    private char diagnosis;

    private double radius_mean = 0;
    private double texture_mean = 0;
    private double perimeter_mean = 0;
    private double area_mean = 0;
    private double smoothness_mean = 0;
    private double compactness_mean = 0;
    private double concavity_mean = 0;
    private double concave_points_mean = 0;
    private double symmetry_mean = 0;
    private double fractal_dimension_mean = 0;

    // Constructor to initialize the attributes
    public Patient(int id, char diagnosis,
                   double radius_mean, double texture_mean,
                   double perimeter_mean, double area_mean,
                   double smoothness_mean, double compactness_mean,
                   double concavity_mean, double concave_points_mean,
                   double symmetry_mean, double fractal_dimension_mean)
    {
        this.id = id;
        this.diagnosis = diagnosis;
        this.radius_mean = radius_mean;
        this.texture_mean = texture_mean;
        this.perimeter_mean = perimeter_mean;
        this.area_mean = area_mean;
        this.smoothness_mean = smoothness_mean;
        this.compactness_mean = compactness_mean;
        this.concavity_mean = concavity_mean;
        this.concave_points_mean = concave_points_mean;
        this.symmetry_mean = symmetry_mean;
        this.fractal_dimension_mean = fractal_dimension_mean;
    }

    // Getter method for ID
    public int getId() {
        return id;
    }

    // Getter method for diagnosis
    public char getDiagnosis() {
        return diagnosis;
    }

    // Method to get all attributes as an array
    public double[] getAttributes(){
        return new double[]{
                radius_mean, texture_mean, perimeter_mean, area_mean, smoothness_mean,
                compactness_mean, concavity_mean, concave_points_mean, symmetry_mean, fractal_dimension_mean};

    }
}