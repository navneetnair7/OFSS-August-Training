import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        TreeSet<Element> table = new TreeSet<Element>();

        Element e1 = new Element(1);
        Element e2 = new Element(2);
        Element e3 = new Element(3);
        Element e4 = new Element(4);
        Element e5 = new Element(5);
        Element e6 = new Element(6);
        Element e7 = new Element(7);

        table.add(e1);
        table.add(e2);
        table.add(e3);
        table.add(e4);
        table.add(e5);
        table.add(e6);
        table.add(e7);

        Iterator<Element> it = table.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}

class Element implements Comparable {
    int atomicNumber;

    public Element(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    @Override
    public String toString() {
        return "Element{" +
                "atomicNumber=" + atomicNumber +
                '}';
    }

    public int compareTo(Object obj) {
        Element e = (Element)obj;
        if(atomicNumber < e.atomicNumber) return -1;
        if(atomicNumber > e.atomicNumber) return 1;
        return 0;
    }
}