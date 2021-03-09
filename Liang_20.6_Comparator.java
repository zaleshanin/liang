import java.util.Comparator;

public class GeometricObjectComparator
    implements Comparator<GeometricObject>, java.io.Serializable {
    public int compare(GeometricObject o1, GeometricObject o2) {
        double area1 = o1.getArea();
        double area2 = o2.getArea();
        if (area1 < area2)
            return −1;
        else if (area1 == area2)
            return 0;
        else
            return 1;
    }
}

public class TestComparator {
    public static void main(String[] args) {
    GeometricObject g1 = new Rectangle(5, 5);
    GeometricObject g2 = new Circle(5);

    GeometricObject g =
        max(g1, g2, new GeometricObjectComparator());
        /*
        max(g1, g2, (o1, o2) −> o1.getArea() > o2.getArea() ?
        1 : o1.getArea() == o2.getArea() ? 0 : −1);
        */
    System.out.println("The area of the larger object is " + g.getArea());
}
public static GeometricObject max(GeometricObject g1,
    GeometricObject g2, Comparator<GeometricObject> c) {
    if (c.compare(g1, g2) > 0)
        return g1;
    else
        return g2;
    }
}

/////////////////////////////////////
public class SortStringByLength {
    public static void main(String[] args) {
        String[] cities = {"Atlanta", "Savannah", "New York", "Dallas"};
        java.util.Arrays.sort(cities, new MyComparator());
        /*
        java.util.Arrays.sort(cities, (s1, s2) −> {return s1.length() − s2.length();});
        */
        /*
        java.util.Arrays.sort(cities, (s1, s2) −> s1.length() − s2.length());
         */
        //java.util.Arrays.sort(cities, Comparator.comparing(String::length));
        for (String s : cities) {
            System.out.print(s + " ");
        }
    }
    public static class MyComparator implements
        java.util.Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return s1.length() − s2.length();
        }
    }
}

///////////////////////////////////
public class SortStringIgnoreCase {
    public static void main(String[] args) {
        java.util.List<String> cities = java.util.Arrays.asList
        ("Atlanta", "Savannah", "New York", "Dallas");
        cities.sort((s1, s2) −> s1.compareToIgnoreCase(s2));
        //cities.sort(String::compareToIgnoreCase);
        for (String s: cities) {
            System.out.print(s + " ");
        }
    }
}

/////////////////
//lambda expretion
Comparator.comparing(e −> e.length());
//metod reference
Comparator.comparing(String::length);
//anonymous inner class
Comparator.comparing(
    new java.util.function.Function<String, Integer>() {
        public Integer apply(String s) {
            return s.length();
        }
    }
)
// comparing returns a Comparator
public static Comparator<String> comparing(Function<String, Integer> f) {
    return (s1, s2) −> f.apply(s1).compareTo(f.apply(s2));
}

// thenComparing
Loan[] list = {new Loan(5.5, 10, 100), new Loan(5, 10, 1000)};
Arrays.sort(list, Comparator.comparing(Loan::getLoanAmount)
    .thenComparing(Loan::getAnnualInterestRate));
//reverse
Arrays.sort(list, Comparator.comparing(Loan::getLoanAmount)
    .reverse());
