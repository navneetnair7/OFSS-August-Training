public class GenericTest {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("Swapped");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("----------------------------");
        AnyPair<Integer> pair = new AnyPair<Integer>(10, 20);
        pair.print();
        pair.swap();
        pair.print();

        AnyPair<String> pair2 = new AnyPair<String>("Good", "Morning");
        pair2.print();
        pair2.swap();
        pair2.print();
    }
}

class AnyPair<T> {
    T x;
    T y;

    AnyPair(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public void swap() {
        System.out.println("Swapping..");
        T temp = x;
        x = y;
        y = temp;
        System.out.println("Swap Complete");
    }

    public void print() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
