import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lst = new CycleList<>();
        lst.add("block21");
        lst.add("block2");
        lst.add("block1");

        System.out.println(lst.get(1));
        System.out.println(lst.size());
        System.out.println(lst.remove(0));
        System.out.println(lst.size());
    }
}
