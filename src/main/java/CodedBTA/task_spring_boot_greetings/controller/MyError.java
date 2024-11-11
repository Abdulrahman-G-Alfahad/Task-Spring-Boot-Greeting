package CodedBTA.task_spring_boot_greetings.controller;

public class MyError implements Response{

    String message;


    public MyError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
