import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Map<String, Integer> pillows = new HashMap<>();



        Student student1 = new Student("Иванов", 8, true);
        Student student2 = new Student("Петров", 10, false);
        Student student3 = new Student("Сидоров", 12, true);
        Student student4 = new Student("Чапаев", 20, false);
        Student student5 = new Student("Баранов", 15, true);


        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        pillows.put("Уголь", 100000);
        pillows.put("Аспирин", 10);
        pillows.put("Зеленка", 100);

        CompareByAge compareByAge = new CompareByAge();
        CompareByIllness compareByIllness = new CompareByIllness();

        for (Student student : students) {
            System.out.println(student.getName());
        }
        System.out.println("______________________________________");
        students.sort(compareByAge);
        for (Student student : students) {
            System.out.println(student.getName());
        }
        System.out.println("______________________________________");
        students.sort(compareByIllness);
        for (Student student : students) {
            System.out.println(student.isIllness());
        }
        System.out.println("______________________________________");


        Iterator<Student> studentIterator = students.iterator();


        while ((studentIterator.hasNext())){
            System.out.println(studentIterator.hasNext());
            if(studentIterator.hasNext() == true)
                studentIterator.remove(); // Выдаёт ошибку
        }


        Nurse nurse = new Nurse(students, pillows);

        nurse.goToCheckup(nurse.getStudents());
    }

}
