import java.util.ArrayList;

public class CollectionApp {
    public static void main(String[] args) {
        ArrayList<String> lessons = new ArrayList<String>();
        lessons.add("JavaProgramming");
        lessons.add("Maths");
        lessons.add("English");
        lessons.add(1, "Италия");

        System.out.println(lessons.get(1));
        lessons.set(1, "Informatics");

        System.out.printf("В списке %d элементов \n", lessons.size());

        System.out.println(lessons);

        if(lessons.contains("Maths")){

            System.out.println("Список содержит предмет Maths");
        }
        lessons.remove("Maths");
        lessons.remove(0);
        Object[] countries = lessons.toArray();
        for(Object subjects : countries){

            System.out.println(lessons);
        }
    }
}
