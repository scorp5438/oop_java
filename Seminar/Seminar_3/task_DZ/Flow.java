package Seminar.Seminar_3.task_DZ;

import java.util.ArrayList;
import java.util.Iterator;

public class Flow implements Comparable<Flow>, Iterable<Group> {
    private Integer countGroups;
    private ArrayList<Group> groups;

    public Flow(ArrayList<Group> groups) {
        this.groups = groups;
        this.countGroups = this.groups.size();
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public void setCountGroups(Integer countGroups) {
        this.countGroups = groups.size();
        ;
    }

    public Integer getCountGroups() {
        return groups.size();
    }

    @Override
    public int compareTo(Flow o) {
        return this.countGroups.compareTo(o.getCountGroups());
    }

    @Override
    public Iterator<Group> iterator() {
        return new FlowIterator(groups);
    }

    @Override
    public String toString() {
        return String.format("Количество групп в потоке %d", countGroups);
    }

}
