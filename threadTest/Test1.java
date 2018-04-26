package threadTest;

public class Test1 {



    public static void main(String[] args) {
        Resource resource = new Resource();
        Thread t1 = new Thread(new Input(resource));
        Thread t2 = new Thread(new Output(resource));
        t1.start();
        t2.start();


    }
}
