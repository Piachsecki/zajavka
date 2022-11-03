package statyczne_bloki_inicjalizacyjne;

public class A {
    static String staticField1ClassA;
    static String staticField2ClassA = methodInit();

    static {
        System.out.println("Statyczny blok inicjalizacyjny 1");
        staticField1ClassA = " staticField1ClassA";
    }

    static {
        System.out.println("Statyczny blok inicjalizacyjny 2");
        staticField2ClassA = " staticField2ClassA";
    }

    private String nonStaticField1ClassA;
    private String nonStaticField3ClassA = method_nonStaticInit();

    {
        System.out.println("NIEStatyczny blok inicjalizacyjny 1");
        nonStaticField1ClassA = "nonStaticField1ClassA";
    }

    public A(String nonStaticField1ClassA, String nonStaticField3ClassA) {
        System.out.println("CONSTRUCTOR A CALLED");
        this.nonStaticField1ClassA = nonStaticField1ClassA;
        this.nonStaticField3ClassA = nonStaticField3ClassA;
    }

    private static String methodInit() {
        System.out.println("method initializing - staticField2ClassA");
        return "method initializing - staticField2ClassA";
    }

    private String method_nonStaticInit() {
        System.out.println("method initializing - nonstaticField3ClassA");

        return "method initializing - nonstaticField3ClassA";

    }
}
