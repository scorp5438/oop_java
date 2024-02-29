package Seminar.Seminar_3.task_DZ;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowIterator implements Iterator<Group> {
    private ArrayList<Group> groups;
    private int count;

    public FlowIterator(ArrayList<Group> groups) {
        this.groups = groups;
    }

    @Override
    public boolean hasNext() {
        return count < groups.size();
    }

    @Override
    public Group next() {
        return groups.get(count++);
    }
}
