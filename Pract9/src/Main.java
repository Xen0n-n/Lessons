import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static ArrayList<Student> sortScore(ArrayList<Student> array) {

        if (array.equals(null)) {
            return null;
        }

        if (array.size() < 2) {
            return array;
        }

        for (int i = 0; i < array.size()-1; i++) {
            for (int j = i+1; j < array.size(); j++) {
                if (array.get(i).getScore() < array.get(j).getScore()) {
                    Collections.swap(array, i, j);
                }
            }
        }
        return array;
    }


    public static Student searchByName(ArrayList<Student> s, String name) throws StudentNotFoundException {
        Student res = null;
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).getName().equals(name)) {
                res = s.get(i);
            }
        }

        if (res == null) {
            throw new StudentNotFoundException("Student " + name + " not found");
        }
        return res;
    }



    public static void main(String[] args){
        ArrayList<Student> Students = new ArrayList<Student>();


        Students.add(new Student("Petya", 90));
        Students.add(new Student("Vasya", 76));
        Students.add(new Student("Nastya", 84));
        Students.add(new Student("Anna", 64));
        Students.add(new Student("Podpivasnik", 27));

        System.out.println(sortScore(Students));

        try{
            System.out.println(searchByName(Students, "Leha" ));
        }   catch (Exception e) {
            System.err.println(e);
        }
    }
}

