import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// StudentManager class
class StudentManager {

    // Add student
    public void addStudent(Map<Integer, String> students, Integer studentId, String name) {
        try {
            if (studentId == null || studentId <= 0) {
                throw new IllegalArgumentException("Student ID cannot be negative or zero!");
            }
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Student name cannot be null or empty!");
            }
            students.put(studentId, name);
            System.out.println("Student added: ID = " + studentId + ", Name = " + name);
        } catch (NullPointerException e) {
            System.out.println("Error: Null key or value not allowed!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Sort students by ID using TreeMap
    public Map<Integer, String> sortStudents(Map<Integer, String> students) {
        TreeMap<Integer, String> sorted = new TreeMap<>(students);
        System.out.println("Students sorted by ID: " + sorted);
        return sorted;
    }

    // Search student by ID
    public void searchStudent(Map<Integer, String> students, Integer studentId) {
        try {
            if (students.containsKey(studentId)) {
                System.out.println("Student found: ID = " + studentId + ", Name = " + students.get(studentId));
            } else {
                System.out.println("Student not found with ID = " + studentId);
            }
        } catch (NullPointerException e) {
            System.out.println("Error: Null key not allowed!");
        }
    }

    // Remove student by ID
    public void removeStudent(Map<Integer, String> students, Integer studentId) {
        try {
            if (students.containsKey(studentId)) {
                String name = students.remove(studentId);
                System.out.println("Student removed: ID = " + studentId + ", Name = " + name);
            } else {
                System.out.println("Student not found with ID = " + studentId);
            }
        } catch (NullPointerException e) {
            System.out.println("Error: Null key not allowed!");
        }
    }

    // Find student with highest ID
    public void findStudentWithHighestId(Map<Integer, String> students) {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        Integer maxId = null;
        for (Integer id : students.keySet()) {
            if (maxId == null || id > maxId) maxId = id;
        }
        System.out.println("Student with highest ID: ID = " + maxId + ", Name = " + students.get(maxId));
    }

    // Find student with lowest ID
    public void findStudentWithLowestId(Map<Integer, String> students) {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        Integer minId = null;
        for (Integer id : students.keySet()) {
            if (minId == null || id < minId) minId = id;
        }
        System.out.println("Student with lowest ID: ID = " + minId + ", Name = " + students.get(minId));
    }
}
