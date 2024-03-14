package Seminar.Seminar_7.task_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MessageDecorator implements Message {
    Message mess;
    LocalDateTime currentDateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    String formattedDateTime = currentDateTime.format(formatter);

    public MessageDecorator(Message mess) {
        this.mess = mess;
    }

    @Override
    public void sendMess() {
        mess.sendMess();
        System.out.println(formattedDateTime);
    }

}
