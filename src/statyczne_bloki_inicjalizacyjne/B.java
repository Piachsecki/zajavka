package statyczne_bloki_inicjalizacyjne;

import jdk.swing.interop.SwingInterOpUtils;

public class B extends A{
    static String staticField1ClassB;
    static String staticField2ClassB = methodInit();
    private String nonStaticField1ClassB;
    private String nonStaticField3ClassB = method_nonStaticInit();

    static {
        System.out.println("Statyczny blok inicjalizacyjny 1");
        staticField1ClassB = " staticField1ClassB";
    }

    {
        System.out.println("NIEStatyczny blok inicjalizacyjny 1");
        nonStaticField1ClassB = "nonStaticField1ClassB";
    }
    static {
        System.out.println("Statyczny blok inicjalizacyjny 2");
        staticField2ClassB = " staticField2ClassB";
    }


    public B(String nonStaticField1ClassA, String nonStaticField3ClassA, String nonStaticField1ClassB, String nonStaticField3ClassB) {
        super(nonStaticField1ClassA, nonStaticField3ClassA);
        this.nonStaticField1ClassB = nonStaticField1ClassB;
        this.nonStaticField3ClassB = nonStaticField3ClassB;
        System.out.println("CONSTRUCTOR B CALLED");
    }

    private String method_nonStaticInit() {
        System.out.println("method initializing - nonstaticField3ClassB");
        return "method initializing - nonstaticField3ClassB";

    }


    private static String methodInit() {
        System.out.println("method initializing - staticField2ClassB");
        return "method initializing - staticField2ClassB";
    }

}
