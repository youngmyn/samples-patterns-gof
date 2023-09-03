package behavioral.iterator.concreteAggregates;

import behavioral.iterator.Aggregate;
import behavioral.iterator.Iterator;
import behavioral.iterator.MyTask;

import java.util.Arrays;
import java.util.Comparator;

public class MyContainer2 implements Aggregate {
    private MyTask[] tasks=new MyTask[3];

    public MyContainer2() {
        tasks[0] = new MyTask("Do the homework");
        tasks[1] = new MyTask("Find some money and buy a food", 9);
        tasks[2]= new MyTask("Clean the house", 3);

    }

    @Override
    public Iterator getIterator() {
        return new PriorityIterator();
    }
    private class PriorityIterator implements Iterator{
        int cursor = 0;
        public PriorityIterator() {
            Arrays.sort(tasks, new Comparator<MyTask>() {
                @Override
                public int compare(MyTask o1, MyTask o2) {
                    return o2.getPriority()- o1.getPriority();
                }
            });
        }
        @Override
        public boolean hasNext() {
            return tasks.length > cursor;
        }

        @Override
        public Object next() {
            return tasks[cursor++];
        }
    }
}
