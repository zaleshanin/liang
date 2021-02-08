public class GenericStack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    public int getSize() {
        return list.size();
    } 

    public E peek() {
        return list.get(getSize() − 1);
    }
    
    public void push(E o) {
        list.add(o);
    }
    
    public E pop() {
        E o = list.get(getSize() − 1);
        list.remove(getSize() − 1);
        return o;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}

GenericStack<String> stack1 = new GenericStack<>();
stack1.push("London");
stack1.push("Paris");
stack1.push("Berlin");

GenericStack<Integer> stack2 = new GenericStack<>();
stack2.push(1); // autoboxing 1 to new Integer(1)
stack2.push(2);
stack2.push(3);

/*   Generic Methods   */
public class GenericMethodDemo {
    public static <E> void print(E[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}

Integer[] integers = {1, 2, 3, 4, 5};
String[] strings = {"London", "Paris", "New York", "Austin"};
GenericMethodDemo.<Integer>print(integers);
GenericMethodDemo.<String>print(strings);
/*
//or simply invoke it as follows:
print(integers);
print(strings); 
*/

/** Sort an array of comparable objects */
public static <E extends Comparable<E>> void sort(E[] list) {
    E currentMin;
    int currentMinIndex;

    for (int i = 0; i < list.length − 1; i++) {
        // Find the minimum in the list[i+1..list.length−2]
        currentMin = list[i];
        currentMinIndex = i;
        for (int j = i + 1; j < list.length; j++) {
            if (currentMin.compareTo(list[j]) > 0) {
                currentMin = list[j];
                currentMinIndex = j;
            }
        }
        // Swap list[i] with list[currentMinIndex] if necessary;
        if (currentMinIndex != i) {
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
        }
    }
}
/*
A wildcard generic type has three forms: ?,
? extends T , and ? super T , where
T is a generic type. The first form, ? , called an unbounded wildcard, is the same as ?
extends Object . The second form, ? extends T , called a bounded wildcard, rep-
resents T or a subtype of T . The third form, ? super T , called a lower bound wildcard,
denotes T or a supertype of T .
*/

public static <T> void add(GenericStack<T> stack1,
    GenericStack<? super T> stack2) {
    while (!stack1.isEmpty())
    stack2.push(stack1.pop());
}
/*
public static <T> void add(GenericStack<? extends T> stack1,
GenericStack<T> stack2)
*/
