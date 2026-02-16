
class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

// GradeManager class
class GradeManager {
    private double[] grades;
    private int count;

    // Constructor with size of the grades array
    public GradeManager(int size) {
        grades = new double[size];
        count = 0;
    }

    // Add a grade
    public void addGrade(double grade) throws InvalidGradeException {
        if (grade < 0 || grade > 100) {
            throw new InvalidGradeException("Invalid grade: " + grade + ". Must be between 0 and 100.");
        }
        if (count >= grades.length) {
            throw new ArrayIndexOutOfBoundsException("Grade array is full. Cannot add more grades.");
        }
        grades[count++] = grade;
        System.out.println("Grade added: " + grade);
    }

    // Calculate average
    public double calculateAverage() {
        if (count == 0) return 0;
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += grades[i];
        }
        return sum / count;
    }

    // Find highest grade
    public double findHighest() {
        if (count == 0) return 0;
        double max = grades[0];
        for (int i = 1; i < count; i++) {
            if (grades[i] > max) max = grades[i];
        }
        return max;
    }

    // Find lowest grade
    public double findLowest() {
        if (count == 0) return 0;
        double min = grades[0];
        for (int i = 1; i < count; i++) {
            if (grades[i] < min) min = grades[i];
        }
        return min;
    }

    // Sort grades ascending
    public void sortGrades() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (grades[i] > grades[j]) {
                    double temp = grades[i];
                    grades[i] = grades[j];
                    grades[j] = temp;
                }
            }
        }
        System.out.println("Grades sorted.");
    }

    // Search for a specific grade
    public int searchGrade(double grade) {
        for (int i = 0; i < count; i++) {
            if (grades[i] == grade) return i;
        }
        return -1; // Not found
    }

    // Print all grades
    public void printGrades() {
        System.out.print("Grades: ");
        for (int i = 0; i < count; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println();
    }
}


public class Main {
    public static void main(String[] args) {
        GradeManager manager = new GradeManager(10);

        try {
            manager.addGrade(85);
            manager.addGrade(92);
            manager.addGrade(78);
            manager.addGrade(101); // Invalid grade
        } catch (InvalidGradeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting to add grades.\n");
        }

        manager.printGrades();

        System.out.println("Average grade: " + manager.calculateAverage());
        System.out.println("Highest grade: " + manager.findHighest());
        System.out.println("Lowest grade: " + manager.findLowest());

        manager.sortGrades();
        manager.printGrades();

        double gradeToSearch = 92;
        int index = manager.searchGrade(gradeToSearch);
        if (index != -1) {
            System.out.println("Grade " + gradeToSearch + " found at index: " + index);
        } else {
            System.out.println("Grade " + gradeToSearch + " not found.");
        }

        // Test ArrayIndexOutOfBoundsException
        try {
            manager.addGrade(88);
            manager.addGrade(75);
            manager.addGrade(90);
            manager.addGrade(80);
            manager.addGrade(77);
            manager.addGrade(69);
            manager.addGrade(95); // This should trigger array full
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
