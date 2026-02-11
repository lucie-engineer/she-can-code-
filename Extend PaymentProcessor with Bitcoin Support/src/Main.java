<<<<<<< HEAD
public class Main {
    public static void main(String[] args){

PaymentProcessor processor = new PaymentProcessor();

CreditCard creditCard= new CreditCard();
Paypal paypal= new Paypal();
Bitcoin bitcoin= new Bitcoin("BTC-Trans-123");

        System.out.println("\nChoosing  to pay with Credit card:");
processor.processPayment(creditCard);
        System.out.println("\nChoosing to pay with paypal:");
processor.processPayment(paypal);
        System.out.println("\nChoosing to pay with Bitcoin:");
processor.processPayment(bitcoin);
    }
}
=======
import javax.xml.namespace.QName;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;


public class Main {
    public static void main(String[] args){
        System.out.println("Running from: " + new File(".").getAbsolutePath());


        List<student>students= new ArrayList<>();


        try{
            File file = new File("C:\\Users\\HP\\IdeaProjects\\student record management system\\student.txt");
            BufferedReader buff = new BufferedReader(new FileReader(file));
            String line;
            while((line=buff.readLine()) !=null){
                String[]parts =line.split(",");
                int id =Integer.parseInt(parts[0].trim());
                String name =parts[1].trim();
                int age =Integer.parseInt(parts[2].trim());
                double score =Double.parseDouble(parts[3].trim());
                students.add(new student(id,name, age, score));
            }
            buff.close();
            System.out.println("we have added " +students.size()+ "students from the file");}
        catch (FileNotFoundException e){
            System.out.println("the file you are trying to find is not found, please try again!");
        }
        catch (IOException e){
            System.out.println("error reading file" + e.getMessage());
        }
        catch (Exception e){
            System.out.println("invalid data format, it have to be like : id,name,age,score");
        }
        System.out.println("--------STUDENT LIST-------");
        for (student s:students){
            System.out.println(s);
        }
        double totalScore =0;
        for (student s :students){
            totalScore += s.score;
        }
        double average = totalScore / students.size();
        System.out.println("Average score="+ String.format("%.2f", average));

        student topStudent = students.get(0);
        for (student s : students){
            if (s.score >topStudent.score){
                topStudent = s;
            }
        }
        System.out.println("Top student:" + topStudent.name +"("+ topStudent.score+")");
        student lowestStudent = students.get(0);
        for (student s : students){;
            if (s.score< lowestStudent.score){
                lowestStudent= s;
            }
        }
        System.out.println("Lowest student: "+ lowestStudent.name + "("+lowestStudent.score+")");

        System.out.println("Students who passed:");
        for (student s :students){
            if (s.score>=60){
                System.out.println(s.name +"-"+ s.score);}}

        System.out.println("students who failed:");
        boolean hasFailed = false;
        for( student s : students){
            if(s.score<60){
                System.out.println(s.name+"-"+s.score);
                hasFailed= true;
            }
        }
             if (!hasFailed){
                 System.out.println("None");
             }
            }
        }

>>>>>>> 67ad3ecc872ad5112996dd084f0e64dfc89233fd
