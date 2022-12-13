package Ex2;

public class Main {
    public static void main(String[] args){
    Info director = new Director();
    director.printJob();
    Info worker =  new Worker();
    worker.printJob();
    Info accountant = new Accountant();
    accountant.printJob();
}
}
