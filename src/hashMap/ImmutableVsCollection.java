package hashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ImmutableVsCollection {
    private final Set<String> someSet;

    public ImmutableVsCollection(Set<String> someSet) {
        this.someSet = new HashSet<>(someSet);
    }

    public Set<String> getSomeSet() {
        return someSet;
    }

    public ImmutableVsCollection(String element1, String element2) {
        Set<String> temp = new HashSet<>();
        temp.add(element1);
        temp.add(element2);
        this.someSet = temp;
    }


    @Override
    public String toString() {
        return "ImmutableVsCollection{" +
                "someSet=" + someSet +
                '}';
    }

    public static void main(String[] args) {
        Set<String> myList = new HashSet<>();
        myList.add("element1");
        myList.add("element2");
        myList.add("element3");
        myList.add("element4");
        myList.add("element5");
        ImmutableVsCollection example1 = new ImmutableVsCollection(myList);

        System.out.println(example1);
        System.out.println();
        myList.add("element6");
        System.out.println(example1);
    }
}
