package Seminar.Seminar_3.task_DZ;

import java.util.Comparator;

public class FlowComparator implements Comparator<Flow> {

    @Override
    public int compare(Flow o1, Flow o2) {
        return o1.getCountGroups().compareTo(o2.getCountGroups());
    }

}
