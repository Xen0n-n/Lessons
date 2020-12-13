public class Main {
    public static void main(String[] args) {
        BoundedWaitList<String> BWLIST = new BoundedWaitList<>(10);
        BWLIST.add("element");
        BWLIST.add("element2");
        BWLIST.add("element3");
        System.out.println(BWLIST);
        BWLIST.remove();
        System.out.println(BWLIST);

        UnfairWaitList<String> UWLIST = new UnfairWaitList<>();
        UWLIST.add("element");
        UWLIST.add("element2");
        UWLIST.add("element3");
        UWLIST.add("element4");
        UWLIST.add("element5");
        System.out.println(UWLIST);
        UWLIST.moveToBack();
        System.out.println(UWLIST);
        UWLIST.remove("element3");
        System.out.println(UWLIST);
        System.out.println(UWLIST.contains("element2"));
    }
}
