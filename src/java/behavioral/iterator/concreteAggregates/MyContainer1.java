package behavioral.iterator.concreteAggregates;

import behavioral.iterator.Aggregate;
import behavioral.iterator.Iterator;

public class MyContainer1 implements Aggregate {
    private String[] names = new String[5];
    public MyContainer1(){
        names[0] = "Gleb";
        names[1] = "Nastya";
        names[2] = "Anya";
        names[3] = "Yan";
        names[4] = "John";
    }
    @Override
    public Iterator getIterator() {
        return new Iter();
    }
    private class Iter implements Iterator{
        int cursor=0;
        @Override
        public boolean hasNext() {
            return names.length > cursor;
        }

        @Override
        public Object next() {
            return names[cursor++];
        }

    }
}
