package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Действие: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error comp1 = new Error(true, 13, "Check complied");
        comp1.printInfo();
        Error comp2 = new Error(false, 7, "Check don,t complied");
        comp2.printInfo();
        Error comp3 = new Error(true, 3, "This check complied");
        comp3.printInfo();

    }

}
