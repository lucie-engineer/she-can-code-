public class student {


        int id;
        String name;
        int age;
        double score;

        // Constructor: this creates a student with data
        public student(int id, String name, int age, double score) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.score = score;
        }

        // This controls how a student prints
        @Override
        public String toString() {
            return id + " " + name + " " + age + " " + score;
        } }



