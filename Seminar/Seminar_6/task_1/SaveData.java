package Seminar.Seminar_6.task_1;

class SaveData {
    Employee worker;
    int id;

    public void savaData(int id, Employee worker) {
        // Сохранение данных сотрудника в базу данных
        worker.getName();
        worker.getSalary();
        id++;
    }
}

class SaveData2<T> {
    T dada;

    public void savaData(T dada) {
        // Сохранение данных сотрудника в базу данных
    }
}
