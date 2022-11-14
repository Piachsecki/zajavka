package StringBuilder;

public class Main {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        String s2 = new String("a");

        for (int i = 0; i < 1500; i++) {
            s2+="b";
        }
        System.out.println(s2);

        s1.append("HEllo");
        System.out.println(s1);
        s1.append(" World");
        System.out.println(s1);
    }
}
