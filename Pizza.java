
class Pizza {

    String base;
    String top1;
    String top2;
    String top3;

    Pizza(String b, String t1, String t2, String t3) {
        System.err.println("250");

    }

    Pizza(String b, String t1, String t2) {
        System.err.println("200");
    }

    Pizza(String b, String t1) {
        System.err.println("150");

    }

    Pizza(String b) {
        System.err.println("100");

    }

    public static void main(String[] args) {
        Pizza p1 = new Pizza("wheat", "panner", "mushroom");
        Pizza p2 = new Pizza("wheat", "panner");
        Pizza p3 = new Pizza("wheat");

    }

}
