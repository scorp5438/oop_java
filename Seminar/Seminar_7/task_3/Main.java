package Seminar.Seminar_7.task_3;

public class Main {

    public static void main(String[] args) {
        OldDocument od = new OldDocument();
        DocumentAdapter da = new DocumentAdapter(od);

        da.open();
        da.close();
    }
}
